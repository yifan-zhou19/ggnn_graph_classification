package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int i;
		String str = new String(new char[30]);
		String p;
		String e = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			p = str.Substring(len) - 1;
			if (p == 'y' && *(p - 1) == 'l')
			{
				*(p - 1) = '\0';
			}
			if (p == 'g' && *(p - 1) == 'n' && *(p - 2) == 'i')
			{
				*(p - 2) = '\0';
			}
			if (p == 'r' && *(p - 1) == 'e')
			{
				*(p - 1) = '\0';
			}
			System.out.printf("%s\n",str);
		}
	}

}

