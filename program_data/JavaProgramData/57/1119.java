package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;
		  char[][] a = new char[55][32];
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
			  int len = String.valueOf(a[i]).length();
			  int lenf = 0;
			  if (a[i][len - 3] == 'i' && a[i][len - 2] == 'n' && a[i][len - 1] == 'g')
			  {
				  lenf = len - 3;
			  }
			  else if ((a[i][len - 2] == 'e' && a[i][len - 1] == 'r') || (a[i][len - 2] == 'l' && a[i][len - 1] == 'y'))
			  {
				  lenf = len - 2;
			  }
			  for (j = 0;j < lenf;j++)
			  {
				  System.out.printf("%c",a[i][j]);
			  }
			  System.out.print("\n");
		  }
	}
}

