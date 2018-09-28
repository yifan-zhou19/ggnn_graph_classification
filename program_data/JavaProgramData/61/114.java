package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] a = new int[100];
		a[1] = a[2] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 1 || m == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				for (i = 3;i <= m;i++)
				{
					a[i] = a[i - 1] + a[i - 2];
				}
				System.out.printf("%d\n",a[m]);
			}
		}
	}

}

