package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] n = new int[1001];
		int[] y = new int[1001];
		int num = 1;
		int max = 0;
		char a;
		for (int i = 0; i < 1001; i++)
		{
		n[i] = 0;
		}
		while ((x[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a = System.in.read();
			if (a != ',')
			{
			break;
			}
			num++;
		}
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 2; i <= num; i++)
		{
			System.in.read();
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(num);
		System.out.print(" ");
		for (int i = 1; i <= num; i++)
		{
		for (int j = x[i]; j < y[i]; j++)
		{
		n[j]++;
		}
		}
		for (int i = 1; i <= 1000; i++)
		{
		if (max < n[i])
		{
		max = n[i];
		}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

