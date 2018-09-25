package <missing>;

public class GlobalMembers
{
	public static void tiao(int b)
	{
		int n;
		int i;
		int[] t = new int[100];
		int[] c = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("60");
			System.out.print("\n");
		}
		for (i = 1;i <= n;i++)
		{
						c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
						t[i] = c[i] + (i - 1) * 3;
						if (t[i] >= 57 && t[i] <= 60)
						{
							System.out.print(c[i]);
							System.out.print("\n");
							break;
						}
						else if (t[i] > 60)
						{
							System.out.print(c[i] - (t[i] - 60));
							System.out.print("\n");
							break;
						}
						else if (c[i + 1] == 0)
						{
							System.out.print(c[i] + (60 - t[i] - 3));
							System.out.print("\n");
						}
		}
	}


	public static int Main()
	{
		int n1;
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			tiao(i);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

