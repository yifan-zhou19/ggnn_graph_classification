package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String p;
		char[][] s = new char[100][100];
		char c;
		c = ' ';
		i = 0;
		p = s;
		while (c == ' ')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = tempVar.charAt(0);
			}
			c = System.in.read();
			i++;
			p = *(s + i);
		}
		for (j = i - 1;j > 0;j--)
		{
			p = *(s + j);
			System.out.printf("%s ",p);
		}
		p = s;
		System.out.printf("%s\n",p);
	}
}

