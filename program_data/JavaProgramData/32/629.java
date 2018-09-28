package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		final String a = "";
		final String b = "";
		final String c = "";
		int[] m = new int[100];
		int[] n = new int[100];
		int[] ans = new int[100];
		int counter;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (counter = 0;counter < k;counter++)
		{
			a = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
	//		puts(a);
			b = new Scanner(System.in).nextLine();
	//		puts(b);
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				m[j] = a.charAt(j) - 48;
			}
			int m_c = j - 1;
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				n[j] = b.charAt(j) - 48;
			}
			int n_c = j - 1; //??????????????m_c+1?n_c+1?????????
			for (i = 0;i <= m_c;i++) //??m?n?????????????????????????????
			{
				if (i <= n_c)
				{
					if (m[m_c - i] >= n[n_c - i])
					{
						ans[i] = m[m_c - i] - n[n_c - i];
					}
					else
					{
						ans[i] = m[m_c - i] + 10 - n[n_c - i];
						m[m_c - i - 1] = m[m_c - i - 1] - 1;
					}
				}
				else
				{
					ans[i] = m[m_c - i];
				}
			}
			for (i = 0;i <= m_c;i++)
			{
				System.out.print(ans[m_c - i]);
			}
			System.out.print('\n');


		}



	}
}

