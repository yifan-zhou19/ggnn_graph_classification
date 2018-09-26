package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int t;
		int a1;
		int a2;
		int i;
		int j;
		a1 = a.length();
		a2 = b.length();
		if (a1 < a2)
		{
			c = a;
			a = b;
			b = c;
			t = a1;
			a1 = a2;
			a2 = t;
		}
		int d;
	   for (i = a2 - 1,j = a1 - 1;i > 0;i--,j--)
	   {
		   d = a.charAt(j) + b.charAt(i) - '0'-'0';
		   a = tangible.StringFunctions.changeCharacter(a, j, d % 10 + '0');
		   if (d > 9)
		   {
		   a.charAt(j - 1)++;
		   }
	   }
	   a = tangible.StringFunctions.changeCharacter(a, a1 - a2, a.charAt(a1 - a2) + b.charAt(0) - '0');
	   for (i = a1 - a2;i > 0;i--)
	   {
		   if (a.charAt(i) > '9')
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
			   a.charAt(i - 1)++;
		   }
	   }
	   if (a.charAt(0) > '9')
	   {
		   a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(0) - 10);
		   System.out.print("1");
		   System.out.printf("%s",a);
	   }
	   else
	   {
		   for (i = 0;i < a1;i++)
		   {
			   if (a.charAt(i) != '0')
			   {
				   break;
			   }
		   }
			   if (i == a1)
			   {
				 System.out.print("0");
			   }
				else
				{
		   for (j = i;j < a1;j++)
		   {
		   System.out.printf("%c",a.charAt(j));
		   }
				}
	   }
	}

}

