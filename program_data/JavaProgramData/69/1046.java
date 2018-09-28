package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int la;
		int lb;
		int lm;
		int ln;
		int temp = 0;
		int i;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] c = new int[251];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		if (la > lb)
		{
			lm = la;
			ln = lb;
		}
		else
		{
			lm = lb;
			ln = la;
		}
		for (i = 1;i <= lm;i++)
		{
			if (i > ln && ln == lb)
			{
				temp = a.charAt(la - i) + temp - '0';
				c[lm + 1 - i] = temp % 10;
				if (temp >= 10)
				{
					temp = temp / 10;
				}
				else
				{
					temp = 0;
				}
			}
			else if (i > ln && ln == la)
			{
				temp = b.charAt(lb - i) + temp - '0';
				c[lm + 1 - i] = temp % 10;
				if (temp >= 10)
				{
					temp = temp / 10;
				}
				else
				{
					temp = 0;
				}
			}
			else
			{
				temp = a.charAt(la - i) + b.charAt(lb - i) + temp - '0'-'0';
				c[lm + 1 - i] = temp % 10;
				if (temp >= 10)
				{
					temp = temp / 10;
				}
				else
				{
					temp = 0;
				}
			}
		}
		c[0] = temp;
		for (i = 0;i <= lm;i++)
		{
			if (c[i] != 0)
			{
				break;
			}
			if (i == lm && c[i] == 0)
			{
				System.out.print("0");
			}
		}
		for (;i <= lm;i++)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}
}

