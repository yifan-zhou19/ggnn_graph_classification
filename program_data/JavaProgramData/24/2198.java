package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[50][15];
		char c;
		int i = 1;
		int n = 0;
		int max = 0;
		int min = 10;
		int x = 0;
		int y = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
			i++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c != '\n');
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			if (String.valueOf(s[i]).length() > max)
			{
				max = String.valueOf(s[i]).length();
				x = i;
			}
			if (String.valueOf(s[i]).length() < min)
			{
				min = String.valueOf(s[i]).length();
				y = i;
			}
		}
		System.out.printf("%s\n",s[x]);
		System.out.printf("%s",s[y]);
	}
}

