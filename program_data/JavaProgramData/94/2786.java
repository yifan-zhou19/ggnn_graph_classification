package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			  int[] sz = new int[500];
		for (int i = 0;i < n;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  sz[i] = Integer.parseInt(tempVar2);
			  }
		}
		int j = 0;
		int[] odd = new int[500];
		for (int i = 0;i < n;i++)
		{
			  if (sz[i] % 2 == 1)
			  {
			  odd[j] = sz[i];
			  j++;
			  }
		}
			  int e;
		for (int k = 0;k < j - 1;k++)
		{
			  for (int i = 0;i < j - k - 1;i++)
			  {
			  if (odd[i] > odd[i + 1])
			  {
				e = odd[i];
				odd[i] = odd[i + 1];
				odd[i + 1] = e;
			  }
			  }
		}
		for (int i = 0;i < j - 1;i++)
		{
			  System.out.printf("%d,",odd[i]);
		}
		System.out.printf("%d",odd[j - 1]);
	return 0;
	}

}

