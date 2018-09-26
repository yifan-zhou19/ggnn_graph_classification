package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int q;
	int i;
	int j;
	char[][] ZF = new char[100][260];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		q = Integer.parseInt(tempVar);
	}
		for (i = 0;i < q;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					ZF[i] = tempVar2.charAt(0);
				}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;ZF[i][j] != '\t';j++)
			{
				if ((ZF[i][j - 2] == 'l') && (ZF[i][j - 1] == 'y') && (ZF[i][j] == '\0'))
				{
					ZF[i][j - 2] = '\0';
				}
				else if ((ZF[i][j - 2] == 'e') && (ZF[i][j - 1] == 'r') && (ZF[i][j] == '\0'))
				{
					ZF[i][j - 2] = '\0';
				}
				else if ((ZF[i][j - 3] == 'i') && (ZF[i][j - 2] == 'n') && (ZF[i][j - 1] == 'g') && (ZF[i][j] == '\0'))
				{
					ZF[i][j - 3] = '\0';
				}
			}
		}
		for (i = 0;i < q;i++)
		{
				System.out.printf("%s\n",ZF[i]);
		}
		return 0;
	}
}

