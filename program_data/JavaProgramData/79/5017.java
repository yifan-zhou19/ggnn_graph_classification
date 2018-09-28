package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int p;
	int w;
	int j;
	int[] n = new int[300];
	int[] m = new int[300];
	p = 0;
	w = 0;
	do
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[p] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[p] = Integer.parseInt(tempVar2);
		}
		p++;
	} while (n[p - 1] != 0);
	p = p - 1;
	for (i = 0;i < p;i++)
	{
	for (j = 2;j <= n[i];j++)
	{
	w = (w + m[i]) % j;
	}
	   System.out.printf("%d\n", w + 1);
	   w = 0;
	}
	return 0;
	}




}

