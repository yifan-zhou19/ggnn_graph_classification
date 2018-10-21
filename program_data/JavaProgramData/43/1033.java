package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int a;
	   int flag1 = 0;
	   int flag2 = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 3;i <= n / 2;i++)
	   {
		   flag1 = 0;
		flag2 = 0;
		  a = i;
		  for (j = 2;j <= i / 2;j++)
		  {
			 if (i % j == 0)
			 {
				flag1 = 1;
			 }
		  }
		  if (flag1 == 0)
		  {
			 i = n - i;
			 for (j = 2;j <= i / 2;j++)
			 {
				if (i % j == 0)
				{
				   flag2 = 1;
				}
			 }
			 if (flag1 == 0 && flag2 == 0)
			 {
				System.out.printf("%d %d\n",n - i,i);
			 }
		  }
		  i = a;
	   }
			return 0;
	}

}

