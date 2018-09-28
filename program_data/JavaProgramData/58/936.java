package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int l;
	   int j;
	   int flag;
	   String a = new String(new char[81]);
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a = new Scanner(System.in).nextLine();
	   for (i = 1; i <= n; i++)
	   {
		   flag = 1;
		   a = new Scanner(System.in).nextLine();
		   l = a.length();
		   if (a.charAt(0) != '_' && (a.charAt(0) < 'a' || a.charAt(0) > 'z') && (a.charAt(0) < 'A' || a.charAt(0) > 'Z'))
		   {
			   flag = 0;
			   System.out.print("0");
			   System.out.print("\n");
		   }
		   for (j = 1; j < l; j++)
		   {
			   if (a.charAt(j) != '_' && (a.charAt(j) < 'a' || a.charAt(j) > 'z') && (a.charAt(j) < 'A' || a.charAt(j) > 'Z') && (a.charAt(j) < '0' || a.charAt(j) > '9'))
			   {
				 if (flag != 0)
				 {
					System.out.print("0");
					System.out.print("\n");
				 }
				 flag = 0;
				 break;
			   }
		   }
		   if (flag != 0)
		   {
			  System.out.print("1");
			  System.out.print("\n");
		   }
	   }
	   return 0;
	}
}

