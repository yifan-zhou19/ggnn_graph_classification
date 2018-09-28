package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int m = 0;
		int n = 0;
		int flag = 0;
		int[] s = new int[501]; //?????
		int[] p = new int[501];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < N;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (s[i] % 2 != 0)
			{
				p[n++] = s[i]; //?s[501]???????????p[501]?
			}
		}
		for (int j = n - 1;j > 0;j--)
		{
				for (int l = 0;l < j;l++)
				{
					if (p[l] > p[l + 1])
					{
						m = p[l];
						p[l] = p[l + 1];
						p[l + 1] = m; //?p??n???????????????
					}
				}
		} //?n-1????
		  for (i = 0;i <= n - 1;i++)
		  {
			  if (i < n - 1)
			  {
			  System.out.print(p[i]);
			  System.out.print(",");
			  }
			  else
			  {
				  System.out.print(p[i]);
			  }
		  }
		return 0;
	}

}

