package <missing>;

public class GlobalMembers
{
	//****************************
	//* ??:????            *
	//* ?????               *
	//* ???12?10?           *
	//****************************
	public static void f(int n)
	{
		if (n == 1) //??n????
		{
			System.out.print("End");
		}
		else if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			n = n / 2;
			f(n); //???????
		}
		else
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print((n * 3 + 1));
			System.out.print("\n");
			n = n * 3 + 1;
			f(n);
		}
	}
	public static int Main()
	{
		int a = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(a);
		return 0;
	}
}

