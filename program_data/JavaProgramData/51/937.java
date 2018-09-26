package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[500]);
	public static char[][] b = new char[500][5];
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int[] c = new int[500];
	public static int max;
	public static int n;
	public static int Main()
	{
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
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = i,k = 0;j < n + i;j++,k++)
			{
				b[i][k] = a.charAt(j);
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = i;j <= l - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[i] += 1;
				}
			}
		}
		for (max = c[0],i = 1;i <= l - n;i++)
		{
			max = (max >= c[i])?max:c[i];
		}
		if (max == 1)
		{
			System.out.print("NO\n");
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
		return 0;
	}
}

