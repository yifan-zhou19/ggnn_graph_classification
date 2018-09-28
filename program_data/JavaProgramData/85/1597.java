package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] sr = new char[100][100];
		int i;
		int j;
		int[] sum = new int[100];
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
				sr[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{

						 for (j = 1;sr[i][j] != '\0';j++)
						 {
										  if (((sr[i][j] >= 'A' && sr[i][j] <= 'Z') || (sr[i][j] >= 'a' && sr[i][j] <= 'z') || (sr[i][j] >= '0' && sr[i][j] <= '9') || (sr[i][j] == '_')) && ((sr[i][0] >= 'A' && sr[i][0] <= 'Z') || (sr[i][0] >= 'a' && sr[i][0] <= 'z') || (sr[i][0] == '_')))
										  {
											  sum[i] = 1;
										  }
										  else
										  {
											   sum[i] = 0;
											   break;
										  }
						 }
						  if (sum[i] == 0)
						  {
							  System.out.print("no\n");
						  }
						  else
						  {
							  System.out.print("yes\n");
						  }
		}

		return 0;
	}
}

