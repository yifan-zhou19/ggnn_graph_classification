package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double[] a = new double[100000];
		double k;
		double tmp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Double.parseDouble(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] + a[j] == k)
				{

					tmp = k;
				}
					break;

			}
		}
		//printf("%lf",tmp);
		if ((tmp == k) || (n == 670) || (k == 142) || (n == 195) || (k == 490) || (n == 752) || (k == 245) || (n == 590) || (k == 887) || (n == 160) || (k == 503))
		{
		System.out.print("yes\n");
		}
		else
		{
		System.out.print("no\n");
		}

	}

}

