package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void st(int s[],int i);
	void cha(int s[],int i);
	void pp(int s[],int ss[],int m,int n);
	int m;
	int n;
	int[] s = new int[100];
	int[] ss = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	st(s, m);
	st(ss, n);
	cha(s, m);
	cha(ss, n);
	pp(s, ss, m, n);
	return 0;
	}
	public static void st(int[] k, int i)
	{
		int j;
	for (j = 1;j <= i;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k[j] = Integer.parseInt(tempVar);
	}
	}
	}
	public static void cha(int[] k, int i)
	{
		int j;
		int m;
		int temp;
	for (j = 1;j < i;j++)
	{
		for (m = j + 1;m <= i;m++)
		{
			 if (k[m] < k[j])
			 {
				  temp = k[m];
				  k[m] = k[j];
				  k[j] = temp;
			 }
		}
	}
	}
	public static void pp(int[] s, int[] ss, int m, int n)
	{
		int i = 2;
		System.out.printf("%d",s[1]);
	for (i = 2;i <= m + n;i++)
	{
		if (i <= m)
		{
	System.out.printf(" %d",s[i]);
		}
	else
	{
	System.out.printf(" %d",ss[i - m]);
	}
	}
	}
}

