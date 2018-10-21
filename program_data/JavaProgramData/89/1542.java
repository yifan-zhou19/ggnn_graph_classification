package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] person = new int[10000];
		int number;
		int a;
		int b;
		int i;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < number;i++)
		{
			person[i] = 0;
		}

		for (i = 0;;i++)
		{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 0 && b == 0)
		{
			break;
		}
		person[a] = -1;
		if (person[b] != -1)
		{
			person[b]++;
		}
		}

		for (i = 0;i < number;i++)
		{
		  if (person[i] == number - 1)
		  {
			  System.out.print(i);
			  System.out.print("\n");
			 break;
		  }
		}
		if (i == number)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
	}
}

