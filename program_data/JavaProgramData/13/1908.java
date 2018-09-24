package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
		if (j == i)
		{
			continue;
		}
		else if (a[j] == a[i])
		{
			a[j] = -1;
		}
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == -1)
			{
		continue;
			}
		else
		{
				System.out.printf("%d",a[i]);
	break;
		}
		}
			 for (j = i + 1;j < n;j++)
			 {
			if (a[j] == -1)
			{
		continue;
			}
		else
		{
			System.out.printf(" %d",a[j]);
		}
			 }

		return 0;
	}

}

