package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int[] n = new int[100];
	int i;
	int j;
	double[][] s = new double[100][100];
	double total;
	double result;
	double sum;
	double x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n[i] = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < n[i];j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s[i][j] = Double.parseDouble(tempVar3);
	}
	}
	}
	for (int l = 0;l < k;l++)
	{
	sum = 0;
	total = 0;
	for (j = 0;j < n[l];j++)
	{
	sum += (s[l][j] / (n[l]));
	}
	x = sum;
	for (j = 0;j < n[l];j++)
	{
	total += ((s[l][j] - x) * (s[l][j] - x));
	}
	result = Math.sqrt(total / n[l]);
	System.out.printf("%.5f\n",result);

	}
	return 0;
	}

}

