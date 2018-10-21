package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		String a = new String(new char[256]);
		String pc;
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
			m = a.length();
			pc = a;
			for (j = 0;j <= m - 1;j++)
			{
				switch (*(pc.Substring(j)))
				{
					case 'A':
						*(pc.Substring(j)) = 'T';
						break;
					case 'T':
						*(pc.Substring(j)) = 'A';
						break;
					case 'C':
						*(pc.Substring(j)) = 'G';
						break;
					case 'G':
						*(pc.Substring(j)) = 'C';
						break;
				}
			}
			System.out.println(a);
		}
		return 0;
	}
}

