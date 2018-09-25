package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] n = new int[3];
		int k = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3; i <= 7; i += 2)
		{
			if (a % i == 0)
			{
				n[k] = i;
				k += 1;
			}
		}
		switch (k)
		{
			case 0:
				System.out.print("n");
				break;
			case 1:
				System.out.print(n[0]);
				break;
			case 2:
				System.out.print(n[0]);
				System.out.print(" ");
				System.out.print(n[1]);
				break;
			default:
				System.out.print(n[0]);
				System.out.print(" ");
				System.out.print(n[1]);
				System.out.print(" ");
				System.out.print(n[2]);
				break;
		}
		return 0;
	}

}

