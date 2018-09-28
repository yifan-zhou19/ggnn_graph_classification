package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int[] b = new int[10000];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i = i + 2)
		{
			a = (int)(Math.sqrt(i));
			for (j = 2;j <= a;j++)
			{
			if (i % j == 0)
			{
				break;
			}
			}
			if (j > a)
			{
				b[t] = i;
				t++;
			}
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 0;i < t - 1;i++)
			{
				if (b[i + 1] == b[i] + 2)
				{
					System.out.printf("%d %d\n",b[i],b[i + 1]);
				}
			}
		}
	}

}

