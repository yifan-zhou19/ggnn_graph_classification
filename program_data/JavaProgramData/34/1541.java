package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????n,t,i,??t????0
		int t = 0;
		int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n != 1)
	{
		if (n % 2 == 0)
		{
		i = n / 2;
	System.out.printf("%d/2=%d\n",n,i);
		}
	else
	{
		i = n * 3 + 1;
	System.out.printf("%d*3+1=%d\n",n,i);
	}
	n = i;
	}
	System.out.print("End");
	System.out.print("\n");
	return 0;
	}
}

