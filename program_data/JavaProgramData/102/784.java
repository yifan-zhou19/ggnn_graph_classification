package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int min;
	float[] re = new float[40];
	float t;
	char[][] str = new char[40][8];
	String tc = new String(new char[8]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	System.in.read();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		re[i] = Float.parseFloat(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	min = i;
	for (j = i;j < n;j++)
	{
	if (re[j] < re[min])
	{
	min = j;
	}
	}
	t = re[min];
	tc = str[min];
	re[min] = re[i];
	str[min] = str[i];
	re[i] = t;
	str[i] = tc;
	}
	for (i = 0;i < n;i++)
	{
	if (str[i][0] == 'm')
	{
	System.out.printf("%.2f ",re[i]);
	}
	}
	i = n - 1;
	while (str[i][0] == 'm')
	{
	i--;
	}
	System.out.printf("%.2f",re[i]);
	for (i = i - 1;i >= 0;i--)
	{
	if (str[i][0] == 'f')
	{
	System.out.printf(" %.2f",re[i]);
	}
	}
	}
}

