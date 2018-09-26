package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int g = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a1 = new int[1000000];
		int[] a2 = new int[1000000];
		int[] num = new int[1000000];
		for (i = 0; i <= n * (n - 1); i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a1[i] == 0 && a2[i] == 0)
			{
				break;
			}
			num[a2[i]]++;
		}
		int[] p = num;
		for (; p < num + n; p++)
		{
			if (p[0] == n - 1)
			{
				g = 1;
				System.out.print(p - num);
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}


}

