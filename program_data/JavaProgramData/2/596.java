package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int t;
		int len;
		int[][] a = new int[26][MAX];
		int[] n = new int[26];
		int max = 0;
		int num;
		int i;
		int j;
		String s = new String(new char[27]);

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
				t = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			len = s.length();
			for (j = 0;j < len;j++)
			{
				n[s.charAt(j) - 65]++;
				a[s.charAt(j) - 65][i] = t;
			}
		}

		for (j = 0;j < 26;j++)
		{
			if (n[j] > max)
			{
				max = n[j];
				num = j;
			}
		}

		System.out.printf("%c\n%d\n",num + 65,n[num]);

		for (i = 0;i < m;i++)
		{
			if (a[num][i] != 0)
			{
				System.out.printf("%d\n",a[num][i]);
			}
		}
	}
}

