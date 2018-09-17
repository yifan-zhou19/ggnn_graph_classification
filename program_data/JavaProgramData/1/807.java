package <missing>;

public class GlobalMembers
{
	public static int fenjie(int n,int x)
	{
		int i; //t??? ???
		int t = 0;
		for (i = x;i <= Math.sqrt(n);i++)
		{
		if (n % i == 0)
		{
		  t = t + 1 + fenjie(n / i, i); //????????  ????????
		}
		}
	   return t; //???????????0
	}
	public static int Main()
	{
		int i;
		int t;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{ //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fenjie(n, 2) + 1);
		System.out.print("\n");
		}
		return 0;
	}

}

