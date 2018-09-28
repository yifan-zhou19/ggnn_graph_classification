package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	void paixu(int * p,int k);
	int[] tian = new int[2010];
	int[] qi = new int[2010];
	int i;
	int j;
	int k;
	int n;
	int win;
	int equal;
	for (;;)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n != 0)
	{
	for (int i = 0;i < n;i++) //????i?j???????????? ???????
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		tian[i] = Integer.parseInt(tempVar2);
	}
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		qi[i] = Integer.parseInt(tempVar3);
	}
	}
	paixu(tian, n);
	paixu(qi, n);
	int win = 0;
	int equal = 0;

	for (int i = 0;i < n;i++) //??????????????????????????????0????????????
	{
	for (int j = n - 1;j >= 0;j--)
	{
	if (tian[i] > qi[j])
	{
	if (tian[i] != -1 && qi[j] != -1)
	{
	win++;
	tian[i] = -1;
	qi[j] = -1;
	break; //break???????????for??
	}
	}
	}
	}
	for (int i = 0;i < n;i++)
	{
	for (int j = 0;j < n;j++)
	{
	if (tian[i] == qi[j])
	{
	if (tian[i] != -1 && qi[j] != -1)
	{
	equal++;
	tian[i] = -1;
	qi[j] = -1;
	break;
	}
	}
	}
	}
	System.out.printf("%d\n",(win - (n - win - equal)) * 200);
	}
	else
	{
	break;
	}
	}
	}
	public static void paixu(int[] p, int k) //??????????????*p??????
	{
	int i;
	int j;
	int t;
	for (i = 0;i < k - 1;i++)
	{
	for (j = 0;j < k - 1 - i;j++)
	{
	if (p[j] > p[j + 1])
	{
	t = p[j];
	p[j] = p[j + 1];
	p[j + 1] = t;
	}
	}
	}
	}

}

