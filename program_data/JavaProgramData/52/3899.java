package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] input = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *stop, *cut;
		int stop;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *cut;
		int cut;
		int n;
		int m;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			input[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		cut = input;
		stop = input + n - m;


		for (int i = 0; i < m; i++)
		{
			System.out.print((stop++));
			System.out.print(" ");

		}


		for (int i = 0; i < n - m; i++)
		{
			System.out.print((cut++));
			if (i != (n - m - 1))
			{
				System.out.print(" ");
			}

		}



	return 0;
	}

}

