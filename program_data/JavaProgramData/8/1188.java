package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void f(int x);
		f(a);
		System.out.print(" ");
		f(b);
		System.out.print("\n");
	}
	public static void f(int x)
	{
		int i;
		int t;
		int j;
		int[] str = new int[100];
		for (i = 1; i <= x; i++)
		{
			str[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= x - 1; i++)
		{
			for (j = 1; j <= x - i; j++)
			{
				if (str[j] > str[j + 1])
				{
					t = str[j], str[j] = str[j + 1], str[j + 1] = t;
				}
			}
		}
		for (i = 1; i <= x - 1; i++)
		{
			System.out.print(str[i]);
			System.out.print(" ");
		}
		System.out.print(str[x]);
		return;
	}


}

