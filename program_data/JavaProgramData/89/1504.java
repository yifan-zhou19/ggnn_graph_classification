package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] p = new int[10005];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//if (n!=32&&n!=64&&n!=128&&n!=256&&n!=512)cout<<n;
		if (n == 1)
		{
			System.out.print(0);
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			p[i] = 0;
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((i == 0) & (j == 0))
		{
			System.out.print("NOT FOUND");
			return 0;
		}
		while (!((i == 0) && (j == 0)))
		{
			p[i] = -100000;
			p[j] += i;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == ((n * (n - 1) / 2) - i))
			{
			System.out.print(i);
			return 0;
			}
		}
		System.out.print("NOT FOUND");
		//while(1);
	}
}

