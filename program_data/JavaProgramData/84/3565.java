package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int a;
		int b;
		a = b = 0;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int keyin;
		for (i = 1;i <= num;i++)
		{
			  keyin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (keyin >= a)
			  {
					   b = a;
					   a = keyin;
			  }
			  else if (keyin > b)
			  {
				   b = keyin;
			  }
		}
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);

		return EXIT_SUCCESS;
	}

}

