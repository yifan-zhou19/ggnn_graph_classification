package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] str = new char[50][15];
	  int i;
	  int n;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	  str[i] = new Scanner(System.in).nextLine();
	  }
	  for (i = 0;i < n;i++)
	  {

		 m = String.valueOf(str[i]).length();
		 if (str[i][m - 1] == 'r')
		 {
		  str[i][m - 2] = '\0';
		 }
		 else if (str[i][m - 1] == 'y')
		 {
		   str[i][m - 2] = '\0';
		 }
		  else if (str[i][m - 1] == 'g')
		  {
		   str[i][m - 3] = '\0';
		  }
		  System.out.printf("%s\n",str[i]);
	  }
	}
}

