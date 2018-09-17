package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
	  if (a < min)
	  {
		return 0;
	  }

	  int r = 1;
	  for (int i = min;i < a;i++)
	  {
		if (a % i == 0)
		{
			 r += f(a / i, i);
		}
	  }

		return r;
	}

	public static int Main()
	{
		  int n;
		  int a;
		  int i;
		  int j = 0;
		  int k;
		  int m = 0;
		  int r = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (k = 0;k < n;k++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }

			  if (k != n - 1)
			  {
			   System.out.printf("%d\n",f(a, 2));
			  }
			   else
			   {
			   System.out.printf("%d",f(a, 2));
			   }



		  }


	}
}

