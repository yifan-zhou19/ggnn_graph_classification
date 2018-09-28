package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int a;
	int j;
	int s;
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] c = new int[200];

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[i] = Integer.parseInt(tempVar2);
		}
	}

	for (i = 0;i < n;i++)
	{
	for (j = 0;j < c[i];j++)
	{
		b[0] = 1;
	b[1] = 1;
	if (c[i] == 1)
	{
		s = b[0];
	}
	if (c[i] == 2)
	{
		s = b[1];
	}
	if (c[i] >= 3)
	{

	b[j + 2] = b[j] + b[j + 1];
	s = b[c[i] - 1];
	}
	}
	System.out.printf("%d\n",s);
	}

	}

}

