package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		} //??????1?????
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				n = n / 2;
				System.out.print(2 * n);
				System.out.print("/2=");
				System.out.print(n);
				System.out.print("\n");
			} //???????????2
			else if (n % 2 != 0)
			{
				n = n * 3 + 1;
				System.out.print((n - 1) / 3);
				System.out.print("*3+1=");
				System.out.print(n);
				System.out.print("\n");
			} //??????????3?1
			if (n == 1)
			{
				System.out.print("End");
				break;
			} //????1???
		}
		return 0;
	}
}

