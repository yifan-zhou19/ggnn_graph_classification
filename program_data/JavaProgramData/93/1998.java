package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int N;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  N = n;

		  if (n % 3 == 0)
		  {
			n = n / 3;
		  }
		  if (n % 5 == 0)
		  {
			n = n / 5;
		  }
		  if (n % 7 == 0)
		  {
			n = n / 7;
		  }

		  if (N / n == 1)
		  {
			System.out.print("n");
		  }
		  if (N / n == 3)
		  {
			System.out.print("3");
		  }
		  if (N / n == 5)
		  {
			System.out.print("5");
		  }
		  if (N / n == 7)
		  {
			System.out.print("7");
		  }
		  if (N / n == 15)
		  {
			System.out.print("3 5");
		  }
		  if (N / n == 21)
		  {
			System.out.print("3 7");
		  }
		  if (N / n == 35)
		  {
			System.out.print("5 7");
		  }
		  if (N / n == 105)
		  {
			System.out.print("3 5 7");
		  }
	}

}

