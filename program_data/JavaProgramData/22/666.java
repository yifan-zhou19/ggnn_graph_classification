package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		char c;
		int n;
		int i;
		int max1;
		int max2;
		n = 0;
		while (true)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num[n] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		  n++;
		  if (c != ',')
		  {
			  break;
		  }
		}
	   max1 = num[0];
	   max2 = 0;
	   for (i = 0;i < n;i++)
	   {
		if (num[i] > max1)
		{
			max1 = num[i];
		}
	   }
	   for (i = 0;i < n;i++)
	   {
		 if (num[i] > max2 && num[i] != max1)
		 {
			 max2 = num[i];
		 }
	   }
	   if (max2 == max1 || max2 == 0)
	   {
		   System.out.print("No\n");
	   }
	   else
	   {
		   System.out.printf("%d\n",max2);
	   }
	  return 0;
	}


}

