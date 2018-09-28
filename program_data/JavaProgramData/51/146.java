package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[505]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int i;
		int j;
		int t;
		int[] c = new int[505];
		int max = 1;
		int y = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			t = i;
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(t);
				t++;
			}
		}
		for (i = 0;i < l - n;i++)
		{
			c[i] = 1;
			for (j = i + 1;j <= l - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[i]++;
				}
			}
			if (c[i] >= max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{

			if (c[i] == max)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
	}

}

