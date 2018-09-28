import java.util.*;

package <missing>;

public class GlobalMembers
{
	//?????
	//2010?11?13?
	//1000012753 ???

	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int l1;
		int l2;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		l1 = str1.length();
		l2 = str2.length();
		for (i = 0; i < l1; i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1.charAt(i) += 32;
			}
		}
		for (i = 0; i < l2; i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
			{
				str2.charAt(i) += 32;
			}
		}
		if (strcmp(str1, str2) == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(str1, str2) == -1)
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
