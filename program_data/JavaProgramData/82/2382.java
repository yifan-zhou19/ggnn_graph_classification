package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int i;
		int a;
		int b;
		int[] n = new int[100];
		int k = 0;
		int j;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 0;i < c;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
			{
				n[k] += 1;
			}
			else
			{
				k += 1;
			}
		}
		for (j = 1;j <= k + 1;j++)
		{
		for (i = 0;i < k + 1 - j;i++)
		{

			if (n[i] < n[i + 1])
			{
				e = n[i];
				n[i] = n[i + 1];
				n[i + 1] = e;
			}
		}
		}
		System.out.printf("%d",n[0]);



		return 0;
	}
}

