package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int max;
		int maxone;
		int[] person = new int[99999];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = 0;
		maxone = -1;
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a == 0 && b == 0)
			{
				break;
			}
			person[b]++;
			if (person[b] > max)
			{
				max = person[b];
				maxone = b;
			}
		}
		if (max == n - 1)
		{
			System.out.print(maxone);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

