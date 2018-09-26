package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String beichushu = new String(new char[200]);
	   beichushu = new Scanner(System.in).nextLine();
	   int i = 0;
	   int a;
	   int b;
	   int x = 0;
	   int l;
	   a = (beichushu.charAt(0) - '0') / 13;
	   b = (beichushu.charAt(0) - '0') % 13;
	   l = beichushu.length();
	   if (l == 1)
	   {
		 System.out.printf("%d\n%d",(beichushu.charAt(0) - '0') / 13,(beichushu.charAt(0) - '0') % 13);
	   }
	   if (l == 2)
	   {
		 System.out.printf("%d\n%d",((beichushu.charAt(0) - '0') * 10 + beichushu.charAt(1) - '0') / 13,((beichushu.charAt(0) - '0') * 10 + beichushu.charAt(1) - '0') % 13);
	   }
	   if (l > 2)
	   {
		   for (i = 0;beichushu.charAt(i + 1) != '\0';i++)
		   {
			b = (b % 13) * 10 + beichushu.charAt(i + 1) - '0';
			x = x + 1;
			a = b / 13;
			if (a == 0 && x == 1)
			{
			  continue;
			}
			else
			{
			  System.out.printf("%d",a);
			}
		   }
			System.out.printf("\n%d",b % 13);
	   }
	   System.in.read();
	   System.in.read();
	}

}
