package <missing>;

public class GlobalMembers
{
	public static int g(int a, int b)
	{
		if (a < b)
		{
			return 0;
		}
		int num = f(a - b, b);
		//cout<<"g:"<<a<<" "<<b<<" "<<num<<endl;
		return num; //???????????
	}
	public static int f(int a, int b)
	{
		if (a == 0)
		{
			return 1;
		}
		if (b == 1)
		{
			return 1;
		}
		int num = 0;
		for (int i = 0; i < b; i++)
		{
			num += g(a, b - i);
		}
		//cout<<a<<" "<<b<<" "<<num<<endl;
		return num;
	}
	public static int i;
	public static int n;
	public static int a;
	public static int b;
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, b));
			System.out.print("\n");
		}
		return 0;
	}

}

