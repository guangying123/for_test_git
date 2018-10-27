package junit;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;

public class MytestClassLoad
{

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
	{
		String pathname = "F:\\–°∑…œ¿\\Myjar.jar";
		File file = new File(pathname);
		
		URL url = file.toURI().toURL();
		
		System.out.println(url);
		
		ClassLoader classLoader = new URLClassLoader(new URL[] { url });
		
		Class<?> class1 = classLoader.loadClass("junit.Calc1");
		
		Method[] methods = class1.getDeclaredMethods();
		
		Method getName = null;
		Method getValue = null;
		Object[] result = null;
		
		for (Method iMethod : methods)
		{
			System.out.println(iMethod.getName());
			
			if (iMethod.getName().equals("values"))
			{
				 result = (Object[]) iMethod.invoke(null, null);
			
				for (Object iObject : result)
				{
					System.out.println(iObject.toString());
					
					
					
				}
			}
			
			if (iMethod.getName().equals("getValue"))
			{
				getValue = iMethod;
			}
		}
		
		if (getValue != null)
		{
			for (Object iObject : result)
			{
				Object ijObject = getValue.invoke(iObject, null);
				System.out.print(iObject.toString() + "  ");
				System.out.println(ijObject.toString());	
			}	
		}
 		
	}
}
