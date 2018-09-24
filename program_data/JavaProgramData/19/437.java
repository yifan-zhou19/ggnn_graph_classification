package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		(char)(*p)[100];
		int i;
		int j;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			k = i;
		if (System.in.read() == '\n')
		{
			break;
		}
		}
		p = str;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i <= k;i++)
		{
			if (strcmp(*(p + i),str1) == 0)
			{
				*(p + i) = str2;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (i < k)
			{
				System.out.printf("%s ",*(p + i));
			}
		else
		{
			System.out.printf("%s",*(p + i));
		}
		}
	}
}

