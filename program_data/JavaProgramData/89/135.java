package <missing>;

public class GlobalMembers
{
	public static int[] people = new int[500000];
	public static int Main()
	{
		int n;

		int a;
		int b;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			people[a] = -1;
			if (people[b] >= 0)
			{
				people[b]++;
				if (people[b] == n - 1)
				{
					System.out.print(b);
					System.out.print("\n");
					return 0;
				}

			}
		}

		System.out.print("NOT FOUND");
		System.out.print("\n");



	}

	/****************
	
	
	/****************/
}

