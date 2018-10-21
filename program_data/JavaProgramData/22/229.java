package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int max;
		int max2;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while ((scanf(",%d", a[i]) > 0))
		{
			i++;
		}
		if (i == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			max = a[0];
			max2 = 0;
			for (j = 1;j < i;j++)
			{
				if (max < a[j])
				{
					max = a[j];
				}
			}
			for (j = 0;j < i;j++)
			{
				if (a[j] < max && a[j]> max2)
				{
				max2 = a[j];
				}
			}
			if (max2 == 0)
			{
				System.out.print("No\n");
			}
			else
			{
			System.out.printf("%d",max2);
			}
		}
	}


}

