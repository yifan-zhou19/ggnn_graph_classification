package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[][] c = new char[1000][100];
		int n;
		int[] a = new int[1000];
		int[] num = new int[100];
		int i;
		int j;
		int k;
		int max = 0;
		int t;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;c[i][k] != '\0';k++)
			{
			for (j = 0;name.charAt(j) != '\0';j++)
			{
				if (name.charAt(j) == c[i][k])
				{
					num[j]++;
				}
			}

			}
		}
		for (i = 0;name.charAt(i) != '\0';i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",name.charAt(k),num[k]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;c[i][j] != '\0';j++)
			{
				if (c[i][j] == name.charAt(k))
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
	}
}

