package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int i = 0;
		int j;
		int max;
		int max2 = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		max = a[0];

		while ((c = System.in.read()) != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[++i] = Integer.parseInt(tempVar2);
			}

			if (max < a[i])
			{
				max2 = max;
				max = a[i];
			}
			else if (max2 < a[i] && a[i] != max)
			{
				max2 = a[i];
			}
		}
		if (max > max2 && max2 != 0)
		{
			System.out.printf("%d\n",max2);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

