package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int[] s = new int[1000];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int i = 1;i < n - k;i++)
			{
				a = s[k] + s[k + i];
				if (a == b)
				{
					System.out.print("yes");
					return 0;
				}
			}
		}
		System.out.print("no");
		return 0;
	}
}

