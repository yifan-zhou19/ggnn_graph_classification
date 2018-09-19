package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int[][] a = new int[26][999];
		int[] num = new int[26];
		int t;
		int max;
		String zz = new String(new char[27]);
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zz = tempVar3.charAt(0);
			}
			for (j = 0;j < zz.length();j++)
			{
				a[(int)(zz.charAt(j) - 'A')][num[(int)(zz.charAt(j) - 'A')]] = t;
				num[(int)(zz.charAt(j) - 'A')]++;
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (num[i] > num[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",max + 'A',num[max]);
		for (i = 0;i < num[max];i++)
		{
			System.out.printf("%d\n",a[max][i]);
		}

	}
}

