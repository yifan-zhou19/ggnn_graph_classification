package <missing>;

public class GlobalMembers
{
	public static void run(int x)
	{
		int lt;
		if (x == 1)
		{
			System.out.print("End");
		}
		else if (x % 2)
		{
			lt = x * 3 + 1;
			System.out.printf("%d*3+1=%d\n",x,lt);
			run(lt);
		}
		else if (x != 2)
		{
			lt = x / 2;
			System.out.printf("%d/2=%d\n",x,lt);
			run(lt);
		}
		else
		{
			System.out.print("2/2=1\nEnd");
		}
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		run(a);

	}
}

