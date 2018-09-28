package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int[] szs = new int[300];
		int n;
		int i = 0;
		int j = 0;
		int s;
		int k = 0;
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
			sz[i] = Integer.parseInt(tempVar2);
		}
			if (i == 0)
			{
				s = 1;
			}
			for (j = 0;j < i;j++)
			{
			  if (sz[i] != sz[j])
			  {
			  s = 1;
			  }
			 else if (sz[i] == sz[j])
			 {
				 s = 0;
				 break;
			 }
			}
			  if (s == 1)
			  {
	szs[k] = sz[i];
	k++;
			  }
		}
	for (i = 0;i < k - 1;i++)
	{
	System.out.printf("%d,",szs[i]);
	}
	System.out.printf("%d",szs[k - 1]);
	return 0;
	}
}

