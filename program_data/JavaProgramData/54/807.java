package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100]; //m??????n? ????k?????
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i; //????
		int g = 0; //????
		m[n] = n + k;
		while (g == 0)
		{

			for (i = n - 1;i > 0;i--)
			{
					if (m[i + 1] % (n - 1) != 0)
					{
						break;
					}
					m[i] = m[i + 1] * n / (n - 1) + k;
			}
			m[n] = m[n] + n;
			if (i == 0)
			{
				g = 1;
			}
		}
		System.out.print(m[1]);
		return 0;

	}

}

