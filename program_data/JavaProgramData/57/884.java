package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int l;
	  char[][] a = new char[50][33];
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
			  a[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  l = String.valueOf(a[i]).length();
		  if (strcmp(a[i][l - 2], "er") == 0 && l > 2)
		  {
			  a[i][l - 2] = '\0';
		  }
		  else if (strcmp(a[i][l - 2], "ly") == 0 && l > 2)
		  {
			  a[i][l - 2] = '\0';
		  }
		  else if (strcmp(a[i][l - 3], "ing") == 0 && l > 3)
		  {
			  a[i][l - 3] = '\0';
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  System.out.printf("%s\n",a[i]);
	  }
	  return 0;
	}

}

