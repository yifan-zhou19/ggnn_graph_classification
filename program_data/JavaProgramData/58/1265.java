package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] string = new char[100][81];
	  for (int i = 0;i < n;i++)
	  {
	  String[i] = new Scanner(System.in).nextLine(); //scanf("%s",string[i]);
	  }
	  for (int i = 0;i < n;i++)
	  {
		 int l = String.valueOf(String[i]).length();
		 j = 0;
		 if ((String[i][0] >= 'A' && string[i][0] <= 'Z') || (String[i][0] >= 'a' && string[i][0] <= 'z') || string[i][0] == '_')
		 {
			  for (j = 0;j < l;j++)
			  {
			  if (String[i][j] >= 'A' && string[i][j] <= 'Z' || string[i][j] >= 'a' && string[i][j] <= 'z' || string[i][j] == '_' || string[i][j] >= '0' && string[i][j] <= '9')
			  {
			  continue;
			  }
			   else
			   {
			  break;
			   }
			  }
		 }
			  if (j >= l)
			  {
			  System.out.print("1\n");
			  }
			  else
			  {
			  System.out.print("0\n");
			  }

	  }
	}


}

