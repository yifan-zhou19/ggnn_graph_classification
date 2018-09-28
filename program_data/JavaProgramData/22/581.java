package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int max = 0;
		int mid = 0;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			else
			{
				if (max < a[i])
				{
					mid = max;
					max = a[i];
				}
			else if (a[i] > mid && a[i] < max)
			{
			mid = a[i];
			}
			}
		}
		if (max < a[i])
		{
			mid = max;
			max = a[i];
		}
			else if (a[i] > mid && a[i] < max)
			{
				mid = a[i];
			}
		if (max == mid || mid == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d\n",mid);
		}
		return 0;
	}

}

