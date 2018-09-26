package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[N]);
	public static String str2 = new String(new char[N]);
	public static String temp = new String(new char[N]);

	public static int max(int x,int y)
	{
		return (x > y != 0?x:y);
	}

	public static void major(String str1, String str2)
	{
		int[] a = new int[N];
		int[] b = new int[N];
		int len1;
		int len2;
		int len;
		int t;
		int jump;
		int i;
			len1 = str1.length();
			len2 = str2.length();
			if (len1 < len2)
			{
				temp = str1;
				t = len1;
				str1 = str2;
				len1 = len2;
				str2 = temp;
				len2 = t;
			}
			len = max(len1, len2);
			jump = len - len2 + 1;
			for (i = len;i >= 0;i--)
			{
				str1[i] = str1[i - 1];
			}
			str1[0] = '0';
			for (i = len;i >= jump;i--)
			{
				str2[i] = str2[i - jump];
			}
			for (i = 0;i < jump;i++)
			{
				str2[i] = '0';
			}
			for (i = len;i >= 0;i--)
			{
				a[i] = str1[i] - '0';
				b[i] = str2[i] - '0';
			}
			for (i = len;i >= 0;i--)
			{
				if (a[i] >= b[i])
				{
					a[i] = a[i] - b[i];
				}
				else
				{
					a[i] = a[i] + 10 - b[i];
					a[i - 1] -= 1;
				}
			}
			if (a[1] == 0)
			{
				for (i = 0;i <= len - 2;i++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, i, a[i + 2] + '0');
				}
				temp = tangible.StringFunctions.changeCharacter(temp, len - 1, '\0');
			}
			else if (a[1] != 0)
			{
				for (i = 0;i <= len - 1;i++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, i, a[i + 1] + '0');
				}
				temp = tangible.StringFunctions.changeCharacter(temp, len, '\0');
			}
			System.out.printf("%s\n",temp);
	}
	public static void Main()
	{
		char[][] s1 = new char[100][N];
		char[][] s2 = new char[100][N];
		int i;
		int n;
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
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[i] = tempVar3.charAt(0);
			}
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
		for (i = 0;i < n;i++)
		{
			major(s1[i], s2[i]);
		}
	}
}

