package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] yuan = new int[100];
		int[] xin = new int[100];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				yuan[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
		   j = n - i + 1;
		   xin[j] = yuan[i];
		}
		System.out.printf("%d",xin[1]);
		for (j = 2;j <= n;j++)
		{
		System.out.printf(" %d",xin[j]);
		}
	}
}

