package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];

	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		int n;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n);
			sort(b,b + n);
			int re = 0;
			int a1 = 0;
			int a2 = n - 1;
			int b1 = 0;
			int b2 = n - 1;
			int pa;
			int pb;
			for (int i = 0;i < n;i++)
			{
				if (b[b1] > a[a1])
				{
					pa = a1++;
					pb = b1++;
				}
				else if (b[b2] > a[a2])
				{
					pa = a2--;
					pb = b2--;
				}
				else
				{
					pa = a2--;
					pb = b1++;
				}
				if (b[pb] > a[pa])
				{
					re++;
				}
				else if (b[pb] < a[pa])
				{
					re--;
				}
			}
			System.out.print(re * 200);
			System.out.print("\n");
		}

		return 1;
	}

}

