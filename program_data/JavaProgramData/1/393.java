package <missing>;

public class GlobalMembers
{
	public static int s = 0; //?????? z?? ???????
	public static int z = 2;
	public static void number(int x,int y)
	{ //????
		int i;
		if (x == 1)
		{
			s = s + 1;
		} //????1? ???? s+1
		for (i = y;i <= x;i++)
		{
			if (x % i == 0)
			{
				number(x / i, i);
			} //??????
		}


	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			number(a, z);
			System.out.print(s);
			System.out.print("\n");
			s = 0; //S?0
		}
	}

}

