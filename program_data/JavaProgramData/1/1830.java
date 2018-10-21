package <missing>;

public class GlobalMembers
{
	public static int begin = 2;
	public static int Main()
	{
		int f = int;
		int n = 0;
		int x = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(x) + 1);
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int x)
	{
		int i = 0;
		int left = 0;
		int num = 0;
		for (i = begin;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				num++;
				left = x / i;
				begin = i;
				num += f(left);
			}
		}
		//if(num!=0)
			begin = 2;
			return num;
		//else
			//return 0;
	}

}

