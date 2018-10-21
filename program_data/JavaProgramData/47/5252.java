package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[100];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		sum = n;
		for (int j = 1;j < n;j++)
		{
			System.out.printf("%d ",s[sum - j]);
		}
		System.out.printf("%d",s[0]);
		return 0;
	}
}

