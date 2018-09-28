package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int sum;

	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  sum = 0; //?????7????????
	  for (i = 1;i <= n;i++)
	  {
	   if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
	   {
		   sum += i * i;
	   }
	  }
	  sum = n * (n + 1) * (2 * n + 1) / 6 - sum;
	  System.out.print(sum);
	  return 0;
	}
}

