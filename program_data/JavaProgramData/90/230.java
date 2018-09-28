package <missing>;

public class GlobalMembers
{
	public static int put(int apple,int plate,int min)
	{
		int count = 0;
		if (plate == 1)
		{
			if (apple >= min)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		for (int i = min;i <= apple;i++)
		{
			count += put(apple - i, plate-1, i);
		}
		return count;
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(put(m, n, 0));
			System.out.print("\n");
		}
		return 0;
	}

}

