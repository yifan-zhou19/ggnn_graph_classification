package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[500000];
		int[] b = new int[500000];
		int i;
		int j;
		int e;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
				   e = a[j + 1];
				   a[j + 1] = a[j];
				   a[j] = e;
				   m = b[j + 1];
				   b[j + 1] = b[j];
				   b[j] = m;
				}
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			if (a[i + 1] > b[i])
			{
				System.out.print("no");
				k = 1;
				break;
			}
			else if (b[i] > b[i + 1])
			{
				b[i + 1] = b[i];
			}
		}
		if (k == 0)
		{
			 System.out.printf("%d %d",a[0],b[n - 1]);
		}
	}

}

