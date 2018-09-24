package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		String a = new String(new char[256]);
		char t = 'T';
		char b = 'A';
		char g = 'G';
		char c = 'C';
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
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.printf("%c",t);
				}
				if (a.charAt(j) == 'T')
				{
					System.out.printf("%c",b);
				}
				if (a.charAt(j) == 'C')
				{
					System.out.printf("%c",g);
				}
				if (a.charAt(j) == 'G')
				{
					System.out.printf("%c",c);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

