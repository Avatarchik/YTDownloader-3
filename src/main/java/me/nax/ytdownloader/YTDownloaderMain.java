
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Matt Neundorf [Naxmeify] <matt@nax.me>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.nax.ytdownloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ResourceBundle;

/**
 * Created by Matt Neundorf [Naxmeify] on 16.03.14.
 */

public class YTDownloaderMain extends Application {

    private static final Logger log = LoggerFactory.getLogger(YTDownloaderMain.class);

    private static final String kMainViewFXML = "/fxml/MainView/MainView.fxml";
    private static final String kMainViewResources = "fxml.MainView.MainView";

    private static final String kAlertDialogFXML = "/fxml/AlertDialog/AlertDialog.fxml";
    private static final String kAlertDialogResources = "fxml.AlertDialog.AlertDialog";

    private static Stage stage;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage primStage) throws Exception {
        stage = primStage;

        log.info("Starting JavaFX and Maven application");

        log.debug("Loading MainView FXML from: {}", kMainViewFXML);
        log.debug("Loading MainView Resourcens from: {}", kMainViewResources);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResource(kMainViewFXML), ResourceBundle.getBundle(kMainViewResources));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 1000, 800);
        //scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("YTDownloader");
        stage.setScene(scene);
        stage.show();
    }

    public static void showAlert(String title, String message) {
        
    }

    public static String getkMainViewFXML() {
        return kMainViewFXML;
    }

    public static String getkMainViewResources() {
        return kMainViewResources;
    }

    public static String getkAlertDialogFXML() {
        return kAlertDialogFXML;
    }

    public static String getkAlertDialogResources() {
        return kAlertDialogResources;
    }

    public static Stage getStage() {
        return stage;
    }
}
