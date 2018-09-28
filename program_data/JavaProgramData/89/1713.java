package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int k = 0;
		int[] x = new int[10000];
		int[] y = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
			x[a]++;
			y[b]++;
			}
		}
		for (j = 0;j < n;j++)
		{

			if (x[j] == 0 && y[j] == n - 1)
			{
				System.out.printf("%d",j);
			k += 1;
			}
		}
		if (k == 0)
		{
		System.out.print("NOT FOUND");
		}
	}

}

