package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] sz = new int[50000];

		int i;
		int min;
		int max;
		int e;
		int n;
		int j;
		int sum = 0;
		int p;
		int k;
		int s;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 for (i = 0; i < n; i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		 }
		 min = 0;
		 for (i = 0;i < n;i++)
		 {
			 if (a[i] < a[min])
			 {
				 min = i;
			 }
		 }
			max = 0;
		 for (i = 0;i < n;i++)
		 {
			 if (b[i] > b[max])
			 {
				 max = i;
			 }
		 }

					  s = 0;
		  for (r = a[min] + 0.1;r <= b[max] + 0.1;r++)
		  {

				for (i = 0;i < n;i++)
				{
					if (r >= a[i] != 0 && r <= b[i])
					{
						sum++;
					}

				}
				if (sum > 0)
				{
					s++;
				sum = 0;
				}
		  }

		  p = b[max] - a[min];

			if (s != p)
			{
				System.out.print("no");
			}
			else
			{
		System.out.printf("%d %d",a[min],b[max]);
			}
	   return 0;
	}
}

