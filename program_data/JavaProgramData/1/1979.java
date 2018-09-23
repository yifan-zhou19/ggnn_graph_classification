package <missing>;

public class GlobalMembers
{
	public static int factoring(int a,int b)
	{
		int i;
		int kind = 0;

			//printf("ok  a=%d  b=%d\n",a,b);

		if (a == 1)
		{
			kind = 1;
				//printf("kind=1   ok\n");
		}

		else
		{
			for (i = b;i <= a;i++)
			{
			//	printf("ok\n");

				if (a % i == 0)
				{
					kind = factoring(a / i, i) + kind;
						//printf("ok  %d\n",kind);
				}
			}
		}


		return kind;
	}

	public static int Main()
	{
	   int n;
	   int[] x = new int[40000];
	   int i;
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
			  x[i] = Integer.parseInt(tempVar2);
		  }

	   }

	   for (i = 0;i < n;i++)
	   {
		   x[i] = factoring(x[i], 2);
		   System.out.printf("%d\n",x[i]);

	   }
	   return 0;

	}
}

