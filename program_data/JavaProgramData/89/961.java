package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int[] a = new int[100000];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = 1;
		}
		int judge1;
		int judge2;
		judge1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		judge2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (judge1 == 0 && judge2 == 0)
		{
			System.out.print("NOT FOUND");
			return 0;
		}
		while (judge1 != 0 || judge2 != 0)
		{
			if (judge1 == judge2)
			{
				judge1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				judge2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				continue;
			}
			else
			{
				a[judge1] = 0;
				judge1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				judge2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int num = 0;
		int sum = 0;

		for (i = 0;i < n;i++)
		{
			if (a[i] == 1)
			{
				sum++;
				num = i;
			}
		}
		if (sum == 0 || sum > 1)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
			System.out.print(num);
		}
		return 0;
	}

}

