package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[2000][501];
		int i;
		int j;
		int k;
		int l;
		int p;
		int q;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i <= l - 1;i++) //????a[0]????,???????????????????
		{
			for (j = i + 1;j <= l - 1;j++) //?a[0]????????
			{
				if (a.charAt(i) == a.charAt(j)) //?????
				{
					for (k = 1;k <= (j - i + 1) / 2;k++) //?????????????
					{
						if (a.charAt(i + k) != a.charAt(j - k))
						{
							break;
						}
						else if (a.charAt(i + k) == a.charAt(j - k) && k == (j - i + 1) / 2)
						{
							q = 0;
							t++;
							for (p = i;p <= j;p++)
							{
								b[t][q++] = a.charAt(p);
							}
							b[t][q] = '\0';
						}
					}
				}
			}
		}
		for (i = 2;i <= l;i++)
		{
			for (j = 1;j <= t;j++)
			{
				if (String.valueOf(b[j]).length() == i)
				{
					System.out.printf("%s",b[j]);
					System.out.print("\n");
				}
			}
		}
	}
}

