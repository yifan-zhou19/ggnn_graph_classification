package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[26];
		int i;
		int n;
		int k;
		int j;
		int l;
		String s = new String(new char[100001]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = s.length() - 1;
			for (j = 0 ; j <= 25 ; j++)
			{
				a[j] = 0;
			}
			for (j = 0 ; j <= l ; j++)
			{
				a[s.charAt(j) - 'a']++;
			}
			for (j = 0 ; j <= 25 ; j++)
			{
				if (a[j] == 1)
				{
						  for (k = 0 ; k <= l ; k++)
						  {
							  if (s.charAt(k) - 'a' == j)
							  {
								 a[j] = k;
							  }
						  }
				}
				else
				{
					   a[j] = -1;
				}
			}
			for (j = 0, k = 110000 ; j <= 25 ; j++)
			{
				if ((a[j] != -1) && (a[j] < k))
				{
				   k = a[j];
				}
			}
			if (k == 110000)
			{
			   System.out.print("no");
			   System.out.print("\n");
			}
			else
			{
				System.out.print(s.charAt(k));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

