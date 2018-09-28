package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int j;
		int m;
		int z;
	   int k;
	   int[] a = new int[100000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= (n - 1);i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   z = 0;
	   for (i = 0;i <= (n - 1);i++)
	   {
			  if ((a[i]) == k)
			  {
				  z++;
						   for (j = (i + 1);j <= (n - 1);j++)
						   {
								  if (a[j] != k)
								  {
									  m = a[i];
									  a[i] = a[j];
									  a[j] = m;
									  z--;
									  break;
								  }
						   }

			  }
	   }
	  p = a[0];
	  System.out.printf("%d", p);
	  for (p = a + 1;p < (a + n - z);p++)
	  {
		 System.out.printf(" %d", p);
	  }


	}
}

