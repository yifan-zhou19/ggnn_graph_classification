package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int i;
		int j;
		int m;
		int k;
		int b;
		int n;
		for (n = 0;;n++)
		{
		for (i = 0;i < 17;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			if (m == 0)
			{
				break;
			}
			if (m < 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto er;
			}
			a[i] = m;
		}
		k = i;
		b = 0;
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
				{
					b = b + 1;
				}
			}
		}
		System.out.printf("%d\n",b);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	er:
	return 0;
	}

}

