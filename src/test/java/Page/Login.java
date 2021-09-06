package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.base.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends Base {
	
protected static AppiumDriver<MobileElement> driverAppium;
	
	public Login(AppiumDriver<MobileElement> driverAppium) {
		PageFactory.initElements(new AppiumFieldDecorator(driverAppium), this);
		
					
	}
	
	


	@AndroidFindBy(id= "cl.sodimac:id/btnLogin")
	public WebElement buttonlogin;
	
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	public WebElement usuario;
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	public WebElement pass;
	
	@AndroidFindBy(id= "cl.sodimac:id/loginButton")
	public WebElement button;
	
	@AndroidFindBy(id= "cl.sodimac:id/hamburger_logo_white")
	public WebElement logohamburguesa;
	
	@AndroidFindBy(id= "cl.sodimac:id/txtVwUserName")
	public WebElement username;
	
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.Button")
	public WebElement entendido;
	
	@AndroidFindBy(id= "cl.sodimac:id/cart_count_badge_image")
	public WebElement cerrar;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void iniciarsesion() throws InterruptedException {
	
		buttonlogin.click();
		
		Thread.sleep(3000);
		
		usuario.sendKeys("aspar17_14@hotmail.com");
	
		Thread.sleep(3000);
		pass.sendKeys("Des//0467");
		
		Thread.sleep(10000);
		button.click();
		
		Thread.sleep(2000);
		cerrar.click();
		
		Thread.sleep(4000);
		logohamburguesa.click();
		
		if (username.getText().equals ("pedro"))
		{
			Assert.assertEquals (username.getText(), "pedro");
				System.out.print("Texto verificado correctamente");
    
					}
						else
								{
									System.out.print("Error de verificación de texto");
																						
								}

		
		
	
	}

	
	
	
}
