package <missing>;

public class GlobalMembers
{
	//************************************
	//????1000012825_3               *
	//??????                       *
	//?????2010.10.15               *
	//????????7???????    *
	//************************************
	public static int Main()
	{
		int sum = 0; // ???? ? ???
		int i;
		int n = 1;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n <= i) // ????
		{
		   if ((n % 7 == 0) || (n % 10 == 7) || ((n > 69) && (n < 80))) // ??????7 ????
		   {
			  sum = sum;
		   }
			  else
			  {
			  sum = sum + n * n; // ??
			  }
			  n = n + 1;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

