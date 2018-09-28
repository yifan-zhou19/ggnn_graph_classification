package <missing>;

public class GlobalMembers
{
	public static void check(int n, int[] flag)
	{
		int a;
		int b;
		if (flag[0] == 1)
		{
			return;
		}
		if (n == 1)
		{
			flag[0] = 1;
			return;
			check(n, flag);
		}
		if (n != 1 && n % 2 == 1 && flag[0] == 0)
		{
			a = n;
			n = n * 3 + 1;
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(n);
			System.out.print("\n");
			check(n, flag);
		}
		if (n != 1 && n % 2 == 0 && flag[0] == 0)
		{
			b = n;
			n = n / 2;
			System.out.print(b);
			System.out.print("/2=");
			System.out.print(n);
			System.out.print("\n");
			check(n, flag);
		}
	}
	public static int Main()
	{
		int n;
		int[] flag = new int[1];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		check(n, flag);
		System.out.print("End");
		return 0;
	}

}

