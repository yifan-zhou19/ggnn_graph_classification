package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int f;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	char[][] p = new char[n][100];
	for (int i = 0;i <= n - 1;i++)
	{
	  p[i] = new Scanner(System.in).nextLine();

	  f = 0;
	  int l = String.valueOf(p[i]).length();
	  for (int u = 0;u <= l - 1;u++)
	  {
			  if (p[i][u] <= 47 || (p[i][u] >= 58 && p[i][u] <= 64) || (p[i][u] >= 91 && p[i][u] <= 94) || (p[i][u] >= 123) || p[i][u] == 96)
			  {
			  f = 1;
			  }
	  }
	  if (((p[i][0] == '_') || (p[i][0] >= 'a' && p[i][0] <= 'z') || (p[i][0] >= 'A' && p[i][0] <= 'Z')) && f == 0)
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

