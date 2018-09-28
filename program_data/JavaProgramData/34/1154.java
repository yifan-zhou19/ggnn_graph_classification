package <missing>;

public class GlobalMembers
{
	public static int i;
	public static void Kakutan()
	{
		while (i != 1)
		{
			if (i % 2 == 1)
			{
				System.out.print(i);
				System.out.print("*3+1=");
				System.out.print(i * 3 + 1);
				System.out.print("\n");
				i = i * 3 + 1;
			}
			else
			{
				System.out.print(i);
				System.out.print("/2=");
				System.out.print(i / 2);
				System.out.print("\n");
				i = i / 2;
			}
		}
		if (i == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		return;
	}
	public static int Main()
	{
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Kakutan();
		return 0;
	}
}

