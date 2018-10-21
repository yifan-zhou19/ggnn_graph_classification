package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int m = 0;
		char[] str = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {'0', '\0', '\0', '\0'};
		char max = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			if (str[0] == 0)
			{
				break;
			}

	l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str[i] > max)
				{
					max = str[i];
					m = i;
				}
			}
			if (m == l - 1)
			{
				for (i = l;i = l + 2;i++)
				{
					str[i] = substr[i - l];
				}
			}
			else
			{
				for (i = l - 1;i > m;i--)
				{
					str[i + 3] = str[i];
				}
				for (i = m + 1;i < m + 4;i++)
				{
					str[i] = substr[i - m - 1];
				}
			}
			System.out.printf("%s\n",str);
			m = 0;
			max = 0;
	for (i = 0;i < 20;i++)
	{
		str[i] = 0;
	}
	for (i = 0;i < 3;i++)
	{
		substr[i] = 0;
	}
		}
		return 0;
	}
}

