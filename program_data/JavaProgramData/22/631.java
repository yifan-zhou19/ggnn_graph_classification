package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i = 1;
		int temp;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", m))
		{
			a[i] = m;
			i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] != a[0] && a[i] != 0)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		if (i >= n)
		{
			System.out.print("No");
		}
	}

}

