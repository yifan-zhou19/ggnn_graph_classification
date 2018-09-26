package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] str = new char[1000][256];
	  char a = 'A';
	  char b = 'T';
	  char c = 'C';
	  char d = 'G';
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str[i] = tempVar2.charAt(0);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < String.valueOf(str[i]).length();j++)
		  {
			  if (str[i][j] == a)
			  {
				str[i][j] = b;
			  }
			  else if (str[i][j] == b)
			  {
			   str[i][j] = a;
			  }
			  else if (str[i][j] == c)
			  {
				  str[i][j] = d;
			  }
			  else if (str[i][j] == d)
			  {
				  str[i][j] = c;
			  }
		  }
	  }
	   for (i = 0;i < n;i++)
	   {

			   System.out.printf("%s\n",str[i]);
	   }
		   return 0;
	}
}

