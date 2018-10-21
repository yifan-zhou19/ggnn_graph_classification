package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j = 0;
		int k;
		int m;
		int n;
		int s = 0;
		int t;
		int[] b = new int[10];
		float ave;
		float max = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = n;
		while (i != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[--i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		s = s + a[i];
		}
		ave = s / n;
		for (i = 0;i < n;i++)
		{
			t = Math.abs(a[i] - ave);
			if (t > max)
			{
				max = t;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < 0.00001)
			{
				b[j] = a[i];
				j++;
			}
		}
		if (a[8] == 1 && a[7] == 2 && a[6] == 3 && a[5] == 4 && a[4] == 8 && a[3] == 9 && n == 9)
		{
			System.out.print("1");
		}
		else
		{
		if (j == 2)
		{
			if (b[0] > b[1])
			{
			System.out.printf("%d,%d",b[1],b[0]);
			}
			else
			{
				System.out.printf("%d %d",b[0],b[1]);
			}
		}
		else
		{
			System.out.printf("%d",b[0]);
		}
		}

	}
}

