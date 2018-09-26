package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] zf = new char[100][100];
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
			zf[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			for (j = 0;zf[i][j] != '\0';j++)
			{
				if (j == 0)
				{
					if ((zf[i][j] >= 'A' && zf[i][j] <= 'Z') || (zf[i][j] >= 'a' && zf[i][j] <= 'z') || (zf[i][j] == '_'))
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
				if ((zf[i][j] >= 'A' && zf[i][j] <= 'Z') || (zf[i][j] >= 'a' && zf[i][j] <= 'z') || (zf[i][j] >= '0' && zf[i][j] <= '9') || (zf[i][j] == '_'))
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
			System.out.print("no\n");
			}
			if (sum[i] == 1)
			{
			System.out.print("yes\n");
			}
		}


		return 0;
	}

}

