package com.company;

public class Bouquet {
    private AsianLily asianLily;
    private EasternLily easternLily;
    private WhiteRose whiteRose;
    private RedRose redRose;
    private EuropeanPeony europeanPeony;
    private JapanesePeony japanesePeony;

    public Bouquet(AsianLily asianLily, EasternLily easternLily, WhiteRose whiteRose, RedRose redRose, EuropeanPeony europeanPeony, JapanesePeony japanesePeony) {
        this.asianLily = asianLily;
        this.easternLily = easternLily;
        this.whiteRose = whiteRose;
        this.redRose = redRose;
        this.europeanPeony = europeanPeony;
        this.japanesePeony = japanesePeony;
    }

    public AsianLily getAsianLily() {
        return asianLily;
    }

    public void setAsianLily(AsianLily asianLily) {
        this.asianLily = asianLily;
    }

    public EasternLily getEasternLily() {
        return easternLily;
    }

    public void setEasternLily(EasternLily easternLily) {
        this.easternLily = easternLily;
    }

    public WhiteRose getWhiteRose() {
        return whiteRose;
    }

    public void setWhiteRose(WhiteRose whiteRose) {
        this.whiteRose = whiteRose;
    }

    public RedRose getRedRose() {
        return redRose;
    }

    public void setRedRose(RedRose redRose) {
        this.redRose = redRose;
    }

    public EuropeanPeony getEuropeanPeony() {
        return europeanPeony;
    }

    public void setEuropeanPeony(EuropeanPeony europeanPeony) {
        this.europeanPeony = europeanPeony;
    }

    public JapanesePeony getJapanesePeony() {
        return japanesePeony;
    }

    public void setJapanesePeony(JapanesePeony japanesePeony) {
        this.japanesePeony = japanesePeony;
    }
}
