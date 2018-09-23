package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[2000];
		int max = 0;
		int t;
		int[] b = new int[30];
		int j;
		int m;
		char[][] str = new char[1000][30];
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
			for (j = 0;j < String.valueOf(str[i]).length();j++)
			{
				m = str[i][j] - 64;
				b[m]++;
			}
		}
		for (i = 1;i < 26;i++)
		{
			if (b[i] > max)
			{
			max = b[i];
			t = i;
			}
		}
		System.out.printf("%c\n%d\n",t + 64,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(str[i]).length();j++)
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

