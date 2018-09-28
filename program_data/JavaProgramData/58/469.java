import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************
	//*?????????C????????*
	//*???1000012797                   *
	//*????:??????????      *
	//*************************************
	public static int Main() //???
	{
		final String a = "";
		int n = 0; //??
		int i = 0;
		int j = 0;
		int m = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (j = 0;j < n;j++)
		{
			count = 0;
			a = new Scanner(System.in).nextLine();
			m = a.length();
			if (a.charAt(0) == 95 || (a.charAt(0) >= 97 && a.charAt(0) <= 123) || (a.charAt(0) >= 65 && a.charAt(0) <= 91))
			{
					count += 1;
			}
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == 95 || (a.charAt(i) >= 97 && a.charAt(i) <= 123) || (a.charAt(i) >= 65 && a.charAt(i) <= 91) || (a.charAt(i) >= 48 && a.charAt(i) <= 57))
				{
					count += 1;
				}
			}
			if (count == m + 1)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}

		return 0;
	}



}

