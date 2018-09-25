package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		char[] cha = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char flag;
		int i;
		int len;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				cha[str.charAt(i) - 97]++;
			}
		}

		flag = 0;
		for (i = 0;i < 26;i++)
		{
			if (cha[i] != null)
			{
				System.out.printf("%c=%d\n",i + 97,cha[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}

}

