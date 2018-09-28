package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int h;
		int g;
		int sum;
		int a;
		int k;
		int[] b = new int[10];
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
		for (k = 0,i = m;i <= n;i++)
		{
			for (j = 2;j <= i / 2;j++)
			{
			if ((i % j) == 0)
			{
				h = 0;
			break;
			}
				h = 1;
			}
		 if (h == 0)
		 {
			 continue;
		 }
		 for (g = i,sum = 0;g > 0;)
		 {
			 sum = 10 * sum;
			 a = g - (g / 10) * 10;
			 sum = sum + a;
			 g = g / 10;
		 }
		 if (i != sum)
		 {
			 continue;
		 }
			 b[k] = i;
			 k++;

		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i <= (k - 2);i++)
			{
				System.out.printf("%d,",b[i]);
			}
		System.out.printf("%d",b[k - 1]);
		}

	}
}

