package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
		int[] age = new int[100];
		int a;
		int m = 0;
		int[] tmp1 = new int[100];
		int d = 0;
	char[][] zfc = new char[100][11];
	char[][] tmp2 = new char[100][11];
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
		zfc[i] = tempVar2.charAt(0);
	}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			age[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
	if (age[i] >= 60)
	{
	tmp2[m] = zfc[i];
	tmp1[m] = age[i];
	m++;
	}
	}
	for (a = m - 1;a > 0;a--)
	{
	for (d = 0;d < a;d++)
	{
	if (tmp1[d] < tmp1[d + 1])
	{
	String s = new String(new char[200]);
	s = tmp2[d];
	tmp2[d] = tmp2[d + 1];
	tmp2[d + 1] = s;
	int y;
	y = tmp1[d];
	tmp1[d] = tmp1[d + 1];
	tmp1[d + 1] = y;
	}
	}
	}
	for (a = 0;a < m;a++)
	{
	System.out.printf("%s\n",tmp2[a]);
	}
	for (i = 0;i < n;i++)
	{
	if (age[i] < 60)
	{
	System.out.printf("%s\n",zfc[i]);
	}
	}
	return 0;
	}
}

