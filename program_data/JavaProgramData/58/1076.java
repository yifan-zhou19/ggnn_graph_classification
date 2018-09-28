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
	 char ddd;
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 ddd = tempVar2.charAt(0);
	 }
		for (i = 0;i < n;i++)
		{
			sr[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
	  sum[i] = 0;
			for (j = 0;sr[i][j] != '\0';j++)
			{
	   if (j == 0)
	   {
		if ((sr[i][j] >= 'A' && sr[i][j] <= 'Z') || (sr[i][j] >= 'a' && sr[i][j] <= 'z') || (sr[i][j] == '_'))
		{
			sum[i] = 1;
		}
		else
		{
		sum[i] = 0;
		break;
		}
	   }


	   else if (j > 0)
	   {
	   if ((sr[i][j] >= 'A' && sr[i][j] <= 'Z') || (sr[i][j] >= 'a' && sr[i][j] <= 'z') || (sr[i][j] == '_') || (sr[i][j] >= '0' && sr[i][j] <= '9'))
	   {
		   sum[i] = 1;
	   }
		else
		{
		sum[i] = 0;
		break;
		}
	   }


	   else
	   {
		sum[i] = 0;
		break;
	   }
			}
	  if (sum[i] == 0)
	  {
		  System.out.print("0\n");
	  }
	  else
	  {
		  System.out.print("1\n");
	  }
		}

		return 0;
	}
}

