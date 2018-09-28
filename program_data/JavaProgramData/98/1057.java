package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		final String str = "";
		int[] a = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int j;
			*(str.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
			for (j = 0; * (*(str.Substring(i)) + j) != '\0';j++)
			{
				;
			}
			a[i] = j;
		}
		final String c = "";
		int s = 0;
		int t;
		int s1;
		int j;
		for (i = 0;i < 20;i++)
		{
			t = 0;
			s1 = s;
			for (j = s1;j < n;j++)
			{
				for (int m = 0;m < a[j];m++)
				{
					c.charAt(i)[t] = str.charAt(j)[m];
					t++;
				}
				s++;
				if (t + a[j + 1] >= 80)
				{
					break;
				}
				if (s >= n)
				{
					break;
				}
				c.charAt(i)[t] = ' ';
				t++;
			}
			if (s >= n)
			{
				break;
			}
		}
		for (int k = 0;k <= i;k++)
		{
			System.out.print(c.charAt(k));
			System.out.print("\n");
		}
		return 0;
	}
}

