package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int t;
		  String c = new String(new char[100]);
		  String d = new String(new char[100]);
		  int[] b = new int[100];
		  int[] a = new int[100];
		 c = new Scanner(System.in).nextLine();

		  //n=strlen("c");
		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
			 a[i] = c.charAt(i) - '0';
		  }
		  //printf("%d",i);
		 if (i == 1)
		 {
			 System.out.print("0");
			 System.out.printf("\n%d",a[0]);
		 }
		  else
		  {
		 for (j = 0;j < i - 1;j++)
		 {
			b[j] = (10 * a[j] + a[j + 1]) / 13;
			a[j + 1] = (10 * a[j] + a[j + 1]) % 13;
			  // printf("\n%d",b[j]);             
		 }
	  for (n = 0;n < j;n++)
	  {
		   d = tangible.StringFunctions.changeCharacter(d, n, b[n] + '0');

	  }
		// printf("%d\n",n);
		 d = tangible.StringFunctions.changeCharacter(d, n, '\0');
		 if (d.charAt(0) == '0')
		 {
			   if (d.charAt(1) == '\0')
			   {
				   System.out.printf("%c",d.charAt(0));
			   }
				else
				{
				 for (t = 1;d.charAt(t) != '\0';t++)
				 {

						System.out.printf("%c",d.charAt(t));
				 }
				}
		 }
		 else
		 {
		 for (t = 0;d.charAt(t) != '\0';t++)
		 {

			System.out.printf("%c",d.charAt(t));
		 }
		 }
		 System.out.printf("\n%d",a[j]);
		  }

	System.in.read();
	 System.in.read();
	 System.in.read();
	  System.in.read();
	 System.in.read();
	 System.in.read();
	}
}

