package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		char[][] a = new char[n][100];
		for (i = 0;i < n;i++)
		{
			 a[i] = new Scanner(System.in).nextLine();
			 if (a[i][0] != '_' && ((a[i][0] - 'a') < 0 || (a[i][0] - 'z')>0) && ((a[i][0] - 'A') < 0 || (a[i][0] - 'Z')>0))
			 {
				 System.out.print("0\n");
			 continue;
			 }
			 else
			 {
				 for (j = 1;a[i][j] != '\0';j++)
				 {
				  if (a[i][j] == '\n' || a[i][j] == ' ')
				  {
					  System.out.print("0\n");
					  break;
				  }
				  if (a[i][j] != '_' && ((a[i][j] - 'a') < 0 || (a[i][j] - 'z')>0) && ((a[i][j] - 'A') < 0 || (a[i][j] - 'Z')>0) && ((a[i][j] - '0') < 0 || (a[i][j] - '0')>9))
				  {
					  System.out.print("0\n");
					  break;
				  }
				 }
			 if (a[i][j] == '\0')
			 {
			 System.out.print("1\n");
			 }
			 }
		}
		System.in.read();
		System.in.read();
	}
}

