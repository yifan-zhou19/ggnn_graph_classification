package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int Main()
	{
		void shu(int a,int b);
	  int n = 0;
	  int i = 0;
	  int a = 0;
	  int c = 0;
	  int j = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		 for (j = 2;j <= Math.sqrt((double)a);j++)
		 {
			   if (a % j == 0)
			   {
				 sum = sum + 1;
			   shu(j, a / j);
			   }

		 }

		System.out.printf("%d",sum + 1);
		if (i < n)
		{
		 System.out.print("\n");
		}
		sum = 0;

	  }

	  return (0);
	}
	public static void shu(int a,int b)
	{
		int i = 0;
	  for (i = a;i <= Math.sqrt((double)b);i++)
	  {
			if (b % i == 0)
			{
				 sum = sum + 1;
			   shu(i, b / i);

			}
	  }
	}
}

