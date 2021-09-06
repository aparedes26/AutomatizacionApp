package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.selenium.base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;




public class SeleccionZona extends Base {

	protected static AppiumDriver<MobileElement> driverAppium;
	
	public SeleccionZona(AppiumDriver<MobileElement> driverAppium) {
		PageFactory.initElements(new AppiumFieldDecorator(driverAppium), this);
		
	}

		
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView")
	public WebElement ubicaion;
	
		
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
	public WebElement departamento;
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
	public WebElement provincia;
	
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
	public WebElement comuna;
	
	@AndroidFindBy(id= "cl.sodimac:id/confirmButton")
	public WebElement confirmacion;
	
	@AndroidFindBy(id= "cl.sodimac:id/btnRegister")
	public WebElement textmsj;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void SelectZone() throws InterruptedException {
	
		Thread.sleep(3000);
		ubicaion.click();
	
		Thread.sleep(4000);
		departamento.click();
		
		Thread.sleep(3000);
		provincia.click();
		
		Thread.sleep(3000);
		comuna.click();
		
		Thread.sleep(3000);
		confirmacion.click();
				
			if (textmsj.getText().equals ("Crear una cuenta Sodimac"))
				{
					Assert.assertEquals (textmsj.getText(), "Crear una cuenta Sodimac");
						System.out.print("Texto verificado correctamente");
            
							}
								else
										{
											System.out.print("Error de verificación de texto");
																								
										}
		
		
		
		    
	
	}

}
