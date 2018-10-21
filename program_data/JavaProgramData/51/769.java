package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[500];
		int i;
		int j;
		int n;
		int len;
		String c = new String(new char[500]);
		final String str = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		len = c.length();
		for (i = 0;i < len - n + 1;i++)
		{
		for (j = 0;j < n;j++)
		{
			str.charAt(i)[j] = c.charAt(i + j);
		}
		}
		for (i = 0;i < len - n + 1;i++)
		{
		for (j = i;j < len - n + 1;j++)
		{
			if (0 == strcmp(str.charAt(i),str.charAt(j)))
			{
				num[i]++;
			}
		}
		}
		j = num[0];
		for (i = 0;i < len - n + 1;i++)
		{
			if (num[i] > j)
			{
				j = num[i];
			}
		}
		if (j == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",j);
			for (i = 0;i < len - n - 1;i++)
			{
			if (num[i] == j)
			{
				System.out.println(str.charAt(i));
			}
			}
		}
		return 0;
	}
}

