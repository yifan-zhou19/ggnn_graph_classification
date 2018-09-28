import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int m;
		int k;
		int l = 0;
		int j;
		int flag;
		int x;
		int y;
		i = 0;
		flag = 0;
		a = new Scanner(System.in).nextLine();
		j = a.length();
		if (j >= 2)
		{
			if (j >= 3)
			{
				while (i < j)
				{
					m = l * 10 + a.charAt(i) - '0';
					b = tangible.StringFunctions.changeCharacter(b, i, m / 13 + '0');
					l = m % 13;
					i = i + 1;
				}
				for (k = 0; k < i; k++)
				{
					if ((b.charAt(k) != '0') || (flag == 1))
					{
						System.out.print(b.charAt(k));
						flag = 1;
					}
				}
				System.out.print("\n");
				System.out.print(l);
			}
			else
			{
				m = ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0');
				x = m / 13;
				y = m % 13;
				System.out.print(x);
				System.out.print("\n");
				System.out.print(y);
			}
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print((a.charAt(0) - '0'));
		}
		return 0;
	}

}

