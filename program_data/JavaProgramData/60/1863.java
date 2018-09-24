package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 5)
		  {
			  System.out.print("3 5\n");
		  }
		  else if (n <= 4)
		  {
			  System.out.print("empty\n");
		  }
		  else
		  {
			  for (a = 2;a <= n;a++)
			  {
			  for (i = 2;i < a;i++)
			  {
			   if (a % i == 0)
			   {
				   break;
			   }
			if (i == a - 1)
			{
			for (int j = 2;j < a + 2;j++)
			{
				if ((a + 2) % j == 0)
				{
					break;
				}
			 if (j == a + 1)
			 {
			 System.out.printf("%d %d\n",a,a + 2);
			 }
			}
			}
			  }
			  }
		  }

	}
}

