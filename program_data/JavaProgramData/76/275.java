package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int min;
		int max;
		int i;
		int j;
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
		min = a[0];
		max = b[0];
		for (i = 0;i < n;i++)
		{
		if (a[i] < min)
		{
			min = a[i];
		}
		}
		for (i = 0;i < n;i++)
		{
		if (b[i] > max)
		{
			max = b[i];
		}
		}
		for (i = min;i <= max;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				 if (i >= a[j] != 0 && i <= b[j])
				 {
					break;
				 }


			 }
			 if (j == n)
			 {
				 System.out.print("no");
				 break;
			 }
		}
		if (i == max + 1)
		{
		   for (i = min;i < max;i++)
		   {
			 for (j = 0;j < n;j++)
			 {
				 if (i + 0.5 >= a[j] != 0 && i + 0.5 <= b[j])
				 {
					break;
				 }


			 }
			 if (j == n)
			 {
				 System.out.print("no");
				 break;
			 }

		   }
		}
		if (i == max)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

