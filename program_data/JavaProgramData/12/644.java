package <missing>;

public class GlobalMembers
{
	/**
	* file homwork.cpp
	* author ??? 1100012722
	* data 2011-10-20
	* description ??
	*/ 
	public static int Main()
	{
	 int[] a = new int[20];
	 int[] b = new int[20];
	 int i;
	 int j;
	 int k;
	 int n;
	 i = 1;
	 n = 0;

	 while (true) // ??????
	 {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i] = Integer.parseInt(tempVar);
	   }
	   if (a[i] == -1)
	   {
		   break; // ??-1???????
	   }
	   else if (a[i] == 0) // ??0???????
	   {
		   for (j = 1 ; j <= i - 1 ; j++)
		   {
		  b[j] = a[j] * 2;
		   }

		   for (j = 1 ; j <= i - 1 ; j++)
		   {
		  for (k = 1 ; k <= i - 1 ; k++)
		  {
			 if (b[j] == a[k])
			 {
				 n++;
			 }
		  }
		   }

		   System.out.printf("%d\n",n);
		   i = 1;
		   n = 0; // ?????????
	   }
	   else
	   {
		   i++; // ?0?-1????
	   }
	 }
	  return 0;
	}
}

