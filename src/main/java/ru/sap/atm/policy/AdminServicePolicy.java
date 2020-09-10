package ru.sap.atm.policy;

import ru.sap.atm.model.Log;
import ru.sap.atm.model.Video;

public interface AdminServicePolicy {
    Video getVideo(Long Id);
    Log getLog(Long id);
}
