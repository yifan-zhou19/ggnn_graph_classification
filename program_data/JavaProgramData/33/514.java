package <missing>;

public class GlobalMembers
{
	public static char pd(char x)
	{
		char dy;
		if (x == 'A')
		{
			dy = 'T';
		}
		if (x == 'T')
		{
			dy = 'A';
		}
		if (x == 'C')
		{
			dy = 'G';
		}
		if (x == 'G')
		{
			dy = 'C';
		}
		return dy;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		char dui;
		String jianji = new String(new char[256]);
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
				jianji = tempVar2.charAt(0);
			}
			m = jianji.length();
			for (j = 0;j < m;j++)
			{
				dui = pd(jianji.charAt(j));
				System.out.printf("%c",dui);
			}
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

