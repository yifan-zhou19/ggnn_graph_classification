package <missing>;

public class GlobalMembers
{
	public static int[] trail = new int[100000];

	public static int counter;
	public static int functio(int n)
	{
		if (n % 2 == 0)
		{
		   counter = counter + 1;
		   trail[counter] = n;
		   return functio(n / 2);

		}
		if (n % 2 == 1 && n > 2)
		{
		   counter = counter + 1;
		   trail[counter] = n;
		   return functio(3 * n + 1);
		}
		if (n == 1)
		{
		   counter = counter + 1;
		   trail[counter] = 1;
		   return 0;
		}


	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		functio(n);
		for (int i = 1;i <= counter;i++)
		{
			if (trail[i] % 2 == 0)
			{
				System.out.print(trail[i]);
				System.out.print('/');
				System.out.print(2);
				System.out.print('=');
				System.out.print(trail[i] / 2);
				System.out.print("\n");
			}
			else if (trail[i] > 2 && trail[i] % 2 == 1)
			{
				System.out.print(trail[i]);
				System.out.print("*3+1=");
				System.out.print(trail[i] * 3 + 1);
				System.out.print("\n");
			}
			else
			{
				System.out.print("End");
				System.out.print("\n");
			}
		}


	}


}

