package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int re;
		int foul;
		int max;
		char[][] a = new char[500][6];
		String c = new String(new char[502]);
		int[] b = new int[500];
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
		len = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
		len++;
		}
		for (i = 0;i <= len - n;i++)
		{
	for (j = 0;j < n;j++)
	{
	a[i][j] = c.charAt(i + j);
	}
	a[i][n] = '\0';
		}
	for (i = 0;i < 500;i++)
	{
	b[i] = 1;
	}
	for (i = 0;i <= len - n;i++)
	{
	foul = 0;
	re = 0;
	for (j = 0;j < i;j++)
	{
	if (strcmp(a[i],a[j]) == 0)
	{
	foul++;
	break;
	}
	}
	if (foul == 1)
	{
	continue;
	}
	else
	{
	for (j = i + 1;j <= len - n;j++)
	{
	if (strcmp(a[i],a[j]) == 0)
	{
	re++;
	}
	}
	b[i] += re;
	}
	}
	for (max = 1,i = 0;i <= len - n;i++)
	{
	if (b[i] > max)
	{
	max = b[i];
	}
	}
	if (max != 1)
	{
	System.out.printf("%d\n",max);
	for (i = 0;i <= len - n;i++)
	{
	if (b[i] == max)
	{
	System.out.printf("%s\n",a[i]);
	}
	}
	}
	else
	{
	System.out.print("NO\n");
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	return 0;
	}

}

