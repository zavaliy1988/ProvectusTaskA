package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import utils.AbstractPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ChapterPage extends AbstractPage<ChapterPage>
{
    public SelenideElement getDivOnTheLeft()
    {
        return $("#divontheleft");
    }

    public String goToHomePage()
    {
        $x("/html/body/div[@class='mainbody']/p/a[text()='Home Page']").click();
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
