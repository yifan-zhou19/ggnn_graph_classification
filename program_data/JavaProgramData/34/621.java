package <missing>;

public class GlobalMembers
{
	//???2010?12?1?

	//??: 1000010586_???

	//??; ????

	public static int make(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		else
		{
			if (n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
			}
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
			}
			return make(n);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		make(n);
		return 0;
	}


}

