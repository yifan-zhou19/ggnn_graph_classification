import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0 ; i < 100 ; i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a.charAt(i) += 32;
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b.charAt(i) += 32;
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}


	}

}
