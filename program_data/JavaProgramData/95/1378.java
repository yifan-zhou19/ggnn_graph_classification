import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		String str1 = new String(new char[80]); //?????????
		String str2 = new String(new char[80]);
		int i;
		str1 = new Scanner(System.in).nextLine(); //???????
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < str1.length();i++)
		{
			if ((int)str1.charAt(i) > 64 && (int)str1.charAt(i) < 91)
			{
				str1.charAt(i) += 32; //????????????
			}
		}
		for (i = 0;i < str2.length();i++)
		{
			if ((int)str2.charAt(i) > 64 && (int)str2.charAt(i) < 91)
			{
				str2.charAt(i) += 32; //????????????
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		else
		{
			System.out.print("=");
			System.out.print("\n");
		}

		return 0;
	}
}
