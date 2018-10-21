package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String c = new String(new char[81]);
		   int i;
		   int j;
		   int n;
		   int a;
		   int length;
		   int p;
		   int q;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   System.in.read();
		   for (i = 0;i < n;i++)
		   {
				   c = new Scanner(System.in).nextLine();
				   length = c.length();
				   p = 0;
				   q = 0;
				   if (c.charAt(0) == '_' || (c.charAt(0) > 64 && c.charAt(0) < 91) || (c.charAt(0)>96 && c.charAt(0) < 123))
				   {
						   p = 1;
				   }
				   else
				   {
						   p = 0;
				   }
				   for (j = 0;j < length;j++)
				   {
						   if (c.charAt(j) == '_' || (c.charAt(j) > 64 && c.charAt(j) < 91) || (c.charAt(j)>96 && c.charAt(j) < 123) || (c.charAt(j)>47 && c.charAt(j) < 58))
						   {
								   q = 1;
						   }
						   else
						   {
								   q = 0;
								   break;
						   }
				   }
				   if (p != 0 && q != 0)
				   {
						   a = 1;
				   }
				   else
				   {
						   a = 0;
				   }
				   System.out.printf("%d\n",a);
		   }
		   return 0;
	}

}

