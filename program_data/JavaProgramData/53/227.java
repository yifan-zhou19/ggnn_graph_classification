package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[100];
		int j;
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
		}
		System.out.printf("%d",s[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (s[i] == s[j])
				{
					break;
				}
			}
			if (j == i)
			{
				System.out.printf(",%d",s[i]);
			}
		}
		System.out.print("\n");
	}

}

