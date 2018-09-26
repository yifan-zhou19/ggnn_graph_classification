package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int y = 0;
	   int max = 0;
	   int[] a = new int[150];
	   int[] b = new int[150];
	   int[] s = new int[150];
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
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
	   }

	   int[] x = new int[150];
	   for (i = 0;i < 150;i++)
	   {
		   x[i] = 0;
		   s[i] = 0;
	   }

	   for (i = 0;i < n;i++)
	   {
		   if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
		   {
			   x[i] = 1;
		   }
	   }


	   for (i = 0;i < n;i++)
	   {
		   if (x[i] == 1)
		   {
			   max = 1;
		   }
	   }



	 for (i = 0;i < n;i++)
	 {
		 if (x[i] == 1 && (x[i + 1] == 1 || i == n - 1))
		 {
			 s[y]++;
		 }
		 else if (i != 1 && i != n - 1 && x[i] == 1 && x[i - 1] == 1 && x[i + 1] == 0)
		 {
			 s[y]++;
		 }
		 else
		 {
			 y++;
		 }
	 }

	int[] js = new int[150];

	for (i = 0;i < n;i++)
	{

			if (s[i] > max)
			{
				max = s[i];
			}
	}


	   System.out.printf("%d",max);


		return 0;
	}



}

