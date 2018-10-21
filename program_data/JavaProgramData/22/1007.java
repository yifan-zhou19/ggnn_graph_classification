package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int k;
		int i;
		int j;
		int b;
		for (i = 0;i < 300;i++)
		{
			a[i] = -1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 300;i++)
		{
			for (j = i;j < 300;j++)
			{
				if (a[j] > a[i])
				{
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		for (i = 0;i < 300;i++)
		{
			if (a[i] != a[i + 1] && a[i + 1] != -1)
			{
				System.out.printf("%d\n",a[i + 1]);
				break;
			}
			else if (a[i] == -1)
			{
				System.out.print("No");
				break;
			}
		}
		return 0;
	}

}

