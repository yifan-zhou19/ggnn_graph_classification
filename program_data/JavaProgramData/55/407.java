package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int n = 0;
		int b;
		int i;
		int k;
		int j;
		int c;
		int r;
		String x = new String(new char[100]);
		String y = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		k = x.length();
		for (i = 0;i < k;i++)
		{

			if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
			{
				c = x.charAt(i) - 48;
				for (j = 1;j <= k - 1 - i;j++)
				{
					c = c * a;
				}
				n = n + c;
			}
			else if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
			{
				c = x.charAt(i) - 55;
				for (j = 1;j <= k - 1 - i;j++)
				{
					c = c * a;
				}
				n = n + c;
			}
			else
			{
				c = x.charAt(i) - 87;
				for (j = 1;j <= k - 1 - i;j++)
				{
					c = c * a;
				}
				n = n + c;
			}
		}
		i = 0;
		do
		{
			r = n % b;
			if (r >= 0 && r <= 9)
			{
				y = tangible.StringFunctions.changeCharacter(y, i, r + 48);
			}
			else
			{
				y = tangible.StringFunctions.changeCharacter(y, i, r + 55);
			}
			n = n / b;
			i = i + 1;
		}while (n != 0);

		for (k = i - 1;k >= 0;k--)
		{
			System.out.printf("%c",y.charAt(k));
		}


	}



}

