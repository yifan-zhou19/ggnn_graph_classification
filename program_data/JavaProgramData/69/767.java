import java.util.*;

package <missing>;

public class GlobalMembers
{
		public static String a = new String(new char[252]);
		public static String b = new String(new char[252]);
		public static void sum(int n)
		{
			int flag = 0;
			int j = n - 1;
			String c = new String(new char[252]);
			char tem = '0';
			while (j >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, j + 1, (a.charAt(j) + b.charAt(j) - 48 - 48 + (tem - 48)) % 10 + 48);
				tem = 48 + ((a.charAt(j) + b.charAt(j) - 48 - 48 + (tem - 48)) / 10);
				j--;

			}
			if (tem == '0')
			{
				for (int i = 1;i <= n;i++)
				{
						if (c.charAt(i) != '0' || flag != 0)
						{
						System.out.print(c.charAt(i));
						flag = 1;
						}

				}
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, 0, tem);
				for (int i = 0;i <= n;i++)
				{
					if (c.charAt(i) != '0' || flag != 0)
					{
						System.out.print(c.charAt(i));
						flag = 1;
					}


				}


			}
			if (flag == 0)
			{
				System.out.print("0");
			}

		}
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int la;
		int lb;
		la = a.length();
		lb = b.length();
		if (la > lb)
		{
			for (int i = la - 1;i >= la - lb;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - la + lb));
			}
			for (int i = 0;i < la - lb;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}

			  sum(la);
		}
		else
		{
			for (int i = lb - 1;i >= lb - la;i--)
			{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - lb + la));
			}
					for (int i = 0;i < lb - la;i++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
					}
					sum(lb);

		}
		return 0;
	}

}

