package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int i;
		  int k;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n <= 4)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
			  n = n - 2;
		  for (a = 3;a <= n;a = a + 2)
		  {

			  for (k = 2;k <= a;k = k + 1)
			  {
			  if (a % k == 0)
			  {
				  break;
			  }
			  }
			  if (k == a)
			  {

			  for (k = 2;k <= (a + 2);k = k + 1)
			  {
			  if ((a + 2) % k == 0)
			  {
				  break;
			  }
			  }
			  if (k == (a + 2))
			  {
			  System.out.printf("%d %d\n",a,(a + 2));
			  }
			  }

		  }
		  }


	}

}

