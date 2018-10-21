package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str1 = new String(new char[500]);
	  int i;
	  int j;
	  int n;
	  int x = 0;
	  int t;
	  str1 = new Scanner(System.in).nextLine();
	  for (n = 2;n <= str1.length();n++)
	  {
		 for (i = 0;i < str1.length();i++)
		 {
		   if ((i + n) > str1.length())
		   {
			   break;
		   }
		   for (j = i;j <= i + n - 1;j++)
		   {
			   if (str1.charAt(j) == str1.charAt(i + i + n - 1 - j))
			   {
				   x = x + 1;
			   }
		   }
		   if (x == n)
		   {
			  for (t = i;t < i + n;t++)
			  {
				  System.out.printf("%c",str1.charAt(t));
			  }
			  System.out.print("\n");
		   }
		   x = 0;
		 }
	  }

	  return 0;
	}

}
