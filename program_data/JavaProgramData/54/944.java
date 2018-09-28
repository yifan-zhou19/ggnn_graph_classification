package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = new int(int n,int k);
	int n;
	int k;
	int s;
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
	s = sum(n, k);
	System.out.printf("%d",s);
	return 0;
	}
	public static int sum(int n,int k)
	{
		int s;
		int i;
	s = n;
	for (i = 1;i < n - 1;i++)
	{
	s = s * n;
	}
	s = s - k;
	s = s * n + k;
	return s;
	}
}

