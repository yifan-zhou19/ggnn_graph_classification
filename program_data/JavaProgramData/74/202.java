package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int h;
		int f = 0;
		int[] a = new int[100];
		int[] b = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= Math.sqrt(i) && i % j != 0;j++)
			{
			}
			if (j > Math.sqrt(i))
			{
				b[0] = i / 1000000;
				b[1] = i / 100000 - 10 * b[0];
				b[2] = i / 10000 - 100 * b[0] - 10 * b[1];
				b[3] = i / 1000 - 1000 * b[0] - 100 * b[1] - 10 * b[2];
				b[6] = i % 10;
				b[5] = (i % 100 - b[6]) / 10;
				b[4] = i / 100 - 10000 * b[0] - 1000 * b[1] - 100 * b[2] - 10 * b[3];
				for (j = 0;j < 7 && b[j] == 0;j++)
				{
				}
				for (h = 0;j < 7 && b[6 - h] == b[j];h++, j++)
				{
				}
				if (j == 7)
				{
				   a[f] = i;
				   f++;
				}

			}
		}
		if (f > 0)
		{
			for (i = 0;i < f - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[f - 1]);
		}
		else
		{
			System.out.print("no");
		}
	}
}

