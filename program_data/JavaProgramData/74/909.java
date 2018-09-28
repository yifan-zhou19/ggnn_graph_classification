package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int j;
		int k;
		int a;
		int b;
		int p = 0;
		int s;
		int[] t = new int[1000];
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
			k = (int)Math.sqrt(i);

			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
				break;
				}
			}

			if (j > k)
			{
				 a = 0;
				 b = i;
				 while (b != 0)
				 {
					 a = a * 10 + b % 10;
					 b = b / 10;
				 }
				 if (a == i)
				 {
					 t[p] = i;
					 p++;
				 }
			}
		}
		if (p == 0)
		{
		 System.out.print("no");
		}
		else
		{
			for (s = 0;s < p - 1;s++)
			{

				 System.out.printf("%d,",t[s]);
			}
				 System.out.printf("%d",t[p - 1]);


		}
	return 0;
	}
}

