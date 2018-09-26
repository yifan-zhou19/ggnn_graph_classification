package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int lg1;
		int lg2;
		int t;
		char[][] bjs = new char[100][100];
		char[][] js = new char[100][100];
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
				bjs[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				js[i] = tempVar3.charAt(0);
			}
		}
		for (j = 0;j < n;j++)
		{
			lg1 = String.valueOf(bjs[j]).length();
			lg2 = String.valueOf(js[j]).length();
			t = lg1 - lg2;
			for (i = lg2 - 1;i >= 0;i--)
			{
				if (bjs[j][t + i] - js[j][i] >= 0)
				{
					bjs[j][t + i] = bjs[j][t + i] - js[j][i] + 48;
				}
				else
				{
					bjs[j][t + i] = bjs[j][t + i] - js[j][i] + 48 + 10;
					bjs[j][t + i - 1] = bjs[j][t + i - 1] - 1;
				}
			}
			System.out.printf("%s\n",bjs[j]);
		}
	}

}

