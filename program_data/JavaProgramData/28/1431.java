package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[30000]);
		int n;
		int i;
		int j;
		int k;
		int[] m = new int[300];
		int[] dc = new int[300];
		int e;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		m[0] = 0;
		for (i = 0,k = 1;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				m[k] = i;
				k++;
			}
		}
		if (k == 1)
		{
			System.out.printf("%d",n);
		}
		else
		{
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				dc[i] = m[i + 1] - m[i];
			}
			else if (i == k - 1)
			{
				dc[i] = n - m[i] - 1;
			}
			else if (i != 0 && i != k - 1)
			{
				dc[i] = m[i + 1] - m[i] - 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (dc[i] != 0)
			{
			if (i != k - 1)
			{
				System.out.printf("%d,",dc[i]);
			}
			else
			{
				System.out.printf("%d",dc[i]);
			}
			}
		}
		}

			return 0;
	}

}
