package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int n1;
		  int n2;
		  int i;
		  int a;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = 0;
		  for (i = 2;i <= n - 2;i++)
		  {
			   for (j = 2;j < i;j++)
			   {
					 if (i % j == 0)
					 {
						 n1 = 0;
					 break;
					 }
					 else
					 {
					 n1 = 1;
					 }
			   }
			   for (j = 2;j < i + 2;j++)
			   {
					 if ((i + 2) % j == 0)
					 {
						 n2 = 0;
					 break;
					 }
					 else
					 {
					 n2 = 1;
					 }
			   }
			  if (n1 * n2 == 1)
			  {
				  a++;
				  if (a == 1)
				  {
				  System.out.printf("%d %d",i,i + 2);
				  }
				  else
				  {
				  System.out.printf("\n%d %d",i,i + 2);
				  }
			  }
		  }
		  if (a == 0)
		  {
		  System.out.print("empty");
		  }
		  System.in.read();
		  System.in.read();
	}

}

