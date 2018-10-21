package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int len;
		int i;
		int j;
		String str = new String(new char[256]);
		char s;

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
			for (j = 0;j < len;j++)
			{
				if (str.charAt(j) == 'A')
				{
					s = 'T';
				}
				if (str.charAt(j) == 'T')
				{
					s = 'A';
				}
				if (str.charAt(j) == 'C')
				{
					s = 'G';
				}
				if (str.charAt(j) == 'G')
				{
					s = 'C';
				}
				if (j < len - 1)
				{
					System.out.printf("%c",s);
				}
				else
				{
					System.out.printf("%c\n",s);
				}
			}

		}
	}
}

