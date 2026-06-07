package ru.roman;

public enum Cities {
    None("",States.None),
    Dehli("//*[@id='react-select-4-option-0']",States.NCR),
    Gurgaon("//*[@id='react-select-4-option-1']",States.NCR),
    Noida("//*[@id='react-select-4-option-2']",States.NCR),
    Agra("//*[@id='react-select-4-option-0']",States.UTTARPRADESH),
    Lucknow("//*[@id='react-select-4-option-1']",States.UTTARPRADESH),
    Merrut("//*[@id='react-select-4-option-2']",States.UTTARPRADESH);

    String selector;
    States state;
    Cities(String selector,States state){
        this.state = state;
        this.selector = selector;
    }

    public States getState() {
        return state;
    }

    public String getSelector() {
        return selector;
    }
}
