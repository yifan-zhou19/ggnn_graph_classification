package <missing>;

public class GlobalMembers
{
	public static int fun(int m)
	{
		if (m % 2 != 0)
		{
			a = m * 3 + 1;
			System.out.print(m);
			System.out.print("*3+1=");
			System.out.print(a);
			System.out.print("\n");
			return a;
		}
		else
		{
			a = m / 2;
			System.out.print(m);
			System.out.print("/2=");
			System.out.print(a);
			System.out.print("\n");
			return a;
		}
	}
	public static int a; //??????
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n;
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			while (fun(a) != 1) //?????1,?????fun()??,???1??
			{
				fun(a);
			}
			System.out.print("End");
			System.out.print("\n");
		}
		return 0;
	}


}

