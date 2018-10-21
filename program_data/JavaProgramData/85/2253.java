package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] asz = new char[300][300];
		int[] len = new int[300];
		int n = 0;
		int i;
		int[] bsz = new int[300];
		int j;
		int[] fsz = new int[300];
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
				asz[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(asz[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			fsz[i] = 1;
			for (j = 0;j < len[i];j++)
			{
				if (!((asz[i][j] == '_') || (asz[i][j] >= 'A' && asz[i][j] <= 'Z') || (asz[i][j] >= 'a' && asz[i][j] <= 'z') || (asz[i][j] >= '0' && asz[i][j] <= '9' && j>0)))
				{
						fsz[i] = 0;
						break;
				}



			}
		}
		for (i = 0;i < n;i++)
		{
			if (fsz[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}

		}
	}



}

