package licensecontrol;

public class LicenseManager {
    public static Boolean check_activation(ActivationData activation_data, LicenseData license_data) {
        Checker checker = CheckerFactory.create_checker(license_data.type);

        if (checker != null)
            return checker.check(activation_data, license_data);
        else
            return false;
    }
}
