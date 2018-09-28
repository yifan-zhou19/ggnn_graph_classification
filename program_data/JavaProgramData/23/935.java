package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] p = new String[100];
		char[][] str = new char[100][100];
		char c;
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			p[i] = *(str + i);
		}
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] = tempVar;
			}
			if (c = System.in.read() == '\n')
			{
				break;
			}
		}

		System.out.printf("%s",p[i]);
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf(" %s",p[j]);
		}




	}
}

