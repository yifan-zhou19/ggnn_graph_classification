package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int[] S = new int[100];
		int[] G = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zf = new char[100][21];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
		   if ((zf[i][0] >= 'A' && zf[i][0] <= 'Z') || (zf[i][0] >= 'a' && zf[i][0] <= 'z') || (zf[i][0] == '_'))
		   {
				G[i] = String.valueOf(zf[i]).length();
		   for (j = 0;j < G[i];j++)
		   {
			   if ((zf[i][j] >= 'A' && zf[i][j] <= 'Z') || (zf[i][j] >= 'a' && zf[i][j] <= 'z') || (zf[i][j] >= '0' && zf[i][j] <= '9') || (zf[i][j] == '_'))
			   {
					 S[i] = 1;
			   }
			   else
			   {
				   S[i] = 0;
			   break;
			   }
		   }
		   }
		   else
		   {
			   S[i] = 0;
		   }
		}
		   for (i = 0;i < n;i++)
		   {
		 if (S[i] == 0)
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

