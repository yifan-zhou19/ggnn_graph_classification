package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = n - 2;
		while (n-- != 0)
		{
			  temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (temp > i)
			  {
				  j = i;
				  i = temp;
			  }
			  if (temp < i && temp> j)
			  {
				  j = temp;
			  }


		}
		System.out.print(i);
		System.out.print("\n");
		System.out.print(j);
		System.out.print("\n");

	}
}

