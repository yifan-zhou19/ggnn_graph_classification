package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int max1;
		int max2;
		int[] num = new int[30];
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
			num[i] = Integer.parseInt(tempVar2);
		}
	 }
	 max1 = num[0];
	 k = 0;
	 for (i = 1;i < n;i++)
	 {
		if (num[i] > max1)
		{
				 max1 = num[i];
				 k = i;
		}
	 }
	 if (k = 0)
	 {
		 max2 = num[1];
	  for (i = 2;i < n;i++)
	  {
		if (num[i] > max2)
		{
			 max2 = num[i];
		}
	  }
	 }
	else
	{
		max2 = num[0];
		  for (i = 2;i < n;i++)
		  {
			  if (num[i] > max2 && num[i] != max1)
			  {
			  max2 = num[i];
			  }
		  }
	}
	System.out.printf("%d\n",max1);
	System.out.printf("%d\n",max2);
	}


}

