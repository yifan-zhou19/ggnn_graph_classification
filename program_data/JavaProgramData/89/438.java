package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int flag = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] sa = new int[n];
		int[] sb = new int[n];
		for (int i = 0;i < n;i++)
		{
			sa[i] = sb[i] = 0;
		}
		for (s = 0;;s++)
		{
		a[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[s] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[s] == 0 && b[s] == 0)
		{
			break;
		}
		}
		for (int i = 0;i < s;i++)
		{
		sa[a[i]]++;
		sb[b[i]]++;
		}
		for (int i = 0;i < n;i++)
		{
		if (sa[i] == 0 && sb[i] == n - 1)
		{
		System.out.print(i);
		System.out.print("\n");
		flag = 0;
		}
		}
		if (flag != 0)
		{
			System.out.print("NOT FOUND");
		}
	}
}

