package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int max1 = 0;
		int max2 = 0;
		int n;
		int sign;
	  int[] a = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= 99;i++)
	  {
		   if (i <= n - 1)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
		   }
		else
		{
			break;
		}
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		   if (a[i] > max1)
		   {
			  max1 = a[i];
		   sign = i;
		   }

	  }
		a[sign] = 0;
		for (i = 0;i <= n - 1;i++)
		{
		   if (a[i] > max2)
		   {
		  max2 = a[i];
		   }

		}
		System.out.printf("%d\n%d",max1,max2);
		return 0;
	}
}

