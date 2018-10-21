package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[50][500];
		int e;
		int l;
		int s;
		int i;
		int n;
		int m;
		int sum;
		int[] len = new int[50];
		a = new Scanner(System.in).nextLine();
		n = 0;
		i = 0;
		m = 0;
		sum = 0;
		while (a.charAt(n) != '\0')
		{
			if (a.charAt(n) != ' ')
			{
				b[i][m] = a.charAt(n);
				m += 1;
				n += 1;
			}
			else
			{
				b[i][m] = '\0';
				m = 0;
				n += 1;
				i += 1;
				sum += 1;
			}
		}
		b[i][m] = '\0';

		for (i = 0;i <= sum;i++)
		{
			 len[i] = String.valueOf(b[i]).length();
		}

		for (i = sum;i > 0;i--)
		{
			for (m = 0;m < i;m++)
			{
				if ((len[m]) > (len[m + 1]))
				{
					   e = len[m];
					len[m] = len[m + 1];
					len[m + 1] = e;
				}
			}
		}
		l = len[sum];
		s = len[0];

		for (i = 0;i <= sum;i++)
		{

			if (String.valueOf(b[i]).length() == l)
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
		for (i = 0;i <= sum;i++)
		{
			if ((String.valueOf(b[i]).length()) == s)
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
		return 0;
	}

}
