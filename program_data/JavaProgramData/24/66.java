package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String p = a;
		int i;
		int j;
		int n;
		int[] b = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] sum = new int[50];
		int r = 0;
		int s = 100;
		int m = 0;
		int k;
		int t;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)

		{
			if (*(p.Substring(i)) == ' ')
			{
					m++;
					b[m] = i;
			}
		}

		b[m + 1] = n;
		for (j = 0;j <= (m + 1);j++)
		{
			sum[j] = b[j + 1] - b[j];
		}
		for (j = 0;j < (m + 1);j++)
		{
		if (r < sum[j])
		{
					r = sum[j];
					k = j;
		}
			if (s > sum[j])
			{
					s = sum[j];
					t = j;

			}
		}

			for (i = (b + k) + 1;i < b[k + 1];i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
				System.out.print("\n");
			for (i = (b + t) + 1;i < b[t + 1];i++)
			{
			System.out.printf("%c",*(p.Substring(i)));
			}
			return 0;
	}








}
