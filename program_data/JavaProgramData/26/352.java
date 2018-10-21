import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*          ???????
	??????        2010.12.12       */
	public static int Main()
	{
		int count = 0;
		final String a = "";
		final String b = ""; //b???????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		a = new Scanner(System.in).nextLine(); //?????
		for (p = a; p < a + a.length(); p++)
		{
			if (*p != ' ')
			{
				*(b.Substring(count)) = *p;
				count++; //???????????
			}
			else
			{
				if (*(p - 1) != ' ')
				{
					*(b.Substring(count)) = *p;
					count++; //????????
				}
			}
		}
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}
