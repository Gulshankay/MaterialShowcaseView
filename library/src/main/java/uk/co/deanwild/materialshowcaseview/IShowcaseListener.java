package uk.co.deanwild.materialshowcaseview;


public interface IShowcaseListener {
    void onShowcaseDisplayed(MaterialShowcaseView showcaseView);
    void onShowcaseDismissed(MaterialShowcaseView showcaseView);
    void onShowcaseSkipped(MaterialShowcaseView showcaseView);
}
