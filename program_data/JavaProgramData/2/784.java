package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int t;
		int[] b = new int[1000];
		int[] a = new int[26];
		int max;
		char[][] str = new char[1000][30];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				str[i] = tempVar3.charAt(0);
			}
			for (j = 0;str[i][j] != '\0';j++)
			{
				t = str[i][j] - 'A';
				a[t]++;
			}
		}
		t = 0;
		max = a[0];
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				t = i;
			}
		}
		System.out.printf("%c\n",'A' + t);
		System.out.printf("%d\n",a[t]);
		for (i = 0;i < m;i++)
		{
			for (j = 0;str[i][j] != '\0';j++)
			{
				if (str[i][j] == 'A' + t)
				{
					System.out.printf("%d\n",b[i]);
				}
			}
		}
	}
}

