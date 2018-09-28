package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int k;
	  char[][] a = new char[50][20];
	  String b = new String(new char[2]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i <= n;i++)
	  {
		  a[i] = new Scanner(System.in).nextLine();
		  l = String.valueOf(a[i]).length();
		  b = tangible.StringFunctions.changeCharacter(b, 0, a[i][l - 2]);
		  b = tangible.StringFunctions.changeCharacter(b, 1, a[i][l - 1]);
		  k = strcmp(b,"ly");

		  if (k > 0)
		  {
			  a[i][l - 3] = '\0';
		  }
		  else
		  {
			  a[i][l - 2] = '\0';
		  }
	  }

	  for (i = 1;i <= n;i++)
	  {
		  System.out.println(a[i]);
	  }





	}
}

