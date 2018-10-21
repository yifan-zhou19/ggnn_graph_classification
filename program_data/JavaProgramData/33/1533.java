package <missing>;

public class GlobalMembers
{
	public static char peidui(char x)
	{
	   char s;
	   s = 0;
	   if (x == 'A')
	   {
		   s = 'T';
	   }
	   if (x == 'T')
	   {
		   s = 'A';
	   }
	   if (x == 'C')
	   {
		   s = 'G';
	   }
	   if (x == 'G')
	   {
		   s = 'C';
	   }
	   return s;
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int len;
	   String jianji = new String(new char[256]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   len = 0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   jianji = tempVar2.charAt(0);
	   }
	   len = jianji.length();
	   for (j = 0;j < len;j++)
	   {
	   System.out.printf("%c",peidui(jianji.charAt(j)));
	   }
	   System.out.print("\n");
	   }

	   return 0;
	}
}

