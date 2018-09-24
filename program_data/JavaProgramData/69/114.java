package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len_1 = a.length();
		int len_2 = b.length();
		int len = len_1;
		if (len_2 > len_1)
		{
			len = len_2;
		}
		int[] n_p = new int[300];
		int[] n_q = new int[300];
		int i = 0;
		int j = 0;
		for (i = 0;i < len_1;i++)
		{
			n_p[299 - i] = a.charAt(len_1 - i - 1) - '0';
		}
		for (j = 0;j < len_2;j++)
		{
			n_q[299 - j] = b.charAt(len_2 - j - 1) - '0';
		}
		int[] end = new int[300];
		for (i = 299;i > 0;i--)
		{
			if (n_p[i] + n_q[i] < 10)
			{
				end[i] = n_p[i] + n_q[i];
			}
			if (n_p[i] + n_q[i] >= 10)
			{
				end[i] = n_p[i] + n_q[i] - 10;
				n_p[i - 1]++;
			}
		}
		for (j = 0;j < 299;j++)
		{
			if (end[j] != 0)
			{
				break;
			}
		}
	//	cout<<len<<endl;
		for (i = j;i < 300;i++)
		{
			System.out.print(end[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

