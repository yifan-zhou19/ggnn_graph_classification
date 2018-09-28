package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		String s = new String(new char[1000]);
		char[][] str = new char[500][500];
		char[][] result = new char[500][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k;
		int len = s.length() - n + 1;
		for (i = 0; i < len; i++)
		{
			for (j = 0; j < n; j++)
			{
				str[i][j] = s.charAt(i + j);
			}
			str[i][j] = '\0';
		}
		for (i = 0; i < len; i++)
		{
			for (j = 0; j < len - 1; j++)
			{
				if (strcmp(str[j], str[j + 1]) > 0)
				{
					String temp = new String(new char[1000]);
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		int max = 1;
		int count = 1;
		for (i = 1; i < len; i++)
		{
			if (strcmp(str[i], str[i - 1]) == 0)
			{
				count++;
				if (count > max)
				{
					max = count;
				}
			}
			else
			{
				count = 1;
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n", max);
		int num = 0;
		count = 1;
		for (i = 1; i < len; i++)
		{
			if (strcmp(str[i], str[i - 1]) == 0)
			{
				count++;
				if (count == max)
				{
					result[num] = str[i];
					num++;
				}
			}
			else
			{
				count = 1;
			}
		}

		for (i = 0; i < num; i++)
		{
			for (j = 0; j < num - 1; j++)
			{
				if (tangible.StringFunctions.strStr(s, result[j]) > tangible.StringFunctions.strStr(s, result[j + 1]))
				{
					String temp = new String(new char[1000]);
					temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				}
			}
		}
	for (i = 0; i < num; i++)
	{
			System.out.printf("%s\n", result[i]);
	}

		return 0;
	}


}

