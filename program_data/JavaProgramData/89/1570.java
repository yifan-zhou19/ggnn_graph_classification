package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] sumA = new int[10000];
		int[] sumB = new int[10000];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int s = 0;
		a[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[s] != 0 || b[s] != 0)
		{
			sumA[a[s]]++;
			sumB[b[s]]++;
			s++;
			a[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			if (sumA[i] == 0 && sumB[i] != 0)
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

