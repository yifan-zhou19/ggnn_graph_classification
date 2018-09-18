package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] a = new int[1000];
		int[] count = new int[30];
		int temp;
		int j;
		int max = -999;
		int flag;
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char cha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < 30;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					s[i][j] = tempVar3.charAt(0);
				}
				if (s[i][j] == ' ')
				{
					s[i][j] = 0;
					continue;
				}
				if (s[i][j] == '\n')
				{
					s[i][j] = 0;
					break;
				}
				temp = s[i][j] - 'A' + 1;
				count[temp] += 1;
			}
		}
		for (i = 1;i <= 26;i++)
		{
			if (count[i] >= max)
			{
				flag = i;
				max = count[i];
			}
		}
		System.out.printf("%c\n%d\n", flag + 64,max);
		cha = 'A' + flag - 1;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j < 30;j++)
			{
				if (s[i][j] == cha)
				{
					System.out.printf("%d\n", a[i]);
				}
			}
		}
		return 0;
	}





}

