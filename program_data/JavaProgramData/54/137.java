package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	float m;
	float h;
	int l;
	int j;
	int n;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	if (n == 1)
	{
	System.out.printf("%d\n",(int)(n + k));
	}
	else
	{
	for (l = 1;;l++)
	{
	m = (float)(l) * (float)(n) + k;
	for (j = 1;j < n;j++)
	{
	if ((int)(m) != m)
	{
	break;
	}
	h = m / (float)(n - 1);
	m = h * (float)(n) + k;
	if ((int)(h) != h)
	{
	break;
	}
	}
	if ((int)(m) != m)
	{
	continue;
	}
	if ((int)(h) != h)
	{
	continue;
	}
	if ((int)(m) == m)
	{
	System.out.printf("%d\n",(int)(m));
	break;
	}
	}
	}
	}

}

