package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] l = new int[100000];
		int k;
		int c = 0;
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
					l[i] = Integer.parseInt(tempVar2);
				}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (int i = 0;i < n - c;i++)
		{
				if (l[i] == k)
				{
				  for (int j = i;j < n - c;j++)
				  {
						  l[j] = l[j + 1];
				  }
				  c++;
				  i--;
				}
		}
		for (int i = 0;i < n - c;i++)
		{
				if (i == n - c - 1)
				{
				System.out.printf("%d",l[i]);
				}
				else
				{
				System.out.printf("%d ",l[i]);
				}
		}
		return 0;
	}
}

