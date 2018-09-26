package <missing>;

public class GlobalMembers
{
	/*
	*12-4
	*??? 1200012851
	*2012.12.11
	*??????
	**/


	public static int Main()
	{
		int i;
		int n;
		int[] man = new int[10000];
		int a;
		int b;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			man[a] = -1;
			man[b]++;
		}
		for (i = 0; i < n; i++)
		{
			if (man[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

