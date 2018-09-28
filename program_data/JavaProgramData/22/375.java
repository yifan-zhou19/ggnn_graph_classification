package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int first;
		int second;
		int t = 0;
		int mid;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i++] = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", a[i++]) == 1)
		{
			;
		}
		if (i == 2)
		{
			System.out.print("No");
		}
		else
		{
			first = a[0];
			for (j = 1;j < i - 1;++j)
			{
				if (a[j] != first)
				{
					second = a[j];
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				System.out.print("No");
			}
			else
			{
				if (first < second)
				{
					mid = first;
					first = second;
					second = mid;
				}
				for (j = 1;j < i - 1;++j)
				{
					if (a[j] > second && a[j] < first)
					{
						second = a[j];
					}
					else if (a[j] > first)
					{
						second = first;
						first = a[j];
					}
				}
				System.out.printf("%d",second);
			}
		}
	}



}

