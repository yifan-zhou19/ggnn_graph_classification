package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int k;
		int n;
		int p;
		int j;
		int[] a = new int[100010];
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
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] == k)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[j] != k)
					{
						a[i] = a[j];
						a[j] = k;
						break;
					}
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (a[i] != k)
			{
				p = i;
				break;
			}
		}
		for (i = 0;i <= p;i++)
		{
			if (i < p)
			{
				System.out.printf("%d ",a[i]);
			}
			if (i == p)
			{
						   System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}





}

