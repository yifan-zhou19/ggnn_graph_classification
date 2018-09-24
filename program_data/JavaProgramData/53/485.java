package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int n;
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
		for (i = (n - 1);i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
			a[i] = 0;
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
			a[j] = a[i];
		j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != (j - 1))
			{
				System.out.print(",");
			}
		}
	}


}

