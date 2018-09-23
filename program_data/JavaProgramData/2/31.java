package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int i;
		int j;
		int m;
		int[] b = new int[26];
		int t = 0;
		int k;
		char[][] c = new char[1000][20];
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
				c[i] = tempVar3.charAt(0);
			}
		}
			 for (i = 0;i < m;i++)
			 {
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				if ('A' < c[i][j] < 'Z')
				{
					b[c[i][j] - 65]++;
				}
			}
			 }
		for (i = 0;i < 26;i++)
		{
			if (b[i] > t)
			{
			t = b[i];
			k = i;
			}
		}
			System.out.printf("%c\n",k + 65);
			System.out.printf("%d\n",t);
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < String.valueOf(c[i]).length();j++)
	{
	   if (c[i][j] == k + 65)
	   {
		   System.out.printf("%d\n",a[i]);
	   }
	}
	}
	}
}

