package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int len;
		String p;
		char[][] str1 = new char[1000][300];
		char[][] str2 = new char[300][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			len = String.valueOf(str1[i]).length();
			for (k = len - 1;k >= 0;k--)
			{
				p = str1[i] + k;
				if (strcmp(p,"A") == 0)
				{
					str2[k] = "T";
				}
				if (strcmp(p,"G") == 0)
				{
					str2[k] = "C";
				}
				if (strcmp(p,"C") == 0)
				{
					str2[k] = "G";
				}
				if (strcmp(p,"T") == 0)
				{
					str2[k] = "A";
				}
				p = "\0";
			}
			for (k = 0;k < len - 1;k++)
			{
				System.out.printf("%s",str2[k]);
			}
			System.out.printf("%s\n",str2[len - 1]);
		}
	}
}

