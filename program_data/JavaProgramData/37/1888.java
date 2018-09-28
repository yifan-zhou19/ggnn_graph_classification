package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   scanf("\n");
	   while (t-- != 0)
	   {
		 String c = new String(new char[100000]);
		 int len = 0;
		 int i;
		 int j;
		 c = new Scanner(System.in).nextLine();
		 len = c.length();
		 for (i = 0;i < len;i++)
		 {
			for (j = 0;j < len;j++)
			{
			   if (j == i)
			   {
				 continue;
			   }
			   if (c.charAt(j) == c.charAt(i))
			   {
				  break;
			   }
			}
			if (j == len)
			{
				  System.out.printf("%c\n",c.charAt(i));
				  break;
			}
		 }
		  if (i == len)
		  {
			System.out.print("no\n");
		  }
	   }
	}
}

