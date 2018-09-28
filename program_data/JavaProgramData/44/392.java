package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a = num;
		int s = 0;
		int[] SZ = new int[100];
		int n = 1;
		int i = 0;
		while ((a / 10) != 0)
		{
			SZ[i] = a % 10;
			a = a / 10;
			i++;
		}
		SZ[i] = a % 10;
		if (SZ[i] < 0)
		{
			s = -SZ[0];
			for (int k = 1;k <= i;k++)
			{
				s = s * 10 - SZ[k];
			}
			s = -s;
		}
		if (SZ[i] >= 0)
		{
			s = SZ[0];
			for (int k = 1;k <= i;k++)
			{
				s = s * 10 + SZ[k];
			}
		}
		return s;
	}
	public static int Main()
	{
		for (int i = 0;i < 6;i++)
		{
			int a;
			int r;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			r = reverse(a);
			System.out.printf("%d\n",r);
		}
		int a;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

