package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[255]);
	public static String b = new String(new char[255]);
	public static String c = new String(new char[255]);
	public static int plus(int l1,int l2)
	{
		 int i;
		 int l;
		if (l1 > l2)
		{
			l = l1;
		}
		else
		{
			l = l2;
		}
	   for (i = 0;i < l;i++)
	   {
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + c.charAt(i));
			  if (b.charAt(i) >= 10)
			  {
				b.charAt(i) -= 10;
				b.charAt(i + 1)++;
			  }
	   }
		if (b.charAt(l) != null)
		{
			l++;
		}
		return l;
	}
	public static int Main()
	{
	   int l1;
	   int l2;
	   int l;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   l1 = a.length();
	   System.in.read();
	   for (j = 0;j < l1;j++)
	   {
		   b = tangible.StringFunctions.changeCharacter(b, l1 - j - 1, a.charAt(j) - '0');
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   l2 = a.length();
	   for (j = 0;j < l2;j++)
	   {
		   c = tangible.StringFunctions.changeCharacter(c, l2 - j - 1, a.charAt(j) - '0');
	   }
	   l = plus(l1, l2);
	   while (b.charAt(l - 1) == 0 && l != 0)
	   {
	   l--;
	   }
	   for (j = l - 1;j >= 0;j--)
	   {
	   System.out.printf("%c",b.charAt(j) + '0');
	   }
	   if (l == 0)
	   {
		   System.out.print("0");
	   }
	  return 0;
	}

}

