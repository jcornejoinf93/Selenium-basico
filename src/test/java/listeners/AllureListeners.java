package listeners;

import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.TestResult;
import utilities.FileManager;
import utilities.Logs;

public class AllureListeners implements TestLifecycleListener {

    /* @Override
    public void beforeTestStop(TestResult result) {
        //TestLifecycleListener.super.beforeTestStop(result);
        Logs.debug("Before test stop de allure");
        final var status = result.getStatus();

        switch (status) {
            case BROKEN, FAILED -> FileManager.getScreenshot();
        }

    }*/
}
