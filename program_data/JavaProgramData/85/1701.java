package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] sz = new char[100][20];
		int n;
		int[] len = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = tempVar2.charAt(0);
		  }
		  len[i] = String.valueOf(sz[i]).length();
		}
		for (int i = 0;i < n;i++)
		{
		  if ((sz[i][0] >= 'A' && sz[i][0] <= 'Z') || (sz[i][0] >= 'a' && sz[i][0] <= 'z') || (sz[i][0] == '_'))
		  {
			for (int j = 1;j <= len[i];j++)
			{
			  if ((sz[i][j] >= 'A' && sz[i][j] <= 'Z') || (sz[i][j] >= 'a' && sz[i][j] <= 'z') || (sz[i][j] == '_') || (sz[i][j] >= '0' && sz[i][j] <= '9'))
			  {
				continue;
			  }
			  else if (sz[i][j] == '\0')
			  {
				System.out.print("yes\n");
				break;
			  }
			  else
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

