package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int max;
		int min;
		int t;
		char c;
		int i;
		int j;
		int k;
		int r;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[0] = Integer.parseInt(tempVar);
		 }
		 c = System.in.read();
	   if (c == '\n')
	   {
		   System.out.print("No");
	   }
		if (c == ',')
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[1] = Integer.parseInt(tempVar2);
			 }
		for (i = 2;(c = System.in.read()) == ',';i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		k = i;
		   max = a[0];
		   min = a[0];
	   for (j = 0;j < k;j++)
	   {
		  if (a[j] > max)
		  {
			  max = a[j];
		  }
	   if (a[j] < min)
	   {
		   min = a[j];
	   }
	   }
		if (max != min)
		{
			for (r = 0;r < k;r++)
			{
		  if (a[r] == max)
		  {
			  a[r] = min;
		  }
			}
		  t = a[0];
	   for (r = 0;r < k;r++)
	   {
		if (a[r] > t)
		{
			t = a[r];
		}
	   }
	  System.out.printf("%u",t);
		}
		else
		{
			System.out.print("No");
		}
		}
	}

}

