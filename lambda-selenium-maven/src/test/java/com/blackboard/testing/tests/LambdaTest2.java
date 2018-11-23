package com.blackboard.testing.tests;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import com.blackboard.testing.common.LambdaBaseTest;
import com.codeborne.selenide.WebDriverRunner;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;

@Category(Test.class)
public class LambdaTest2 extends LambdaBaseTest {

    @Test
    public void GoogleCanada() {
        open("http://www.google.ca");
        screenshot("GoogleCanada"+"-home-page");
    }
    @Test
    public void Naver() {
        open("http://www.Naver.com");
        screenshot("Naver"+"-home-page");
    }
    @Test
    public void GoogleItaly() {
        open("http://www.google.it");
        screenshot("GoogleItaly"+"-home-page");
    }
    @Test
    public void Haosou() {
        open("http://www.360.cn");
        screenshot("Haosou"+"-home-page");
    }
    @Test
    public void XVideos() {
        open("http://www.xvideos.com");
        screenshot("XVideos"+"-home-page");
    }
    @Test
    public void Spotify() {
        open("http://www.spotify.com");
        screenshot("Spotify"+"-home-page");
    }
    @Test
    public void GoogleBrazil() {
        open("http://www.google.com.br");
        screenshot("GoogleBrazil"+"-home-page");
    }
    @Test
    public void MicrosoftOffice() {
        open("http://www.office.com");
        screenshot("MicrosoftOffice"+"-home-page");
    }
    @Test
    public void Microsoft() {
        open("http://www.microsoft.com");
        screenshot("Microsoft"+"-home-page");
    }
    @Test
    public void JingdongMall() {
        open("http://www.jd.com");
        screenshot("JingdongMall"+"-home-page");
    }
    @Test
    public void Facebook() {
        open("http://www.facebook.com");
        screenshot("Facebook"+"-home-page");
    }
    @Test
    public void GoogleUK() {
        open("http://www.google.co.uk");
        screenshot("GoogleUK"+"-home-page");
    }
    @Test
    public void Google() {
        open("http://www.google.com");
        screenshot("Google"+"-home-page");
    }
    @Test
    public void t_co() {
        open("http://www.t.co");
        screenshot("t_co"+"-home-page");
    }
    @Test
    public void GoogleArgentina() {
        open("http://www.google.com.ar");
        screenshot("GoogleArgentina"+"-home-page");
    }
    @Test
    public void YahooJapan() {
        open("http://www.yahoo.co.jp");
        screenshot("YahooJapan"+"-home-page");
    }
    @Test
    public void Odnoklassniki() {
        open("http://www.ok.ru");
        screenshot("Odnoklassniki"+"-home-page");
    }
    @Test
    public void Pornhub() {
        open("http://www.pornhub.com");
        screenshot("Pornhub"+"-home-page");
    }
    @Test
    public void YouTube() {
        open("http://www.youtube.com");
        screenshot("YouTube"+"-home-page");
    }
    @Test
    public void Sohu() {
        open("http://www.sohu.com");
        screenshot("Sohu"+"-home-page");
    }
    @Test
    public void Taobao() {
        open("http://www.taobao.com");
        screenshot("Taobao"+"-home-page");
    }
    @Test
    public void LinkedIn() {
        open("http://www.linkedin.com");
        screenshot("LinkedIn"+"-home-page");
    }
    @Test
    public void Yahoo() {
        open("http://www.yahoo.com");
        screenshot("Yahoo"+"-home-page");
    }
    @Test
    public void GoogleHongKong() {
        open("http://www.google.com.hk");
        screenshot("GoogleHongKong"+"-home-page");
    }
    @Test
    public void Baidu() {
        open("http://www.baidu.com");
        screenshot("Baidu"+"-home-page");
    }
    @Test
    public void VK() {
        open("http://www.vk.com");
        screenshot("VK"+"-home-page");
    }
    @Test
    public void Instagram() {
        open("http://www.instagram.com");
        screenshot("Instagram"+"-home-page");
    }
    @Test
    public void Tmall() {
        open("http://www.pages.tmall.com");
        screenshot("Tmall"+"-home-page");
    }
    @Test
    public void GoogleSpain() {
        open("http://www.google.es");
        screenshot("GoogleSpain"+"-home-page");
    }
    @Test
    public void Samsung() {
        open("http://www.samsung.com");
        screenshot("Samsung"+"-home-page");
    }
    @Test
    public void Amazon() {
        open("http://www.amazon.com");
        screenshot("Amazon"+"-home-page");
    }
    @Test
    public void WhatsApp() {
        open("http://www.whatsapp.com");
        screenshot("WhatsApp"+"-home-page");
    }
    @Test
    public void GoogleRussia() {
        open("http://www.google.ru");
        screenshot("GoogleRussia"+"-home-page");
    }
    @Test
    public void xHamster() {
        open("http://www.xhamster.com");
        screenshot("xHamster"+"-home-page");
    }
    @Test
    public void GoogleThailand() {
        open("http://www.google.co.th");
        screenshot("GoogleThailand"+"-home-page");
    }
    @Test
    public void SinaWeibo() {
        open("http://www.weibo.com");
        screenshot("SinaWeibo"+"-home-page");
    }
    @Test
    public void GoogleTurkey() {
        open("http://www.google.com.tr");
        screenshot("GoogleTurkey"+"-home-page");
    }
    @Test
    public void Wikipedia() {
        open("http://www.wikipedia.org");
        screenshot("Wikipedia"+"-home-page");
    }
    @Test
    public void Twitter() {
        open("http://www.twitter.com");
        screenshot("Twitter"+"-home-page");
    }
    @Test
    public void Sogou() {
        open("http://www.sogou.com");
        screenshot("Sogou"+"-home-page");
    }
    @Test
    public void GoogleWebLight() {
        open("http://www.googleweblight.com");
        screenshot("GoogleWebLight"+"-home-page");
    }
    @Test
    public void Reddit() {
        open("http://www.reddit.com");
        screenshot("Reddit"+"-home-page");
    }
    @Test
    public void GoogleURLShortener() {
        open("http://www.goo.gl");
        screenshot("GoogleURLShortener"+"-home-page");
    }
    @Test
    public void GooglePoland() {
        open("http://www.google.pl");
        screenshot("GooglePoland"+"-home-page");
    }
    @Test
    public void eBay() {
        open("http://www.ebay.com");
        screenshot("eBay"+"-home-page");
    }
    @Test
    public void AccuWeather() {
        open("http://www.accuweather.com");
        screenshot("AccuWeather"+"-home-page");
    }
    @Test
    public void GoogleFrance() {
        open("http://www.google.fr");
        screenshot("GoogleFrance"+"-home-page");
    }
    @Test
    public void XNXX() {
        open("http://www.xnxx.com");
        screenshot("XNXX"+"-home-page");
    }
    @Test
    public void Netflix() {
        open("http://www.netflix.com");
        screenshot("Netflix"+"-home-page");
    }
    @Test
    public void GoogleIndia() {
        open("http://www.google.co.in");
        screenshot("GoogleIndia"+"-home-page");
    }
    @Test
    public void Alipay() {
        open("http://www.alipay.com");
        screenshot("Alipay"+"-home-page");
    }
    @Test
    public void CSDN() {
        open("http://www.csdn.net");
        screenshot("CSDN"+"-home-page");
    }
    @Test
    public void Twitch() {
        open("http://www.twitch.tv");
        screenshot("Twitch"+"-home-page");
    }
    @Test
    public void SinaCorp() {
        open("http://www.sina.com.cn");
        screenshot("SinaCorp"+"-home-page");
    }
    @Test
    public void GoogleJapan() {
        open("http://www.google.co.jp");
        screenshot("GoogleJapan"+"-home-page");
    }
    @Test
    public void MSN() {
        open("http://www.msn.com");
        screenshot("MSN"+"-home-page");
    }
    @Test
    public void Mail_ru() {
        open("http://www.mail.ru");
        screenshot("Mail_ru"+"-home-page");
    }
    @Test
    public void GoogleGermany() {
        open("http://www.google.de");
        screenshot("GoogleGermany"+"-home-page");
    }
    @Test
    public void TencentQQ() {
        open("http://www.qq.com");
        screenshot("TencentQQ"+"-home-page");
    }
    @Test
    public void GoogleIndonesia() {
        open("http://www.google.co.id");
        screenshot("GoogleIndonesia"+"-home-page");
    }
    @Test
    public void Yandex() {
        open("http://www.yandex.ru");
        screenshot("Yandex"+"-home-page");
    }
    @Test
    public void GoogleAustralia() {
        open("http://www.google.com.au");
        screenshot("GoogleAustralia"+"-home-page");
    }
    @Test
    public void Shenma() {
        open("http://www.sm.cn");
        screenshot("Shenma"+"-home-page");
    }
    @Test
    public void WindowsLive() {
        open("http://www.live.com");
        screenshot("WindowsLive"+"-home-page");
    }
    @Test
    public void Bing() {
        open("http://www.bing.com");
        screenshot("Bing"+"-home-page");
    }

}