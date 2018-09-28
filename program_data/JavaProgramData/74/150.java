package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		int[] z = new int[100];
		int zz = 0;
		int[] wan = new int[9];
		int wei;
		int num;
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
		for (i = m,a = 0,b = 0,wei = 0;i <= n;i++)
		{
			a = 0;
			b = 0;
			for (j = 0;j < 9;j++)
			{
				wan[j] = 0;
			}
			k = Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > k)
			{
				a++;
			}
			num = i;
			for (j = 0;j < 9;j++)
			{
				wan[j] = num % 10;
				num = num / 10;
				wei = j;
				if (num < 1)
				{
					break;
				}
			}
			for (j = 0;j <= wei;j++)
			{
				if (wan[j] != wan[wei - j])
				{
					break;
				}
			}
			if (j > wei)
			{
				b++;
			}
			if (a * b != 0)
			{
				z[zz] = i;
				zz++;
			}
		}
		if (zz == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < zz;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",z[i]);
				}
				else
				{
					System.out.printf(",%d",z[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

