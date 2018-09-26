package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int n;
		  int e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] zfc = new char[n][21];
		  for (int i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  zfc[i] = tempVar2.charAt(0);
			  }
		  }
		  for (int i = 0;i < n;i++)
		  {
			  e = String.valueOf(zfc[i]).length();
			  if ((zfc[i][0] != '_') && (zfc[i][0] > 'Z' || zfc[i][0] < 'A') && (zfc[i][0]>'z' || zfc[i][0] < 'a'))
			  {
				  System.out.print("no\n");
			  }
			  else
			  {
				  int t = 0;
			 for (int m = 1;m < e;m++)
			 {
				 if ((zfc[i][m] == '_') || (zfc[i][m] >= 'a' && zfc[i][m] <= 'z') || (zfc[i][m] >= 'A' && zfc[i][m] <= 'Z') || (zfc[i][m] >= '0' && zfc[i][m] <= '9'))
				 {
					 t++;
				 }
			 }
			 if (t == e-1)
			 {
				 System.out.print("yes\n");
			 }
			 else
			 {
				 System.out.print("no\n");
			 }
			  }
		  }

		  return 0;

	  }




}

