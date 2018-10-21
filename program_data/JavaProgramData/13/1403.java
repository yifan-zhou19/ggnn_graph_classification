package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[20000];
		int i;
		int n;
		int k;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (a[i] == a[k])
				{
			//	m--; 
				n--;
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				i--;
				}
			}

		}
		for (i = 0;i < n;i++)
		{
		if (i < n - 1)
		{
			System.out.printf("%d ",a[i]);
		}
		else
		{
			System.out.printf("%d",a[n - 1]);
		}
		}
		return 0;
	}

}

