package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zf = new char[n][21];
		int[] judge = new int[n];

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
			for (j = 0;zf[i][j] != '\0';j++)
			{
			   if ((zf[i][j] >= 'a' && zf[i][j] <= 'z') || (zf[i][j] >= 'A' && zf[i][j] <= 'Z') || (zf[i][j] == '_') || (zf[i][j] >= '0' && zf[i][j] <= '9'))
			   {
				judge[i] = 1;
			   }
			   else
			   {
				   judge[i] = 0;
						 break;
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
		   if (judge[i] == 1)
		   {
			  if (zf[i][0] >= '0' && zf[i][0] <= '9')
			  {
				  judge[i] = 0;
			  }
		   }
		}

	   for (i = 0;i < n;i++)
	   {
		  if (judge[i] == 1)
		  {
			  System.out.print("yes\n");
		  }
					 else
					 {
						 System.out.print("no\n");
					 }
	   }

	}


}

