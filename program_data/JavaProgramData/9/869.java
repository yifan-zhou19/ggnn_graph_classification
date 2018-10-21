package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   int j = 0;
	   int e;
	   int x;
	   int a = 0;
	   int k;
	   int[] y = new int[100];
	   int[] year = new int[100];
	   String id = new String(new char[10]);
	   char[][] t = new char[100][10];
	   String ee = new String(new char[10]);
	   char[][] p = new char[100][10];
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
			 id = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 x = Integer.parseInt(tempVar3);
		 }
		 if (x >= 60)
		 {
		   y[j] = x;
		   t[j] = id;
		   j++;
		 }
		 else
		 {
		 year[a] = x;
		 p[a] = id;
		 a++;
		 }
	   }


	   for (k = 1;k <= j;k++)
	   {
		   for (i = 0;i < j - k;i++)
		   {
				  if (y[i] < y[i + 1])
				  {
					  e = y[i + 1];
					  y[i + 1] = y[i];
					  y[i] = e;

					  ee = t[i + 1];
					  t[i + 1] = t[i];
					  t[i] = ee;
				  }


		   }
	   }


	for (i = 0;i < j;i++)
	{

			System.out.printf("%s\n",t[i]);
	}
	for (k = 0;k < a;k++)
	{
	   System.out.printf("%s\n",p[k]);
	}

		return 0;
	}
}

