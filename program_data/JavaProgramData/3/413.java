package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int x = 0;
		int[] w = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  w[i] = Integer.parseInt(tempVar3);
				  }
		}
		for (i = 0;i < n - 1;i++)
		{
						for (j = 0;j < n;j++)
						{
										if (m == w[i] + w[j])
										{
														x += 1;
														break;
										}
						}
						if (x > 0)
						{
							   break;
						}
		}

		if (x > 0)
		{

				System.out.print("yes");
		}
		else
		{
				System.out.print("no");
		}

		return 0;
	}

}

