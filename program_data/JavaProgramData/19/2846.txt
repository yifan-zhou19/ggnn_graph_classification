package <missing>;

public class GlobalMembers
{
	public static char[][] str = new char[100][100];
	public static String s = new String(new char[100]);
	public static String t = new String(new char[100]);
	public static char c;

	public static int Main()
	{
		int cnt = 0;
		while (true)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 str[cnt++] = tempVar.charAt(0);
			 }
			 if (System.in.read() == '\n')
			 {
				   break;
			 }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		for (int i = 0;i < cnt;i++)
		{
				if (strcmp(str[i],s) == 0)
				{
					   str[i] = t;
				}
		}
		for (int i = 0;i < cnt - 1;i++)
		{
				System.out.printf("%s ",str[i]);
		}
		System.out.printf("%s\n",str[cnt - 1]);
		return 0;
	}

}

