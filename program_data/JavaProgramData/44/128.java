package <missing>;

public class GlobalMembers
{
	public static int reverse(String n)
	{
		int b;
		int i;
		int jieguo;
		b = n.length();
		if (b == 1)
		{
			jieguo = 1;
		}
		else
		{
			if (n[0].equals('-'))
			{
				jieguo = 2;
				if (n[b - 1].equals('0'))
				{
					jieguo = 4;
				}
			}
			else
			{
				jieguo = 3;
				if (n[b - 1].equals('0'))
				{
					jieguo = 5;
				}
			}
		}
		return (jieguo);
	}

	public static int Main()
	{
		int j;
		int z;
		int i;
		int c;
		int k;
		char[][] jieguo = new char[6][8];
		String su = new String(new char[8]);
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				su = tempVar.charAt(0);
			}
			c = su.length();
			z = reverse(su);
			switch (z)
			{
			case 1:
			{
				jieguo[j][0] = su.charAt(0);
				jieguo[j][1] = '\0';
				break;
			}
			case 2:
			{
				jieguo[j][0] = su.charAt(0);
				for (i = 1;i < c;i++)
				{
					jieguo[j][i] = su.charAt(c - i);
				}
				jieguo[j][c] = '\0';
					break;
			}
			case 3:
			{
				for (i = 0;i < c;i++)
				{
						jieguo[j][i] = su.charAt(c - 1 - i);
				}
				   jieguo[j][c] = '\0';
				   break;
			}
			case 4:
			{
				jieguo[j][0] = su.charAt(0);
				for (i = 1;i < c;i++)
				{
					if (su.charAt(c - i) != '0')
					{
						break;
					}
				}
				for (k = 1;k <= c - i;k++)
				{
				jieguo[j][k] = su.charAt(c - i - k + 1);
				}
				jieguo[j][k] = '\0';
			}
				   break;
			case 5:
			{
				for (i = 0;i < c;i++)
				{
					if (su.charAt(c - i - 1) != '0')
					{
						break;
					}
				}
				   for (k = 0;k < c - i;k++)
				   {
				   jieguo[j][k] = su.charAt(c - i - k - 1);
				   }
				   jieguo[j][k] = '\0';
			}
				   break;
			}
		}
		for (j = 0;j < 6;j++)
		{
			System.out.printf("%s\n",jieguo[j]);
		}
		return 0;
	}

}

