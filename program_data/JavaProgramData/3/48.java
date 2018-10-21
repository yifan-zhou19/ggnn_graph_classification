package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int n;
		int[] a = new int[1000];
		int i;
		int[] b = new int[1000];
		int j;
		int p = 0;
		int h = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sum = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = a[i];
		}
		for (k = 0;k < n;k++)
		{
			for (j = 0;j < n;j++)
			{
				h = a[k] + b[j];
				if (h == sum)
				{
					p++;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.print("yes\n");
		}
		return 0;
	}

}

