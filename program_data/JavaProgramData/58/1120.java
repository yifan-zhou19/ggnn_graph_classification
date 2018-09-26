import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????n?????ij???k
		int i;
		int j;
		int k;
		String a = new String(new char[100]); //?????a
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			k = 1;
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) < 'A') || ((a.charAt(0)>'Z') && (a.charAt(0) != '_') && (a.charAt(0) < 'a')) || (a.charAt(0)>'z'))
			{
				k = 0;
			}
			for (j = 1;j < a.length();j++)
			{
				if ((a.charAt(j) < '0') || ((a.charAt(j)>'9') && (a.charAt(j) < 'A')) || ((a.charAt(j)>'Z') && (a.charAt(j) != '_') && (a.charAt(j) < 'a')) || (a.charAt(j)>'z'))
				{
					k = 0;
				}
			}
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}

}

