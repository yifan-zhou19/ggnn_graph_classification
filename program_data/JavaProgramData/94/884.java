package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int N;
	   int i;
	   int m;
	   int b = 0;
	   int[] a = new int[500];
	   int tmp;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   N = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < N;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   if (a[i] % 2 != 0)
	   {
			   a[b] = a[i];
			   b++;
	   }
	   }
		for (m = 0;m < b;m++)
		{
				 for (i = 1;i < b - m;i++)
				 {
					 if (a[i - 1] > a[i])
					 {
					   tmp = a[i - 1];
					   a[i - 1] = a[i];
					   a[i] = tmp;
					 }
				 }
		}
		for (i = 0;i < b;i++)
		{
			 System.out.printf("%d",a[i]);
			 if (i < b - 1)
			 {
			 System.out.print(",");
			 }
		}
		return 0;

	}
}

