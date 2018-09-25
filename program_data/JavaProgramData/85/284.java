package <missing>;

public class GlobalMembers
{
	public static void judge(String str)
	{
		int j;
		if (!str[0].equals('_') && (str[0].compareTo('Z') > 0 || str[0].compareTo('A') < 0) && (str[0].compareTo('z') > 0 || str[0].compareTo('a') < 0))
		{
			System.out.print("no\n");
		}
		else
		{
			for (j = 1; !str[j].equals('\0');j++)
			{
				if (!str[j].equals('_') && (str[j].compareTo('Z') > 0 || str[j].compareTo('A') < 0) && (str[j].compareTo('z') > 0 || str[j].compareTo('a') < 0) && (str[j].compareTo('0') < 0 || str[j].compareTo('9') > 0))
				{
					System.out.print("no\n");
					break;
				}
			}
			if (str[j].equals('\0'))
			{
				System.out.print("yes\n");
			}
		}
	}
	public static void Main()
	{
		char[][] c = new char[100][100];
		int n;
		int i;
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			judge(c[i]);
		}
	}
}

