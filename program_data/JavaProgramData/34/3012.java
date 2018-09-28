package <missing>;

public class GlobalMembers
{
	public static int p;
	public static int oushu(int a)
	{
		p = a / 2;
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(p);
		System.out.print("\n");
		return p;
	}
	public static int jishu(int a)
	{
		p = a * 3 + 1;
		System.out.print(a);
		System.out.print("*3+1=");
		System.out.print(p);
		System.out.print("\n");
		return p;
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1)
		{
			if (a % 2 == 0)
			{
				oushu(a);
				a = p;
			}
			else
			{
				jishu(a);
				a = p;
			}
		}
		System.out.print("End");
		return 0;
	}



}

