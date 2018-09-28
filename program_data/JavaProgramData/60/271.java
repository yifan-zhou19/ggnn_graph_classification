package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
			System.out.print("empty");
		  }
		  else
		  {
		  for (int i = 3;i <= n - 2;i++)
		  {
			   int j;
			   for (j = 3;j < i;j++)
			   {
				   if (i % j == 0)
				   {
				   break;
				   }
			   }
			   if (j == i)
			   {
				  int q;
				  for (q = 3;q < i + 2;q++)
				  {
					 if ((i + 2) % q == 0)
					 {
					 break;
					 }
				  }
				  if (q == (i + 2))
				  {
					System.out.printf("%d %d\n",q - 2,q);
				  }
			   }
		  }
		  }
		  System.in.read();
		  System.in.read();

	}

}

