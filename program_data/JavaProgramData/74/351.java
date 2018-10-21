package <missing>;

public class GlobalMembers
{
	public static int rev(int i)
	{
		int k;
		int s = 0;
		k = i;
		while (i != 0)
		{
			s = s * 10 + i % 10;
			i = i / 10;
		}
		if (s == k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int shu(int i)
	{
		int j;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		t = 0;
		for (i = m;i <= n;i++)
		{
			if (rev(i) != 0 && shu(i) != 0)
			{
				if (t != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}



}

