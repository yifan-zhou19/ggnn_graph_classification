package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[10000];
		do
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		if (i != j)
		{
			a[i] = 0.5;
		a[j] = a[j] + i;
		}
		}while ((i > 0) || (j > 0));
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == (n * (n - 1) / 2 - i))
			{
				System.out.printf("%d\n",i);
				j = 1;
			}
		}
		if (j == 0)
		{
			System.out.print("not found");
		}
	}
}

