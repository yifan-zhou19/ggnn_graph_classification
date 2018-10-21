package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int k;
		String a = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		for (j = 1;j < len;j++) //??????
		{
			for (i = 0;i < len - 1;i++) //??????
			{
				int e = 0;
				if ((j + 1) % 2 == 0)
				{
					for (k = i;k <= (j + 1) / 2 + i - 1;k++) //??????????
					{
						if (a.charAt(k) != a.charAt(i + i + j - k))
						{
							e = 1;
							break;
						}
					}

				}
				else
				{
					for (k = i;k <= (j / 2 - 1 + i);k++)
					{
						if (a.charAt(k) != a.charAt(i + i + j - k))
						{
							e = 1;
							break;
						}
					}
				}
				if (e == 0) //????
				{
					for (k = i;k < i + j;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.printf("%c\n",a.charAt(i + j));
				}
			}
		}
		return 0;
	}

}

