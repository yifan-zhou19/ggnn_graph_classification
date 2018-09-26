package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		int j;
		int y;
		y = 0;
		for (j = 2;j < i;j++)
		{
						 if (i % j == 0)
						 {



						 y = 1;
						 break;
						 }
		}
						 if (y == 0)
						 {
						 return (1);
						 }
						 else
						 {
						 return (0);
						 }
	}

	public static int Main()
	{
		  int sushu = int i;
		  int n;
		  int i;
		  int a;
		  int b;
		  int x;
		  x = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (i = 2;i <= n - 2;i++)
		  {
						   a = sushu(i);
						   b = sushu(i + 2);


							if (a == 1 && b == 1)
							{
						   System.out.printf("%d %d\n",i,i + 2);
						   x = 1;
							}
		  }
						   if (x == 0)
						   {
						   System.out.print("empty");
						   }


	}

}

