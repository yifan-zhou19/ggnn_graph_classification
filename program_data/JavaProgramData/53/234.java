package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int[] b = new int[301];
		int n;
		int i;
		int j;
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
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[j] == a[i] && i != j)
					{
					   a[j] = a[i + 1];
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				if (a[i] != a[n - 1])
				{
					System.out.printf("%d,",a[i]);
				}
			}
				System.out.printf("%d\n",a[n - 1]);
	}




}

