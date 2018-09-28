package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String input = new String(new char[100]);
		  int i;
		  int a;
		  int b;
		  int m;
		  input = new Scanner(System.in).nextLine();
		  b = input.charAt(0) - '0';

		  m = input.charAt(1) - '0';
		  if (b == 1 && m < 3 && input.charAt(2) == '\0')
		  {
			 System.out.print("0");
		  System.out.printf("\n%d%d",b,m);
		  }

		  else
		  {
				 if (input.charAt(1) == '\0')
				 {
					 System.out.printf("0\n%d",b);
				 }
			   else
			   {
			   for (i = 1;input.charAt(i) != '\0';i++)
			   {

			   a = (10 * b + input.charAt(i) - '0') / 13;
			   b = (10 * b + input.charAt(i) - '0') % 13;
			   if (a != 0 || i != 1)
			   {
			   System.out.printf("%d",a);
			   }
			   }
			   System.out.printf("\n%d",b);
			   }
		  }


		   System.in.read();





	}

}
