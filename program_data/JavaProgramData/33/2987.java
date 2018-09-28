package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int len = a.length();
			for (int j = 0;j < len; j++)
			{
				char ans;
				switch (a.charAt(j))
				{
					case 'A':
						ans = 'T';
						break;
					case 'T':
						ans = 'A';
						break;
					case 'G':
						ans = 'C';
						break;
					case 'C':
						ans = 'G';
						break;
				}
				System.out.printf("%c", ans);
			}
			System.out.print("\n");
		}


	}
}

