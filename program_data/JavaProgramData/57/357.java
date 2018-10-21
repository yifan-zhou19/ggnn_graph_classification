package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int l;
	   int i;
	   int j;
	   String a = new String(new char[50]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (j = 0;j <= n;j++)
	   {
	   a = new Scanner(System.in).nextLine();
	   l = a.length();
	   if (a.charAt(l - 2) == 'e' && a.charAt(l - 1) == 'r')
	   {
		   for (i = 0;i < l - 2;i++)
		   {
			   System.out.printf("%c",a.charAt(i));
		   }
		   System.out.print("\n");
	   }
	   if (a.charAt(l - 2) == 'l' && a.charAt(l - 1) == 'y')
	   {
		   for (i = 0;i < l - 2;i++)
		   {
			   System.out.printf("%c",a.charAt(i));
		   }
		   System.out.print("\n");
	   }
	   if (a.charAt(l - 3) == 'i' && a.charAt(l - 2) == 'n' && a.charAt(l - 1) == 'g')
	   {
		   for (i = 0;i < l - 3;i++)
		   {
			   System.out.printf("%c",a.charAt(i));
		   }
		   System.out.print("\n");
	   }
	   }
	}


}

