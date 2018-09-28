package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[100];
	int j = 0;
	int n;
	int i;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		if (i % 7 != 0)
		{
		if (i % 10 != 7 && i / 10 != 7)
		{
		   s = s + i * i;
		}
		}
	}
	System.out.printf("%d",s);
	}

}

