package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		char[][] s = new char[300][100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d,",String.valueOf(s[j]).length());
		}
		System.out.printf("%d",String.valueOf(s[i]).length());
	}

}

