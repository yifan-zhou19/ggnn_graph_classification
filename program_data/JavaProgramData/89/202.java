package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k = 1;
	int c;
	int d;
	int[][] a;
	int[] p;
	int[] q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = new int[n];
	q = new int[n];
	a = new int[n];
	for (i = 0;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		p[i] = 0;
		q[i] = 0;
	}
	while (k == 1)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (c == 0 && d == 0)
			{
				break;
			}
			if (a[c][d] != 1)
			{
				p[c] = 1;
				q[d]++;
				a[c][d] = 1;
			}
	}
	for (i = 0;i < n;i++)
	{
		if (p[i] == 0 && q[i] == n - 1)
		{
				System.out.printf("%d",i);
				return (0);
		}
	}
	System.out.print("NOT FOUND");
	return (0);
	}

}

