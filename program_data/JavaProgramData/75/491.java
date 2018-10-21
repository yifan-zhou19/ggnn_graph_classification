package <missing>;

public class GlobalMembers
{
	/*
	 * ???: 1000010191_39_8.cpp
	 * ??: ???
	 * ????: 2011-1-1
	 * ??: ?????
	 */


	public static int Main()
	{
		int n = 0;
		char ch;
		int[] s = new int[2000];
		int[] e = new int[2000];
		int[] d = new int[1001];
		//??
		do
		{
			n++;
			s[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
		} while (ch == ',');
		for (int i = 1;i <= n;i++)
		{
			e[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		//??
		for (int i = 1;i <= n;i++)
		{
			for (int j = s[i];j < e[i];j++)
			{
				d[j]++;
			}
		}
		System.out.print(n);
		System.out.print(' ');
		int max = 0;
		for (int i = 0;i < 1000;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

