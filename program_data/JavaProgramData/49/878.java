package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[500]);
		  int l;
		  int n;
		  int i;
		  int j;
		  int s;
		  int p;
		  n = 0;

		  c = new Scanner(System.in).nextLine();

		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
		  n++;
		  }

		  for (l = 2;l <= n;l++)
		  {
						   for (i = 0;i <= n;i++)
						   {
						   s = 0;

						   for (j = i;j <= (i + l - 1);j++)
						   {
						   if (c.charAt(j) == c.charAt(l + 2 * i - j - 1))
						   {
						   s++;
						   }
						   }

						   if (s == l)
						   {
							   for (j = i;j <= i + l - 1;j++)
							   {
						   System.out.printf("%c",c.charAt(j));
							   }
						   System.out.print("\n");
						   }
						   }
		  }




	}


}
