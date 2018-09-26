package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int l;
	  char[][] str = new char[20][20];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str[i] = tempVar2.charAt(0);
		}
		l = String.valueOf(str[i]).length();
		if ((str[i][l - 2] == 'e' && str[i][l - 1] == 'r') || (str[i][l - 2] == 'l' && str[i][l - 1] == 'y'))
		{
		  str[i][l - 2] = '\0';
		  System.out.printf("%s\n",str[i]);

		}
		 else if (str[i][l - 3] == 'i' && str[i][l - 2] == 'n' && str[i][l - 1] == 'g')
		 {
			 str[i][l - 3] = '\0';
			 System.out.printf("%s\n",str[i]);


		 }
	   str[i] = "";
	  }
	  return 0;
	}


}

