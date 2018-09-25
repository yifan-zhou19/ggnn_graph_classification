package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i = 0;
		int n;
		int j;
		int max;
		int second;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		i = i + 1;
		}
		i = 0;
		max = a[0];
		while (i < n)
		{
		if (max < a[i])
		{
			max = a[i];
			j = i;
		}
			i = i + 1;
		}
		i = 0;
		if (j != 0)
		{
			second = a[0];
		}
		else
		{
			second = a[1];
		}
		while (i < n)
		{
			if (second < a[i] && a[i] < max)
			{
				second = a[i];
			}
			i = i + 1;
		}
		System.out.printf("%d\n%d\n",max,second);
	}

}

