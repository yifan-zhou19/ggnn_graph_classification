package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max;
		int t;
		int i;
		int j;
		int[] a = new int[1000];
		int l;
		int[] b = new int[30];
		int c;
		char[][] str = new char[1000][20];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				str[i] = tempVar3.charAt(0);
			}
			l = String.valueOf(str[i]).length();
			for (j = 0;j < l;j++)
			{
				b[str[i][j] - 64]++;
			}
		}
		for (i = 1;i < 27;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				t = i;
			}
		}
		System.out.printf("%c\n%d\n",t + 64,b[t]);
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(str[i]).length();
			for (j = 0;j < l;j++)
			{
				if (str[i][j] == t + 64)
				{
					System.out.printf("%d\n",a[i]);
				}
			}
		}
		return 0;
	}
}

