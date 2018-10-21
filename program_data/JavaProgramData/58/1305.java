package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int k;
		int i;
		char[][] zf = new char[800][81];
		char z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			zf[i] = new Scanner(System.in).nextLine();
		}
		for (int f = 0;f < n;f++)
		{
			if (zf[f][0] == '_' || (zf[f][0] >= 'a' && zf[f][0] <= 'z') || (zf[f][0] >= 'A' && zf[f][0] <= 'Z'))
			{
				k = String.valueOf(zf[f]).length();
				for (int m = 0;m < k;m++)
				{
					if (zf[f][m] == '_' || (zf[f][m] >= 'a' && zf[f][m] <= 'z') || (zf[f][m] >= 'A' && zf[f][m] <= 'Z') || (zf[f][m] <= '9' && zf[f][m] >= '0'))
					{
						continue;
					}
					else
					{
						count++;
						break;
					}
				}
			}
			else
			{
				count++;
			}
			if (count != 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
			k = 0;
			count = 0;
		}
		return 0;
	}
}

