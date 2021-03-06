package com.ims.idpa.app;

import com.ims.cmp.Produkte;
import com.codename1.io.Preferences;
import com.codename1.ui.BrowserComponent;

/**
 *
 * @author Riccardo, Joel, Yanick, Alain
 * Version: 1.0.0
 */
public class WelcomeForm extends com.codename1.ui.Form {

    BrowserComponent browser;

    private String shop_name_token = null;
    private String consumer_key_token = null;
    private String secret_key_token = null;

    Produkte produkte = new Produkte();

    public WelcomeForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }

    public WelcomeForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_lblWelcome = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button) {
                onButtonActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("alignment:center;");
        setTitle("");
        setName("WelcomeForm");
        addComponent(gui_lblWelcome);
        addComponent(gui_Button);
        gui_lblWelcome.setPreferredSizeStr("135.44974mm 19.57672mm");
        gui_lblWelcome.setText("Willkommen");
                gui_lblWelcome.setInlineStylesTheme(resourceObjectInstance);
        gui_lblWelcome.setInlineAllStyles("font:8.0mm; alignment:center;");
        gui_lblWelcome.setName("lblWelcome");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lblWelcome.getParent().getLayout()).setInsets(gui_lblWelcome, "11.987861% auto auto auto").setReferenceComponents(gui_lblWelcome, "-1 -1 -1 1 ").setReferencePositions(gui_lblWelcome, "0.0 0.0 0.0 0.0");
        gui_Button.setPreferredSizeStr("43.650795mm 10.8465605mm");
        gui_Button.setText("Starten");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setInlineAllStyles("font:6.0mm;");
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "46.882217% auto 41.801384% auto").setReferenceComponents(gui_Button, "-1 -1 -1 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
        
        LoginForm loginForm = new LoginForm();
        IndexForm indexForm = new IndexForm();

        shop_name_token = Preferences.get("shop_name", null);
        consumer_key_token = Preferences.get("consumer_key", null);
        secret_key_token = Preferences.get("secret_key", null);

        //Check if the user is already authenticated
        if (shop_name_token == null || consumer_key_token == null || secret_key_token == null) {
            loginForm.show();
        } else {
            indexForm.show();
        }
    }

    public String getShop_name_token() {
        shop_name_token = Preferences.get("shop_name", null);
        return shop_name_token;
    }

    public String getConsumer_key_token() {
        consumer_key_token = Preferences.get("consumer_key", null);
        return consumer_key_token;
    }

    public String getSecret_key_token() {
        secret_key_token = Preferences.get("secret_key", null);
        return secret_key_token;
    }

}
