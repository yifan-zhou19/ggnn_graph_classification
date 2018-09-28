package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int p = 0;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 0;k < n;k++)
		{
			char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			int[] b = new int[26];
			while (cin.get(c) && c != '\n')
			{
				p = 0;
				for (i = 0;i < 26;i++)
				{
					if (c == a[i])
					{
						p = 1;
						b[i]++;
						break;
					}
				}
				if (p == 0 && a[j] == 0)
				{
					a[j] = c;
					b[j]++;
					j++;
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (b[i] == 1)
				{
					System.out.print(a[i]);
					System.out.print("\n");
					break;
				}
			}
			if (i == 26)
			{
			System.out.print("no");
			System.out.print("\n");
			}
		}
		return 0;
	}
}

