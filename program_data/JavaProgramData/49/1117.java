package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  int bools;
	  String s = new String(new char[500]);
	  s = new Scanner(System.in).nextLine();
	  n = s.length();
	  for (k = 2;k <= n;k++)
	  {
		for (i = 0;i <= n - k;i++)
		{
			 bools = 1;
		   for (j = i;j < i + k / 2;j++)
		   {
			 if (s.charAt(j) != s.charAt(2 * i + k - j - 1))
			 {
				  bools = 0;
				  break;
			 }
		   }
		   if (bools == 1)
		   {
				 for (j = i;j <= i + k - 1;j++)
				 {
				System.out.printf("%c",s.charAt(j));
				 }
			   System.out.print("\n");
		   }
		}
	  }
	  return 0;
	}

}
