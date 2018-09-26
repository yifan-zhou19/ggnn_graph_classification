package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] zf = new char[LEN][LEN];
	int a;
	int n;
	int i = 0;
	int j;
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
				zf[i] = tempVar2.charAt(0);
			}
	}
	for (i = 0;i < n;i++)
	{
		a = String.valueOf(zf[i]).length();
		if ((zf[i][0] >= 48 && zf[i][0] <= 57))
		{
				System.out.print("no\n");
		}
		if ((zf[i][0] >= 0 && zf[i][0] <= 47) || (zf[i][0] >= 58 && zf[i][0] <= 64) || (zf[i][0] >= 91 && zf[i][0] <= 94) || (zf[i][0] == 96) || (zf[i][0] >= 123 && zf[i][0] <= 127))
		{
		System.out.print("no\n");
		}
		else if (zf[i][0] < 48 || zf[i][0]>57)
		{
			for (j = 0;j < a;j++)
			{
				if ((zf[i][j] > 47 && zf[i][j] < 58) || (zf[i][j]>64 && zf[i][j] < 91) || (zf[i][j] == 95) || (zf[i][j]>96 && zf[i][j] < 123))
				{
					continue;

				}
				if ((zf[i][j] >= 0 && zf[i][j] <= 47) || (zf[i][j] >= 58 && zf[i][j] <= 64) || (zf[i][j] >= 91 && zf[i][j] <= 94) || (zf[i][j] == 96) || (zf[i][j] >= 123 && zf[i][j] <= 127))
				{
					System.out.print("no\n");
					break;
				}

			}

		if (j == a)
		{
		System.out.print("yes\n");
		}
		}

	}
	return 0;
	}
}

