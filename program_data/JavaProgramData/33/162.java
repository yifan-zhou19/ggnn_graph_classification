package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[256]);
		char o;
		char p;
		char q;
		char r;
		o = 'T';
		p = 'A';
		q = 'C';
		r = 'G';
		int i;
		int j;
		int len;
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
					System.out.printf("%c",o);
				}
				else if (str.charAt(j) == 'T')
				{
					System.out.printf("%c",p);
				}
				else if (str.charAt(j) == 'C')
				{
					System.out.printf("%c",r);
				}
				else
				{
					System.out.printf("%c",q);
				}
			}
			System.out.print("\n");
		}


		return 0;
	}
}

