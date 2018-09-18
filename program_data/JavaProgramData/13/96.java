package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[20000];
		int[] st = new int[91];
		int tot = 0;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0 ; i < n ; i++)
		{
		  for (j = 0 ; j < i ; j++)
		  {
			  if (num[j] == num[i])
			  {
				  break;
			  }
		  }

		  if (j == i)
		  {
			  st[++tot] = num[i];
		  }
		}
		for (i = 1 ; i < tot ; i++)
		{
			System.out.printf("%d ",st[i]);
		}
		System.out.printf("%d",st[tot]);
	}

}

