package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 while (n != 1)
		 {
			if (n % 2 == 0) //n?????n/2???
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
				continue;
			}
			if (n % 2 != 0) //n?????n*3+1???
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
				continue;
			}
		 }
		System.out.print("End");
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

