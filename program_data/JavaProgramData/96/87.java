package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int l;
		int j;
		int x = 0;
		int y = 0;
		String n = new String(new char[100]);
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
					   x = y * 10 + n.charAt(i) - '0';
					   y = x % 13;
					   s = tangible.StringFunctions.changeCharacter(s, i, x / 13 + '0');
		}
					   if (l == 1)
					   {
					   System.out.printf("%d\n",0);
					   System.out.printf("%d",y);
					   }
					   else if (l == 2)
					   {
					   if (s.charAt(1) == 0)
					   {
					   System.out.printf("%d\n",0);
					   System.out.printf("%d",y);
					   }
					   else
					   {
					   System.out.printf("%c\n%d",s.charAt(1),y);
					   }
					   }
					   else
					   {
					   if (s.charAt(1) == '0')
					   {
					   for (i = 2;i < l;i++)
					   {
					   System.out.printf("%c",s.charAt(i));
					   }
					   System.out.printf("\n%d",y);
					   }
					   else
					   {
						   for (i = 1;i < l;i++)
						   {
						   System.out.printf("%c",s.charAt(i));
						   }
						   System.out.printf("\n%d",y);
					   }
					   }
						   System.in.read();
						   System.in.read();
	}
}

