package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int max;
		int[] a = new int[1000];
		int[] b = new int[26];
		char[][] name = new char[1000][26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				name[i] = tempVar3.charAt(0);
			}
			for (j = 0;j < String.valueOf(name[i]).length();j++)
			{
				b[name[i][j] - 'A']++;
			}
		}
		max = 0;
		for (k = 1;k < 26;k++)
		{
			if (b[k] > b[max])
			{
				max = k;
			}
		}
		System.out.printf("%c\n%d\n",max + 'A',b[max]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(name[i]).length();j++)
			{
				if (name[i][j] == max + 'A')
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
	}
}

