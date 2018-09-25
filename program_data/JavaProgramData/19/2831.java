package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 1;
		int t;
		char[][] a = new char[20][20];
		(char)(*p)[20];
		String x = new String(new char[20]);
		String y = new String(new char[20]);
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar;
		}
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = tempVar2;
			}
			i++;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y = tempVar4.charAt(0);
		}
		for (t = 0;t < i;t++)
		{
			if (strcmp(p + t,x) == 0)
			{
				System.out.printf("%s",y);
			}
			else
			{
				System.out.printf("%s",p + t);
			}
			if (t != i - 1)
			{
				System.out.print(" ");
			}
		}
		//printf("%s",p);
	}

}

