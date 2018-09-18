package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		int[] a = new int[100];
		int[] b = new int[26];
		int s;
		int max;
		char[][] c = new char[100][50];
		char m;
		for (i = 0;i <= 25;i++)
		{
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = tempVar3.charAt(0);
			}
		   l = String.valueOf(c[i]).length();
			for (j = 0;j <= l - 1;j++)
			{
				s = (int)c[i][j] - 65;
			b[s] = b[s] + 1;
			}
		}

		max = b[0];
		j = 0;

	   for (i = 0;i <= 25;i++)
	   {
		   if (b[i] > max)
		   {
		   max = b[i];
	   j = i;
		   }
	   }
	   m = j + 65;

	   System.out.printf("%c\n",m);
	   System.out.printf("%d\n",max);

		for (i = 0;i <= n - 1;i++)
		{
			l = String.valueOf(c[i]).length();
			for (j = 0;j <= l - 1;j++)
			{
			if (c[i][j] == m)
			{
				System.out.printf("%d\n",a[i]);
			}
			}
		}
	}











}

