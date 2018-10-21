package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[1000][10];
		String b = new String(new char[500]);
		String p;
		int n;
		int[] num = new int[1000];
		int i;
		int j;
		int len;
		int wei;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len = b.length();
		p = b;
		for (i = 0;i < 100;i++)
		{
			num[i] = 1;
		}
		for (i = 0;i < len - n + 1;i++)
		{
			wei = i;
			a[i] = p.substring(wei, wei + n);
			a[i][n] = '\0';
		}
		for (i = 0;i < len - n + 1;i++)
		{
			if (a[i][0] == '*')
			{
				continue;
			}
			for (j = i + 1;j < len - n + 1;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					num[i]++;
					a[j][0] = '*';
				}
			}
		}
		q = 1;
		for (i = 0;i < len - n + 1;i++)
		{
			if (q < num[i])
			{
				q = num[i];
			}
		}
		if (q == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",q);
			for (i = 0;i < len - n;i++)
			{
				if (num[i] == q)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
	}
}

