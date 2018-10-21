import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int k = 0;
		int l = a.length() - 1;
		int p = 0;
		int t;
		for (i = 0;i <= l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j = i;
				t = i;
				while (a.charAt(j) == ' ')
				{
					k++;
					j++;
				}
			}
			if (k > 1)
			{
				for (;t <= l - k + 2;t++)
				{
					a = tangible.StringFunctions.changeCharacter(a, t, a.charAt(t + k - 1));
				}
				l = l - k + 1;
			}
			k = 0;
		}
		for (p = 0;p <= l;p++)
		{
			System.out.print(a.charAt(p));
		}
		System.out.print("");
		System.out.print("\n");
		return 0;
	}
}

