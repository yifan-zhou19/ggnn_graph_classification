package <missing>;

public class GlobalMembers
{
	public static int panduan(String str3, String str4, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (!str3[i].equals(str4[i]))
			{
				return 0;
			}
		}
		return 1;
	} //????????????????????1????0
	public static int Main()
	{
		int N;
		int l;
		int i;
		int j;
		int max = 0;
		String str = new String(new char[500]);
		char[][] str2 = new char[500][500];
		int[] a = new int[500];
		for (i = 0;i < 500;i++)
		{
			a[i] = 1;
		}
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (i = 0;i <= l - N;i++)
		{
			for (j = 0;j < N;j++)
			{
				str2[i][j] = str.charAt(i + j);
			}
			str2[i][N] = '\0';

		} //?????N?????
		for (i = l - N - 1;i >= 0;i--)
		{
			for (j = l - N;j > i;j--)
			{
				a[i] = a[i] + panduan(str2[i], str2[j], N); //???????
			}
		}
		for (i = 0;i <= l - N;i++)
		{
			if (a[i] >= max)
			{
				max = a[i];
			}
		} //?????
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0;i <= l - N;i++)
			{
				if (a[i] == max)
				{
					System.out.print(str2[i]);
					System.out.print("\n");
				}
			}
		} //?????????????
		return 0;



	}



}

