package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int t;
		int i;
		int j;
		int sum = 0;
		int[] a = new int[12];
		a[1] = 31;
		a[3] = 31;
		a[5] = 31;
		a[7] = 31;
		a[8] = 31;
		a[10] = 31;
		a[12] = 31;
		a[4] = 30;
		a[6] = 30;
		a[9] = 30;
		a[11] = 30;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   year[j] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   month1[j] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   month2[j] = Integer.parseInt(tempVar4);
		   }
		}
	   for (j = 1;j <= n;j++)
	   {
		   sum = 0;
		   t = 0;
		   if ((year[j] % 4 == 0 && year[j] % 100 != 0) || year[j] % 400 == 0)
		   {
			 a[2] = 29;
		   }
		   else
		   {
			 a[2] = 28;
		   }
		   if (month1[j] > month2[j])
		   {
			 t = month1[j];
			 month1[j] = month2[j];
			 month2[j] = t;
		   }
		   for (i = month1[j];i < month2[j];i++)
		   {
			  String tempVar5 = ConsoleInput.scanfRead();
			  if (tempVar5 != null)
			  {
				  a[i] = Integer.parseInt(tempVar5);
			  }
			  sum += a[i];
		   }
		   if (sum % 7 == 0)
		   {
			  System.out.print("YES\n");
		   }
		   else
		   {
			  System.out.print("NO\n");
		   }
	   }
	}

}

