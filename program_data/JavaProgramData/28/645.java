package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a = 0;
	 int i;
	 int x;
	 String c = new String(new char[10000]);
	 c = new Scanner(System.in).nextLine();
	 for (i = 0;c.charAt(i) != '\0';i++)
	 {
	  if (c.charAt(i) != ' ')
	  {
		  a = a + 1;
		  x = 1;
	  }
	  else
	  {
	   if (x == 1)
	   {
			  if (c.charAt(i) == ' ')
			  {
		   System.out.printf("%d,",a);
		   x = 0;
			  };
		   a = 0;
	   }
	  }
	 }
	System.out.printf("%d",a);
	}

}
