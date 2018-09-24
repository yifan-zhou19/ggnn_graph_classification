package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[1000];
		int[] sum = new int[26];
		for (i = 0;i < 26;i++)
		{
			sum[i] = 0;
		}
		char[][] a = new char[1000][27];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				sum[a[i][j] - 'A'] = sum[a[i][j] - 'A'] + 1;
			}
		}
		for (i = 1;i < 26;i++)
		{
			if (sum[i] > sum[max])
			{
				max = i;
			}
		}

		System.out.printf("%c\n",max + 'A');
		System.out.printf("%d\n",sum[max]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == max + 'A')
				{
					System.out.printf("%d\n",num[i]);
					break;
				}
			}
		}
	}


















}

