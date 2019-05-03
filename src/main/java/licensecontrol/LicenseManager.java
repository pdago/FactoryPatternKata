package licensecontrol;

public class LicenseManager {
    public static Boolean check_activation(ActivationData activation_data, LicenseData license_data) {
        Checker checker = null;
        if (license_data.type == LicenseData.Type.HARDWARE_NOCHECK) {
            checker = new CheckerNoHardware();
        }
        else if ((license_data.type == LicenseData.Type.HARDWARE_CHECK)) {
            checker = new CheckerHardware();
        }

        return checker.check(activation_data, license_data);
    }
}
