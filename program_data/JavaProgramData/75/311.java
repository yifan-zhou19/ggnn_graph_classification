package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int t = 0;
		int[] n = new int[10000];
		int m;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int min;
		int max;

	   char c;
	   do
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		   i++;
		   t++;
	   }while ((c = System.in.read()) != '\n');
	   i = 0;
	   do
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[i] = Integer.parseInt(tempVar2);
		   }
		   i++;
	   }while ((c = System.in.read()) != '\n');
	   min = a[0];
	   for (i = 0;i < t;i++)
	   {
		   if (a[i] < min)
		   {
			   min = a[i];
		   }
	   }
	   max = b[0];
	   for (i = 0;i < t;i++)
	   {
			if (b[i] > max)
			{
				max = b[i];
			}
	   }

		for (i = min;i < max;i++)
		{
		   for (j = 0;j < t;j++)
		   {
			   if ((i + 0.1) > a[j] && (i + 0.1) < b[j])
			   {
				   n[i]++;
			   }

		   }
		}
				m = n[min];
		   for (i = min;i < max;i++)
		   {
			   if (n[i] > m)
			   {
				   m = n[i];
			   }
		   }

			System.out.printf("%d %d",t,m);
			return 0;

	}

}

