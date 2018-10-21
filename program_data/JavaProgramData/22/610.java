package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
		int[] r = new int[300];
		int flag = 0;
		String s = new String(new char[1200]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0,k = -1;i <= n - 1;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				flag = 1;
				k++;
				for (j = i, r[k] = s.charAt(i) - '0';s.charAt(j + 1) >= '0' && s.charAt(j + 1) <= '9';j++)
				{
					r[k] = 10 * r[k] + s.charAt(j + 1) - '1' + 1;
				}
				i = j;
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			for (j = 0;j <= k - 1 - i;j++)
			{
				if (r[j] > r[j + 1])
				{
					t = r[j];
					r[j] = r[j + 1];
					r[j + 1] = t;
				}
			}
		}
		if (flag == 0 || k == 0 || r[0] == r[k])
		{
			System.out.print("No");
		}
		if (flag == 1)
		{
			for (i = k;i >= 1;i--)
			{
				if (r[i - 1] < r[i])
				{
					System.out.printf("%d",r[i - 1]);
					break;
				}
			}
		}

	}


}
