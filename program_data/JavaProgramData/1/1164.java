package <missing>;

public class GlobalMembers
{
	public static int is_bottom;
	public static int max;
	public static int div_foo(int n, int min)
	{
	  int cal = 0;

	  for (int iter = min;iter <= Math.sqrt(n);iter++)
	  {
		if ((n % iter) == 0)
		{
		  cal++;
		  int f1 = n / iter;
		  int f2 = iter;
		  int g;
		  g = div_foo(f1, f2);
		  cal += g;
		}
	  }
	  return cal;
	}

	public static int Main()
	{

	  int N;
	  N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int index = 0;index < N;index++)
	  {
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		is_bottom = 0;
		System.out.print(div_foo(k, 2) + 1);
		System.out.print("\n");
	  }

	  return 0;
	}

}

