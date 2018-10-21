package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int[] b = new int[300];
	int i;
	int j;
	int k;
	int m;
	int sum = 1;
	int z = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	b[0] = a[0];
	  for (i = 0;i <= k - 1;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	  }

	   for (i = 1;i <= k - 1;i++)
	   {
		   for (j = 0;j < i;j++)
		   {
			m = a[i] - a[j];
			sum = sum * m;
		   }
	   if (sum != 0)
	   {
		   b[z] = a[i];
		   z++;
	   }
	   else
	   {
		   sum = 1;
	   }
	   }
		b[0] = a[0];
	   for (i = 0;i < z - 1;i++)
	   {
	   System.out.printf("%d,",b[i]);
	   }
	   System.out.printf("%d\n",b[z - 1]);
	}


}

