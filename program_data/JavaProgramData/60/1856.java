package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int x;
		  int y;
		  int z;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  z = 0;
		  for (i = 3;i <= n - 2;i++)
		  {
							 x = (int)Math.sqrt(i);
							 y = (int)Math.sqrt(i + 2);
							 for (j = 2;j <= x;j++)
							 {
								 if (i % j == 0)
								 {
							 break;
								 }
							 }
							 for (k = 2;k <= y;k++)
							 {
								 if ((i + 2) % k == 0)
								 {
							 break;
								 }
							 }
		   if ((j == (x + 1)) && (k == (y + 1)))
		   {
			   System.out.printf("%d %d\n",i,(i + 2));
		   z = 1;
		   }
		  }
		   if (z == 0)
		   {
		   System.out.print("empty\n");
		   }

	}

}

