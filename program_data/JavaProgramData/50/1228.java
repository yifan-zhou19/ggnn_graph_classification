package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		switch (w % 7)
		{
			case 0:
				System.out.print(1);
				System.out.print("\n");
				System.out.print(10);
				break;
			case 1:
				System.out.print(4);
				System.out.print("\n");
				System.out.print(7);
				break;
			case 2:
				System.out.print(9);
				System.out.print("\n");
				System.out.print(12);
				break;
			case 3:
				System.out.print(6);
				break;
			case 4:
				System.out.print(2);
				System.out.print("\n");
				System.out.print(3);
				System.out.print("\n");
				System.out.print(11);
				break;
			case 5:
				System.out.print(8);
				break;
			case 6:
				System.out.print(5);
				break;
		}
		return 0;
	}
}

