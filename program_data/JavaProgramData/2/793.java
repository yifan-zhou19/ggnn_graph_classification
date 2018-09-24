package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[1000];
		int i;
		int j;
		int[] a = new int[26];
		int len;
		int k;
		int max;
		int l = 0;
		char[][] x = new char[1000][10];
		int n;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = 0;
			k = 0;
			len = String.valueOf(x[i]).length();
			for (j = 0;j < len;j++)
			{
				k = x[i][j];
				a[k - 65]++;
			}
		}
		max = a[0];
		for (j = 1;j < 26;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
				l = j;
			}
		}
		System.out.printf("%c\n",l + 65);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (x[i][j] == (l + 65))
				{
					System.out.printf("%d\n",num[i]);
				}
			}
		}
	}
}

