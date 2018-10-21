package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int min = 10000;
		int max = 0;
		int i;
		int j;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
			if (max < b[i])
			{
				max = b[i];
			}
		}
			 c[min] = 1;
		for (i = min + 1;i <= max;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				 if (a[j] <= (i - 0.5) && i <= b[j])
				 {
					  c[i] = 1;
				 }
			 }
		}
		for (i = min;i <= max;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no");
						   break;
			}
			else if (i == max)
			{
				System.out.printf("%d %d",min,max);
			}
		}
		return 0;
	}

}

