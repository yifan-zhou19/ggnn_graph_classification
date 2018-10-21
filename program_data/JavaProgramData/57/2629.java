package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int i;
		int k;
		int n;
		int len;
		char[][] str = new char[50][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(str[i]).length();
		for (k = 0;k < len;k++)
		{
			if (str[i][len - 1] == 'g')
			{
				str[i][len - 3] = '\0';
			}
			else
			{
				str[i][len - 2] = '\0';
			}
		}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);
		}
			return 0;
		}
}

