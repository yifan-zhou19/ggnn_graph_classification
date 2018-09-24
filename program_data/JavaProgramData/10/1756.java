package <missing>;

public class GlobalMembers
{
	///#include<memory>

	public static int Main()
	{
		int[] s = new int[28];
		int[] m = new int[28];
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[i] = 1;
		}
		for (i = 1;i < n; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (s[i] <= s[j] != 0 && m[j] + 1 > m[i])
				{
					m[i] = m[j] + 1;
				}
			}
		}
		int max = 0;
		for (i = 0; i < n; i++)
		{
			if (max < m[i])
			{
				max = m[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

