package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
	  char[][] str = new char[50][10];
	  int n;
	  int i;
	  int c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0,c = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str[i] = tempVar2.charAt(0);
	  }
	  c = String.valueOf(str[i]).length();
	  if (str[i][c - 1] == 'r')
	  {
	  str[i][c - 1] = str[i][c - 2] = '\0';
	  }

	  if (str[i][c - 1] == 'y')
	  {
	  str[i][c - 1] = str[i][c - 2] = '\0';
	  }

	  if (str[i][c - 1] == 'g')
	  {
	  str[i][c - 1] = str[i][c - 2] = str[i][c - 3] = '\0';
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  System.out.printf("%s\n",str[i]);
	  }
	}
}

