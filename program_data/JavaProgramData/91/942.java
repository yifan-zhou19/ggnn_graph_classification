import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************???????????*******************
	//************???????**************************
	//************???1200062701************************
	//************?????2012?12?5?******************

	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Character.SIZE / Byte.SIZE));
		int x = 0;
		a = new Scanner(System.in).nextLine();
		for (int i = 0; a.charAt(i) != 0; i++)
		{
			x++; // put down the number of its weishu
		}
		for (int j = 0; j + 1 < x; j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j) + a.charAt(j + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, x - 1, a.charAt(x - 1) + a.charAt(0));
		for (int i = 0; b.charAt(i) != 0; i++)
		{
			System.out.print(b.charAt(i));
		}
		return 0;
	}

}

