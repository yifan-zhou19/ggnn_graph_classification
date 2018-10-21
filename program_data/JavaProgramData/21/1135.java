package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int sum = 0;
		int j;
		int temp;
	   double aver;
	   double dist;
	   double temp1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
		  sum += a[i];
		}

		  aver = sum / (double)n;

		 dist = Math.abs(a[0] - aver);
		 for (i = 0;i < n;i++)
		 {
			if (dist < Math.abs(a[i] - aver))
			{
				dist = Math.abs(a[i] - aver);
			}
		 }
		for (i = 0;i < n;i++)
		{
			if (Math.abs(dist - Math.abs(a[i] - aver)) < 1e-9)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			 if (Math.abs(dist - Math.abs(a[j] - aver)) < 1e-9)
			 {
				System.out.printf(",%d",a[j]);
			 }
		}
			System.out.print("\n");
	}

}

