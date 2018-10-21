import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();
		int i;
		int num = 0;

		for (i = 0;;i++)
		{
			if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') && (a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9'))
			{
				System.out.print(a.charAt(i));
			}
		   if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') && (a.charAt(i + 1) < '0' || a.charAt(i + 1)>'9'))
		   {
			   System.out.print(a.charAt(i));
			   System.out.print("\n");
		   }
			if (a.charAt(i) == 0)
			{
				break;
			}
		}




		return 0;
	}

}
