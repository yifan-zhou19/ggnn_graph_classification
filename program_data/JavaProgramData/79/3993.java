package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int[] a = new int[300];
		int n;
		int m;
		int i;
		int exist;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		exist = n;
		for (i = 0;i < n;i++)
		{
			 a[i] = 1;
		}
		i = 0;
		count = 0;
		while (exist > 1)
		{
			if (a[i] != 0)
			{
				count++;
			}
			if (count == m)
			{
				a[i] = 0;
				exist--;
				count = 0;
			}
			i++;
			if (i == n)
			{
				i = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			 if (a[i] != 0)
			 {
				 System.out.printf("%d\n",i + 1);
			 }
		}
		}
		return 0;
	}
}

