package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int max;
		char[][] name = new char[2000][30];
		final String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] No = new int[2000];
		int[] num = new int[30];
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
				No[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				name[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (k = 0;k < n;k++)
			{
				for (j = 0;j < String.valueOf(name[k]).length();j++)
				{
					if (name[k][j] == alp.charAt(i))
					{
						num[i]++;
						break;
					}
				}
			}
		}
		max = num[0];
		for (i = 1;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] == max)
			{
				System.out.printf("%c\n%d\n",alp.charAt(i),max);
				for (k = 0;k < n;k++)
				{
					for (j = 0;j < 27;j++)
					{
						if (name[k][j] == alp.charAt(i))
						{
							System.out.printf("%d\n",No[k]);
							break;
						}
					}
				}
			}
		}
		return 0;
	}


}

