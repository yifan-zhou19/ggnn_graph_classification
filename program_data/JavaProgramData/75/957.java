package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		char c;
		int k;
		int[] a = new int[1001];
		int[] b = new int[1001];
		k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[k] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) == ',')
		{
			k++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
		}
		k = 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[k] = Integer.parseInt(tempVar3);
		}
		while ((c = System.in.read()) == ',')
		{
			k++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[k] = Integer.parseInt(tempVar4);
			}
		}
		System.out.printf("%d ",k);
		int t = 0;
		for (i = 0;i <= 1000;i++)
		{
			int j;
			int sum = 0;
			for (j = 1;j <= k;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					sum++;
				}
			}
			if (t < sum)
			{
				t = sum;
			}
		}
		System.out.printf("%d",t);
	}

}

