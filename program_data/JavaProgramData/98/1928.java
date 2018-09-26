package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int line;
		int l1;
		int l2;
		int i;
		int j;
		int b;
		String s1 = new String(new char[40]);
		String s2 = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		line = 80;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		for (i = 1;i <= n;i++)
		{
			if (i != n)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s2 = tempVar3.charAt(0);
				}
				l2 = s2.length();
			}
			else
			{
				l2 = 0;
			}
			if (line - l1 + b > 0)
			{
				line = line - l1;
				System.out.printf("%s",s1);
			}
			else
			{
				System.out.printf("\n%s",s1);
				line = 80 - l1;
			}
			b = 0;
			if ((line-1 - l2 >= 0) && (i != n))
			{
				System.out.print(" ");
				line--;
				b = 1;
			}
			for (j = 0;j < l2;j++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s2.charAt(j));
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, l2, '\0');
			l1 = l2;
	//	    printf("*%d*",line);
		}
	}
}

