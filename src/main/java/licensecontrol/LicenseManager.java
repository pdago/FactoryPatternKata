package licensecontrol;

public class LicenseManager {
    public static Boolean check_activation(ActivationData activation_data, LicenseData license_data) {
        Checker checker = CheckerFactory.create_checker(license_data.type);

        return checker.check(activation_data, license_data);
    }
}
