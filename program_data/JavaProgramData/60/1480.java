package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		  int i;
		  int b = 0;
		 for (i = 2;i <= Math.sqrt(a);i++)
		 {
			 if (a % i == 0)
			 {
				 b++;
			 }
		 }
		   if (b == 0)
		   {
			   return 1;
		   }
		   else
		   {
			   return 0;
		   }
	}
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i++)
		{
			  if (sushu(i) == 1 && sushu(i + 2) == 1)
			  {
				  System.out.printf("%d %d\n",i,i + 2);
			   c++;
			  }
		}
		if (c == 0)
		{
			System.out.print("empty");
		}

	}


}

