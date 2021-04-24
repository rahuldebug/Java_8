package Default.Interface.AppTest;

import com.java8.interfaces.DefaultInterfaces;
import com.java8.interfaces.DefaultInterfaces2;

public class DefaultAppTest implements DefaultInterfaces, DefaultInterfaces2 {

	public static void main(String[] args) {
		DefaultAppTest obj = new DefaultAppTest();
		obj.startCar();
	}

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		DefaultInterfaces.super.startCar();
		//Since there is same name default methods we have to specify which default method we have to use 
		//had it been only one default method we need to over ride it , it would have taken default 
	}

}
