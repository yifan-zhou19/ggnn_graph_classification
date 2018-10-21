package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		String p;
		String str = new String(new char[1000]);
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
				str = tempVar2.charAt(0);
			}
			len = str.length();
			p = str.charAt(len - 1);
			if (p == 'g')
			{
				p = str.charAt(len - 3);
				p = '\0';
				System.out.printf("%s\n",str);
			}
			else
			{
				p = str.charAt(len - 2);
				p = '\0';
				System.out.printf("%s\n",str);
			}
		}
		return 0;
	}


}

