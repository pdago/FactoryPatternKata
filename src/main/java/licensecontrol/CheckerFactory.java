package licensecontrol;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class CheckerFactory {
    private static HashMap<LicenseData.Type, Callable<Checker>> checker_creators = new HashMap<LicenseData.Type, Callable<Checker>>() {
        {
            put(LicenseData.Type.HARDWARE_NOCHECK, () -> new CheckerNoHardware());
            put(LicenseData.Type.HARDWARE_CHECK, () -> new CheckerHardware());
        }
    };

    public static Checker create_checker(LicenseData.Type type) throws Exception {
        return checker_creators.get(type).call();
    }
}
