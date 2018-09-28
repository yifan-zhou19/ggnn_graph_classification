package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
		int[] b = new int[300];
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
		k = 1;
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (;i < n;i++)
	{
			for (j = 0;j < k;j++)
			{
				if (a[i] == b[j])
				{
					i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
			if (j == k)
			{
				b[k] = a[i];
				k++;
			}
	}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k - 1]);
		return 0;
	}
}

