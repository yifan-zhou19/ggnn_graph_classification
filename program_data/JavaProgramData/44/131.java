package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int n;
		int[] s = new int[6];
		int[] z = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
			z[i] = reverse(s[i]);
			System.out.printf("%d\n",z[i]);
		}
	return 0;
	}
	public static int reverse(int n)
	{
		int z;
		int t = 0;
		if (n == 0)
		{
			z = 0;
		}
		while (n != 0)
		{
			t = t * 10 + n % 10;
			n = n / 10;
		}
		if (n < 0)
		{
			z = t * (-1);
		}
		else
		{
			z = t;
		}
			return z;
	}

}

