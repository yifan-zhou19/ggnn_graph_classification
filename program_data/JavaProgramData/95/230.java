package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j = 0;
	  final String a = "";
	  final String b = "";
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  for (i = 0;i < 79;i++)
	  {
		 if ((a.charAt(i) - b.charAt(i)) != 0 && (a.charAt(i) - b.charAt(i)) != 32 && (b.charAt(i) - a.charAt(i)) != 32)
		 {
		   j = 1;
		   if (a.charAt(i) < 123 && a.charAt(i)>96 && b.charAt(i) < 123 && b.charAt(i)>96 && a.charAt(i) > b.charAt(i))
		   {
			   System.out.print(">");
		   }
		   if (a.charAt(i) < 123 && a.charAt(i)>96 && b.charAt(i) < 123 && b.charAt(i)>96 && a.charAt(i) < b.charAt(i))
		   {
			   System.out.print("<");
		   }
		   if (a.charAt(i) < 123 && a.charAt(i)>96 && b.charAt(i) < 91 && b.charAt(i)>64 && a.charAt(i) > b.charAt(i) + 32)
		   {
			   System.out.print(">");
		   }
		   if (a.charAt(i) < 123 && a.charAt(i)>96 && b.charAt(i) < 91 && b.charAt(i)>64 && a.charAt(i) < b.charAt(i) + 32)
		   {
			   System.out.print("<");
		   }
		   if (a.charAt(i) < 91 && a.charAt(i)>64 && b.charAt(i) < 123 && b.charAt(i)>96 && a.charAt(i) > b.charAt(i) - 32)
		   {
			   System.out.print(">");
		   }
		   if (a.charAt(i) < 91 && a.charAt(i)>64 && b.charAt(i) < 123 && b.charAt(i)>96 && a.charAt(i) < b.charAt(i) - 32)
		   {
			   System.out.print("<");
		   }
		   if (a.charAt(i) < 91 && a.charAt(i)>64 && b.charAt(i) < 91 && b.charAt(i)>64 && a.charAt(i) > b.charAt(i))
		   {
			   System.out.print(">");
		   }
		   if (a.charAt(i) < 91 && a.charAt(i)>64 && b.charAt(i) < 91 && b.charAt(i)>64 && a.charAt(i) < b.charAt(i))
		   {
			   System.out.print("<");
		   }
		   break;
		 }
	  }
	  if (j == 0)
	  {
	  System.out.print("=");
	  }

	}

}
