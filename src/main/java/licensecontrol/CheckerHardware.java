package licensecontrol;

public class CheckerHardware implements Checker {
    public Boolean check(ActivationData activation_data, LicenseData license_data) {
        if (activation_data.date.after(license_data.maximum_activation_date))
            return false;

        if (license_data.activations.size() == license_data.maximum_number_of_activations) {
            if (!license_data.activations.contains(activation_data.hardware_id))
                return false;
        }

        return true;
    }
}
