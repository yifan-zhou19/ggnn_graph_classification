package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[20][20];
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String p1;
		String p2;
		String[] p = new String[20];
		int i = 0;
		int j;
		for (i = 0;i < 20;i++)
		{
			p[i] = str[i];
		}
		i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
			i++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		p1 = a;
		p2 = b;
		for (j = 0;j <= i;j++)
		{
			if (strcmp(p[j],p1) == 0)
			{
				p[j] = p2;
			}
		}

		for (j = 0;j <= i;j++)
		{
			if (j == 0)
			{
				System.out.printf("%s",p[j]);
			}
			else
			{
				System.out.printf(" %s",p[j]);
			}
		}
	}
}

