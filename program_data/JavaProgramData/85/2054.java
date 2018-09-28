package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] bsf = new char[n][21];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(bsf[i]) = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int m = 0;bsf[i][m] != 0;m++)
			{
			if ((bsf[i][0] >= 'a' && bsf[i][0] <= 'z') || (bsf[i][0] >= 'A' && bsf[i][0] <= 'Z') || (bsf[i][0] == '_'))
			{
			 if ((bsf[i][m] >= 'a' && bsf[i][m] <= 'z') || (bsf[i][m] <= 'Z' && bsf[i][m] >= 'A') || (bsf[i][m] >= '0' && bsf[i][m] <= '9') || bsf[i][m] == '_')
			 {
			   continue;
			 }
			else
			{
				a[i]++;
				break;
			}
			}
		  else
		  {
			  a[i]++;
			  break;
		  }
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] > 0)
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

