package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] elem = new int[200];
		int s = 0;
		int[] p = elem;
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
				p + i = tempVar2;
			}
		}
		System.out.printf("%d",p[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0,s = 0;j < i;j++)
			{
				if (p[i] == p[j])
				{
					s++;
				}
			}
			if (s == 0)
			{
				System.out.printf(",%d",p[i]);
			}
		}
	}
}

