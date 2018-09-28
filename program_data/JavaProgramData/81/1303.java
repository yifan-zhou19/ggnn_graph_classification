package <missing>;

public class GlobalMembers
{
	public static int rev(int[][] in, tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int[] tem = new int[5];
		int i;
	if ((x.argValue < 5) && (y.argValue < 5))
	{
	for (i = 0; i < 5; i++)
	{
		tem[i] = in[x.argValue][i];
	 in[x.argValue][i] = in[y.argValue][i];
	 in[y.argValue][i] = tem[i];
	}
	return 1;
	}
	else
	{
	return 0;
	}


	}

	public static void Main()
	{
		int[][] in = new int[5][5];
	 int n;
	 int m;
	 int i;
	 int j;
	 int a;
	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 5; j++)
		{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 in[i][j] = Integer.parseInt(tempVar);
	 }
		}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}

tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
	a = rev(in, tempRef_n, tempRef_m);
	m = tempRef_m.argValue;
	n = tempRef_n.argValue;

	if (a == 0)
	{
	System.out.print("error");
	}
	if (a == 1)
	{
	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 4; j++)
		{
	 System.out.printf("%d ", in[i][j]);
		}
	 System.out.printf("%d\n", in[i][4]);
	}
	}

	}
}

