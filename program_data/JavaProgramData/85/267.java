package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][21];
		int n = 0;
		int i;
		int j;
		int k;
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
			if ((a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] == '_'))
			{

				for (j = 1;;j++)
				{
					 if (a[i][j] == '\0')
					 {
						System.out.print("yes\n");
						break;
					 }

					 if (!((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0') && (a[i][j] <= '9' || a[i][j] == '_')))
					 {
					 System.out.print("no\n");
					 break;
					 }
				}
			}
			else
			{
				System.out.print("no\n");
			}

	   }






		return 0;
	}

}

