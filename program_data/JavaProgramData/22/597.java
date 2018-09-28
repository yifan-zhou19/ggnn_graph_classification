package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int max;
		int sec_max;
		int i;
		int len = 0;
		int j = 0;
		int k;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[len] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		len += 1;
		if (c == '\n')
		{
			break;
		}
		}
		if (len == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			max = a[0];
		for (i = 0;i < len;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < len;i++)
		{
			if (a[i] < max)
			{
			b[j] = a[i];
			j += 1;
			}
		}
		sec_max = b[0];
		for (k = 0;k < j;k++)
		{
			if (b[k] > sec_max)
			{
				sec_max = b[k];
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d\n",sec_max);
		}
		}
		return 0;
	}
}

