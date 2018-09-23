package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
		int m;
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[999];
		int[] c = new int[26];
		char[][] b = new char[999][999];
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = tempVar3.charAt(0);
		   }
		}
		for (i = 0;i < m;i++)
		{
			k = String.valueOf(b[i]).length();
			for (j = 0;j < k;j++)
			{
				c[b[i][j] - 'A']++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (t < c[j])
			{
				t = c[j];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] == t)
			{
				System.out.printf("%c\n",i + 'A');
			break;
			}
		}
		System.out.printf("%d\n",t);
		for (j = 0;j < m;j++)
		{
			k = String.valueOf(b[j]).length();
			for (n = 0;n < k;n++)
			{
				if ((b[j][n] - 'A') == i)
				{
					System.out.printf("%d\n",a[j]);
				}
			}
		}
	}
}

