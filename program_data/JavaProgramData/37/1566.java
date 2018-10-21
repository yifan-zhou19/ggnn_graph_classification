package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1;i <= n;i++)
		{
			int[] a = new int[110000];
			int l;
			for (int i = 1;i <= 100000;i++)
			{
				a[i] = System.in.read();
				if (a[i] == 10)
				{
					l = i - 1;
					break;
				}
			}
			int p = 0;
			for (int i = 1;i <= l;i++)
			{
				int f = 0;
				for (int j = 1;j <= l;j++)
				{
					if (a[j] == a[i])
					{
						f++;
					}
				}
				if (f == 1)
				{
					p = 1;
					System.out.print(a[i]);
					break;
				}
			}
			if (p == 0)
			{
				System.out.print("no");
			}
			System.out.print("\n");
		}
		return 0;
	}

}

