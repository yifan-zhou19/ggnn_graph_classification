package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[2000][50];
		int n;
		int i;
		int j;
		int sum = 0;
		int geshu;
		int ji = 0;
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			geshu = 0;
			while (str[i][j] != '\0')
			{
				geshu++;
				j++;
			}
			if (ji == 0)
			{
				System.out.printf("%s",str[i]);
				sum = sum + geshu;
			}
			else
			{
				sum = sum + geshu + 1;
				if (sum <= 80)
				{
					System.out.printf(" %s",str[i]);
				}
				else
				{
					System.out.printf("\n%s",str[i]);
					sum = geshu;
				}
			}
			ji = 1;
		}

		return 0;
	}


}

