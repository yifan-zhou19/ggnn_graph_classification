package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int j;
		int times;
		int k;
		int flag = 1;
		String str = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 2;i <= len;i++)
		{
			times = i / 2;
			for (j = 0;j <= len - i;j++)
			{
				for (k = j;k <= j + times - 1;k++)
				{
					if (str.charAt(k) != str.charAt(i + 2 * j - 1 - k))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
						for (k = j;k <= i + j - 1;k++)
						{
					System.out.printf("%c",str.charAt(k));
						}
					System.out.print("\n");
				}
				flag = 1;
			}
		}
		return 0;

	}
}

