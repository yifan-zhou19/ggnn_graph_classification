package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String c = new String(new char[100]);
	   int i;
	   int len;
	   int flag;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   c = tempVar.charAt(0);
	   }
	   len = c.length();
	   int a;
	   int b;
	   b = 0;
	   if (len == 1)
	   {
		   System.out.printf("0\n%d",c.charAt(0) - '0');
	   }
	   else
	   {
		   flag = (c.charAt(0) - '0') * 10 + c.charAt(1) - '0';
		   if (len == 2 && flag < 13)
		   {
		   System.out.printf("0\n%d",flag);
		   }
	   else
	   {
	   for (i = 0;i <= len - 1;i++)
	   {
		   a = b * 10 + c.charAt(i) - '0';
		   if (a < 13)
		   {
			   c = tangible.StringFunctions.changeCharacter(c, i, '0');
			   b = a;
		   }
		   else
		   {
			   b = a % 13;
			   c = tangible.StringFunctions.changeCharacter(c, i, (a - b) / 13 + '0');
		   }
	   }
	   if (flag >= 13)
	   {
		   for (i = 1;i < len;i++)
		   {
			   System.out.printf("%c",c.charAt(i));
		   }
		   System.out.printf("\n%d",b);
	   }
	   else
	   {
		   for (i = 2;i < len;i++)
		   {
			   System.out.printf("%c",c.charAt(i));
		   }
			System.out.printf("\n%d",b);
	   }
	   System.out.print("\n");
	   }
	   }
	}
}

