package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static int Main()
	{
		//freopen("i.txt","r",stdin);
		int T;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}
		while (T-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (i = 0;s.charAt(i);i++)
			{
				if (s.charAt(i) == 'A')
				{
					System.out.print('T');
				}
				if (s.charAt(i) == 'T')
				{
					System.out.print('A');
				}
				if (s.charAt(i) == 'G')
				{
					System.out.print('C');
				}
				if (s.charAt(i) == 'C')
				{
					System.out.print('G');
				}
			}
			System.out.println("");
		}
	}
}

