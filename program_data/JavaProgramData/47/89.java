package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] s = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			s[n + 1 - i] = a;
		}
		for (j = 1;j <= n - 1;j++)
		{
			System.out.printf("%d ",s[j]);
		}
		System.out.printf("%d",s[n]);
	}
}

