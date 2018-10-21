import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????
		int m;
		int ma1;
		int a1;
		int b1;
		int n = 0;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);
		a = new Scanner(System.in).nextLine(); //????
		b = new Scanner(System.in).nextLine();
		a1 = a.length(); //??????
		b1 = b.length();
		if (a1 >= b1) //?0
		{
			m = a1;
		   for (i = b1 - 1;i >= 0;i--)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i + a1 - b1, b.charAt(i));
		   }
		   for (i = 0;i < a1 - b1;i++)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, '0');
		   }
		}
		else
		{
			m = b1;
		  for (i = a1 - 1;i >= 0;i--)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i + b1 - a1, a.charAt(i));
		  }
		  for (i = 0;i < b1 - a1;i++)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, '0');
		  }
		}
		for (i = m - 1;i >= 0;i--) //??????
		{
			if ((a.charAt(i) + b.charAt(i) - 96 + n) < 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, a.charAt(i) + b.charAt(i) - 48 + n);
				n = 0;
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, a.charAt(i) + b.charAt(i) - 48 - 10 + n);
				n = 1;
			}

		}
		if (n == 1) //????
		{
			c = tangible.StringFunctions.changeCharacter(c, 0, '1');
			for (i = 0;i <= m;i++)
			{
				System.out.print(c.charAt(i));
			}
		}
			else
			{
				int j = 1;
				int q = 1;
				int p = 0;
				int k;
				for (k = 1;k <= m;k++)
				{
					if (c.charAt(k) != '0')
					{
						p = 1;
						break;
					}
				}
				if (p != 0)
				{
				while (c.charAt(j) == '0')
				{
					q++;
					j++;
				}
				for (i = q;i <= m;i++)
				{
					System.out.print(c.charAt(i));
				}
				}
				else
				{
					System.out.print('0');
				}
			}
		return 0;
	}

}

