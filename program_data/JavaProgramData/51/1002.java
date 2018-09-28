package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n??????????????counts[500]???????????????len????????
		int[] counts = new int[500];
		int len;
		int i; //i,j,k??????judge,p?????
		int j;
		int k = 0;
		int judge = 0;
		int p = 0;
		String a = new String(new char[501]); //?????a[501]???????????????????sub[500][5]??????????n????
		char[][] sub = new char[500][5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0;i <= len - n;i++) //??????n????????sub?
		{
			sub[i] = a.substring(i, i + n);
			sub[i][n] = '\0';
		}
		for (i = 0;i < len - n;i++) //?????????????
		{
			if (counts[i] == -1)
			{
				continue;
			}
			for (j = i + 1;j <= len - n;j++)
			{
				k = 0;
				judge = 0;
				while (true)
				{
					if (sub[i][k] != sub[j][k])
					{
						judge = 1;
						break;
					}
					if (sub[i][k] == '\0' && sub[j][k] == '\0')
					{
						break;
					}
					k++;
				}
				if (judge == 0)
				{
					counts[i]++;
					counts[j] = -1;
				}
			}
		}
		for (i = 500;i > 0;i--)
		{
			for (j = 0;j <= len - n;j++)
			{
				if (counts[j] == i)
				{
					if (p == 0)
					{
						System.out.print(i + 1);
						System.out.print("\n");
						p = 1;
					}
					System.out.print(sub[j]);
					System.out.print("\n");
				}
			}
			if (p == 1)
			{
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

