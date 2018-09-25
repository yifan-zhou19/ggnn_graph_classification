package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		String c = new String(new char[201]);
		int l;
		int i;
		int m;
		int[] d = new int[201];
		int y;
		int j;
		while (scanf("%s",a) != EOF)
		{
			l = a.length();
			b = a;
			for (i = 0;i < l;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			c = a;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = 0;i < l;i++)
	{
				if (a.charAt(i) == '(')
				{
					for (j = i + 1;j < l;j++)
					{
						if (a.charAt(j) == '(')
						{
							break;
						}
						else
						{
							if (a.charAt(j) == ')')
							{
								a = tangible.StringFunctions.changeCharacter(a, i, a[j] = 'a');
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto loop;
							}
						}
					}
				}
	}
		 for (i = 0;i < l;i++)
		 {
			 if (a.charAt(i) == '(')
			 {
				 b = tangible.StringFunctions.changeCharacter(b, i, '$');
			 }
			 if (a.charAt(i) == ')')
			 {
				 b = tangible.StringFunctions.changeCharacter(b, i, '?');
			 }
		 }
		 System.out.printf("%s\n%s\n",c,b);
		}
	}
}

