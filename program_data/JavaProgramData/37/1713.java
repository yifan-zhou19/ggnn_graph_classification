package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int t;
	int i = 1;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	while (i <= t)
	{
		String zifu = new String(new char[100000]);
		char q = '0';
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zifu = tempVar2.charAt(0);
	}
	m = zifu.length();
	int k = 0;
	int j = 0;
	while (k <= m - 2)
	{
		j = 0;
		while (j <= m - 1 && q == '0')
		{
			if (zifu.charAt(k) == zifu.charAt(j) && k != j)
			{
	break;
			}
	else
	{
	j++;
	}
		}
	if (j == m)
	{
	q = zifu.charAt(k);
	break;
	}
	else
	{
	k++;
	}
	}
	if (q == '0')
	{
	System.out.print("no\n");
	}
	else
	{
	System.out.printf("%c\n",q);
	}


	i++;
	}
	}

}

