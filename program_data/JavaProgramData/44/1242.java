package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a = 0;
		int Num;
		int n;
		int m;
			Num = num;
			if (Num / 10 == 0)
			{
			n = 0;
			}
			else
			{
			n = 0;
			while (n >= 0)
			{
			Num = Num / 10;
			if (Num == 0)
			{
			break;
			}
			n++;
			}
			m = n;
			while (m >= 0)
			{
			a += num % 10 * Math.pow(10,m);
			num = num / 10;
			m--;
			}
			}
		return a;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int z;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < 6;i++)
		{
		z = reverse(a[i]);
		if (i == 0)
		{
		System.out.printf("%d",z);
		}
		else
		{
		System.out.printf("\n%d",z);
		}
		}
		return 0;
	}
}

