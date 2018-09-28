package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int i;
	int m;
	int k;
	int[] s = new int[100];
	int t;
	int sum;
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
		m = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < m;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s[j] = Integer.parseInt(tempVar3);
	}
	}
	if (m == 0)
	{
		System.out.print("60\n");
	}
	else
	{
	k = sum = 0;
	for (t = 1;t <= 60;t++)
	{
	//printf("%d %d %d\n",sum,k,t);
	sum++;
	if (sum == s[k])
	{
		t += 3;
		if (k < m - 1)
		{
			k++;
		}
	}
	}
	System.out.printf("%d\n",sum);
	}
	}
	}
}

