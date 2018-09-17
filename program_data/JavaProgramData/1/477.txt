package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
		int i;
		int result;
		if (a < min)
		{
			return 0;
		}
		result = 1;
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				result += f(a / i, i);
			}
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int n;
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(num[i], 2));
			System.out.print("\n");
		}
		return 0;
	}

}

