package licensecontrol;

public class CheckerNoHardware implements Checker {
    public Boolean check(ActivationData activation_data, LicenseData license_data) {
        if (activation_data.date.after(license_data.maximum_activation_date))
            return false;

        return true;
    }
}
