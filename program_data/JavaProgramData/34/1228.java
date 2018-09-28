package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????n,j????n??
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			if (n % 2 == 1)
			{
				j = n;
				n = 3 * n + 1;
				System.out.print(j);
				System.out.print("*3+1=");
				System.out.print(n);
				System.out.print("\n");
			}
			else if (n % 2 == 0)
			{
				j = n;
				n = n / 2;
				System.out.print(j);
				System.out.print("/2=");
				System.out.print(n);
				System.out.print("\n");
			}
		}
		System.out.print("End");
		System.out.print("\n");
		System.in.read();
		return 0;
	}
}

