package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		String str = new String(new char[501]);
		int i;
		int j;
		int r;
		int flag;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			t = i + 1;
		}
		for (j = 2;j <= t;j++)
		{
			for (i = 0;i <= t - j + 1;i++)
			{
				for (r = i,flag = 1,k = j - 1;r <= i + j - 1;r++,k--)
				{
					if (str.charAt(r) != str.charAt(i + k))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (r = i;r <= i + j - 1;r++)
					{
						System.out.printf("%c",str.charAt(r));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

