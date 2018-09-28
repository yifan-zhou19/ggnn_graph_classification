package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] a = new int[300];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 || m == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			i = 0;
			while (n != 0)
			{
				i = i + m - 1;
				for (j = i % n;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				i = i % n;
				n--;
			}
			System.out.printf("%d\n",a[0]);
		}
		return 0;
	}
}

