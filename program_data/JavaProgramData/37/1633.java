package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int n;
		int s = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100001]);
		int[] b = new int[1000];
		for (i = 0;i < t;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			n = a.length();
			for (int w = 0;w < 1000;w++)
			{
				b[w] = 0;
			}
			s = 0;
			for (j = 0;j < n - 1;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
							b[j]++;
					}
					if (b[j] > 1)
					{
						break;
					}
				}
				if (b[j] == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					s++;
					break;
				}
			}
			if (s == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
			return 0;
	}
}

