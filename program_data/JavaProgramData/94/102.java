package <missing>;

public class GlobalMembers
{
	/*??????????
	 ?????? 00948344
	 ?????2010/12/24
	 */



	public static int Main()
	{
		int n;
		int[] s = new int[500];
		int[] t = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int len = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] % 2 != 0)
			{
				t[len] = s[i];
				len++;
			}
		}
		if (len == 0)
		{
			return 0;
		}
		for (i = 0;i < len - 1;i++)
		{
			for (j = 0;j < len - 1 - i;j++)
			{
				if (t[j] > t[j + 1])
				{
					k = t[j];
					t[j] = t[j + 1];
					t[j + 1] = k;
				}
			}
		}
		System.out.print(t[0]);
		for (i = 1;i < len;i++)
		{
			System.out.print(',');
			System.out.print(t[i]);
		}
		return 0;
	}


}

