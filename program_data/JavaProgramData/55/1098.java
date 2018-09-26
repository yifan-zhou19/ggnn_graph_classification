package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = char x;
		String x = new String(new char[100]);
		String z = new String(new char[100]);
		char w;
		int[] y = new int[100];
		int a;
		int b;
		int c;
		int d;
		int j;
		int k;
		int sum = 0;
		int i;
		int t = 0;
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
		c = x.length();
		for (i = c - 1;i >= 0;i--)
		{
			y[i] = f(x.charAt(i));
			sum += (int)(y[i] * Math.pow(a,c - i - 1));
		}
		if (sum == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = 1;i <= 1000;i++)
			{
				if (sum < Math.pow(b,i))
				{
						d = i - 1;
						break;
				}
			}
		for (j = d;j >= 0;j--)
		{
			for (k = 1;k <= b;k++)
			{
				if (sum >= k * Math.pow(b,j))
				{
					continue;
				}
				else
				{
					if (k < 11)
					{
						w = k + 47;
					}
					else
					{
						w = k + 54;
					}
					z = tangible.StringFunctions.changeCharacter(z, t, w);
					sum -= (int)((k - 1) * Math.pow(b,j));
					t = t + 1;
					break;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%c",z.charAt(i));
		}
		System.out.print("\n");
		}
		return 0;
	}
	public static int f(char x)
	{
		if (Character.isLowerCase(x))
		{
			return x - 87;
		}
		else
		{
			if (Character.isUpperCase(x))
			{
				return x - 55;
			}
			else
			{
				return x - 48;
			}
		}
	}

}

