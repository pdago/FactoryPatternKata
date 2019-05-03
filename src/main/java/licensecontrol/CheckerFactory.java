package licensecontrol;

public class CheckerFactory {
    public static Checker create_checker(LicenseData.Type type) {
        if (type == LicenseData.Type.HARDWARE_NOCHECK) {
            return new CheckerNoHardware();
        }
        else if ((type == LicenseData.Type.HARDWARE_CHECK)) {
            return new CheckerHardware();
        }

        throw new RuntimeException("The requested license type does not exist");
    }
}
