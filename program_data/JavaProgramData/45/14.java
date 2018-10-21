package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		char m;
		char n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i;
		for (i = 0;(m = s.charAt(i)) != '\0';i++)
		{
			for (i = 0;(n = w.charAt(i)) != '\0';i++)
			{
				if (m == n)
				{
					System.out.printf("%d\n",i);
				}
			}
					break;
		}
		return 0;
	}
}

