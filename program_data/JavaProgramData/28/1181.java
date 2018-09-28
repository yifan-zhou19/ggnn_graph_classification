package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int a;
	  String c = new String(new char[3000]);
	  c = new Scanner(System.in).nextLine();
	  a = c.length();
	   int i;
	   int b = 0;
	  if (a == 3)
	  {
		  System.out.print("3");
	  }
	  else
	  {
	   for (i = 0;i < a - 2;i++)
	   {
		  if (c.charAt(i) != ' ')
		  {
			   b = b + 1;
		   continue;
		  }
		  else
		  {
			  if (b != 0)
			  {
			  System.out.printf("%d,",b);
			  }
			  b = 0;
		  }
	   }
	   b = 0;
	   for (i = a - 1;i >= 0;i--)
	   {
		   if (c.charAt(i) != ' ')
		   {
			b = b + 1;
		   }
		   else
		   {
			   System.out.printf("%d",b);
			   break;
		   }
	   }
	  }
	}
}
