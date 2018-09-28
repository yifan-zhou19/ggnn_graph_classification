package <missing>;

public class GlobalMembers
{
	public static int output(int[] b, int a)
	{
		sort(b,b + a);
		for (int i = 0;i < a - 1;i++)
		{
		System.out.print(b[i]);
		System.out.print(' ');
		}
		System.out.print(b[a - 1]);
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int input = new int(int a,int s);
		input(a, b);
		return 0;
	}
	public static int input(int a,int s)
	{
		int[] b = new int[1000];
		int[] c = new int[1000];
		for (int i = 0;i < a;i++)
		{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < s;i++)
		{
		c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		output(b, a);
		System.out.print(' ');
		output(c, s);
	}
}

