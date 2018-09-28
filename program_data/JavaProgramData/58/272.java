package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String num = new String(new char[10]);
	  char[][] s = new char[1000][80];
	  int n;
	  int i;
	  int j;
	  int l;
	  int m = 0;
	  num = new Scanner(System.in).nextLine();
	  n = Integer.parseInt(num);
	  for (i = 0;i < n;i++)
	  {
		   s[i] = new Scanner(System.in).nextLine();
		   l = String.valueOf(s[i]).length();

		   if ((s[i][0] <= 'z' && s[i][0] >= 'a') || (s[i][0] <= 'Z' && s[i][0] >= 'A') || (s[i][0] == '_'))
		   {
			   m = 1;

		   for (j = 0;j < l;j++)
		   {
			   if ((s[i][j] <= 'z' && s[i][j] >= 'a') || (s[i][j] <= 'Z' && s[i][j] >= 'A') || (s[i][j] >= '0' && s[i][j] <= '9') || (s[i][j] == '_'))
			   {
				   m = 1;
			   }
			   else
			   {
				   m = 0;
			   }
			   if (m == 0)
			   {
			   break;
			   }
		   }

		   }
		   else
		   {
			   m = 0;
		   }



			 System.out.printf("%d\n",m);

	  }
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}
