package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] word = new char[1000][41];
		int[] len = new int[1000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(word[i]).length();

		}
		int m = 0;
		int flag = 0;
		for (i = 0;i < n;i++)
		{
			if (m == 0)
			{
					  m += (len[i]);
					  flag = 1;
			}
			else
			{
				m += (len[i] + 1);
			}
			if (m <= 80)
			{
				if (flag == 1)
				{
					System.out.printf("%s",word[i]);
					flag = 0;
				}
				else
				{
					System.out.printf(" %s",word[i]);
				}

			}
			else
			{
				m = 0;
				System.out.print("\n");
				i--;
			}
		}



		return 0;

	}

}

