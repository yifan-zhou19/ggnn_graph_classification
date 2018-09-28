package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int inta = 0; //inta????????i?????
	 int i;
	 int a = 0;
	 int b = 0;
		  inta = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 0;;i++)
		  {
			  if (inta % 2 == 0)
			  {

				  a = inta / 2;
				  System.out.print(inta);
				  System.out.print("/2=");
				  System.out.print(a);
				  System.out.print("\n");
				  inta = a;
			  }

			  if (inta % 2 != 0 && inta != 1)
			  {

				  b = inta * 3 + 1;
				  System.out.print(inta);
				  System.out.print("*3");
				  System.out.print("+1=");
				  System.out.print(b);
				  System.out.print("\n");
				  inta = b;
			  }

			  if (inta == 1)
			  {
				  break;

			  }

		  }

	System.out.print("End");

	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}
}

