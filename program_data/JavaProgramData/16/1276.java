package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int sum;
	int len;
	int i;
	int[] a = new int[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sum = Integer.parseInt(tempVar);
	}
	if (sum >= 10000)
	{
		len = 5;
	}
	  else if (sum >= 1000)
	  {
		  len = 4;
	  }
		 else if (sum >= 100)
		 {
			 len = 3;
		 }
		   else if (sum >= 10)
		   {
			   len = 2;
		   }
			  else
			  {
				  len = 1;
			  }
	  for (i = 1;i <= len;i++)
	  {
		a[i] = sum / (Math.pow(10,(len - i)));
	   sum = sum - a[i] * Math.pow(10,(len - i));
	  }
	for (i = 1;i <= len;i++)
	{
	  System.out.printf("%d",a[len - i + 1]);
	}
	}
}

