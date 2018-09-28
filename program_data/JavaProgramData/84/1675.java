package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] num = new int[100];
	   int n;
	   int i;
	   int j;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num[i] = Integer.parseInt(tempVar2);
		  }
	   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num[n - 1] = Integer.parseInt(tempVar3);
		}
	   for (j = 0;j < n;j++)
	   {
		   for (i = 0;i < n - j - 1;i++)
		   {
			 if (num[i] > num[i + 1])
			 {
				 t = num[i];
				 num[i] = num[i + 1];
				 num[i + 1] = t;
			 }
		   }
	   }
		 System.out.printf("%d\n%d",num[n - 1],num[n - 2]);
		   return 0;
	}
}

