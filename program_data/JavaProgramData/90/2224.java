package <missing>;

public class GlobalMembers
{
	//?????
	public static int sum(int a,int b) //????
	{
		int x;
		if (a == 0 || a == 1 || b == 1) //sum(0,b)=sum(1,b)=sum(a,1)=0
		{
			return 1;
		}
		else if (a < b) //??sum(a-b,b)????????????
		{
			return sum(a, b - 1);
		}
		else
		{
			x = sum(a, b - 1) + sum(a - b, b);
			return x;
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sum(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

