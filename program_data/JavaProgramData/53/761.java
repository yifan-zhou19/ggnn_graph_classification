package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int[] b = new int[300];
		int k;
		int m = 1;
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
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			for (k = 0;k < m;k++)
			{
				if (a[i] == b[k])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
			b[m] = a[i];
			m++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[m - 1]);
		return 0;
	}
}

