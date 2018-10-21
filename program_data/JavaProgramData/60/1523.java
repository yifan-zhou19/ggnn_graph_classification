package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k = 0;
		int flag = 0;
		int[] a = new int[10000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   N = Integer.parseInt(tempVar);
	   }
	   if (N < 5)
	   {
			 System.out.print("empty");
	   }
	   else
	   {
		  for (i = 3;i <= N;i += 2,flag = 0)
		  {
			 for (j = 2;j < Math.sqrt((double)i) + 1;j++)
			 {
				 if (i % j == 0)
				 {
					flag = 1;
					break;
				 }
			 }
			 if (flag == 0)
			 {
				a[k] = i;
				k++;
			 }
		  }


		  for (k = 0;a[k] != 0;k++)
		  {
			  if (a[k + 1] == a[k] + 2)
			  {
				  System.out.printf("%d %d\n",a[k],a[k + 1]);
			  }
		  }
	   }

	return 0;
	}

}

