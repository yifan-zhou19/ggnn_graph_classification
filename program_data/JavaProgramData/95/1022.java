import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str1 = new String(new char[81]); //?????????
		String str2 = new String(new char[81]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 81;i++)
		{
			if (str1.charAt(i) > 96)
			{
				str1.charAt(i) -= 32;
			}
			if (str2.charAt(i) > 96)
			{
				str2.charAt(i) -= 32;
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;

	}

}
