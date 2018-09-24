package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int count = 0;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] s = new char[n][80];
		  String string = new String(new char[80]);
		  String = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
				s[i] = new Scanner(System.in).nextLine();
				l = String.valueOf(s[i]).length();
				for (j = 0;j < l;j++)
				{
					if (j == 0)
					{
						if ((s[i][j] == '_') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z'))
						{
						 count++;
						}
					}
					else
					{
						if ((s[i][j] == '_') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= '0' && s[i][j] <= '9'))
						{
						  count++;
						}
					}
				}
				if (count == l)
				{
					 System.out.print("1\n");
				}
				else
				{
					 System.out.print("0\n");
				}
					count = 0;
		  }
		  System.in.read();
		  System.in.read();
	}

}

