package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int i;
		int max;
		int max2 = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		max = a[0];
		for (i = 1;;i++)
		{
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] >= max)
			{
				if (a[i] > max)
				{
					max2 = max;
					max = a[i];
				}
			}
			else
			{
				if (a[i] >= max2)
				{
					max2 = a[i];
				}
			}
		}
		if (i == 1 || max2 == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max2);
		}
	}
}

