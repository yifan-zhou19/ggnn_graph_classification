package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] s = new int[100];
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
				s[i] = Integer.parseInt(tempVar2);
			}
		};
		for (i = n - 1;i >= 0;i--)
		{
			if (i != 0)
			{
				System.out.printf("%d ",s[i]);
			}
			else
			{
				System.out.printf("%d",s[i]);
			};
		}

		return 0;
	}

}

