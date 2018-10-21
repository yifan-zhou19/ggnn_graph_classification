package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		char c;
		i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
			else
			{
				i++;
			}
		}
		int max = 0;
		for (j = 0;j <= i;j++)
		{
			if (a[j] >= max)
			{
				max = a[j];
			}
		}
		int q = -1;
		for (j = 0;j <= i;j++)
		{
			if (a[j] > q && a[j] < max)
			{
				q = a[j];
			}
		}
		if (q == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",q);
		}
		return 0;
	}
}

