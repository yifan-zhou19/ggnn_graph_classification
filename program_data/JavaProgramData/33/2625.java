package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		char t;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		for (j = 0;j < a.length();j++)
		{

				switch (a.charAt(j))
				{
				case'A':
					t = 'T';
					break;
				case'T':
					t = 'A';
					break;
				case'C':
					t = 'G';
					break;
				case'G':
					t = 'C';
					break;
				}
				System.out.printf("%c",t);
		}
		System.out.print("\n");
		}

		return 0;
	}

}

