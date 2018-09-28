package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int max1;
		 int max2;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] a = new int[n];
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		 }
		if (a[0] >= a[1])
		{
			max1 = a[0];
			max2 = a[1];
		}
		else
		{
			max1 = a[1];
			max2 = a[2];
		}
		for (i = 2;i < n;i++)
		{
			if (a[i] >= max1)
			{
				max2 = max1;
				max1 = a[i];
			}
			else if (a[i] < max1 && a[i] >= max2)
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n",max1);
		System.out.printf("%d",max2);
		return 0;

	}

}

