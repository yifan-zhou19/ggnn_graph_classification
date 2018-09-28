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
		int[] p;

		p = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}

		}

		int del;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			del = Integer.parseInt(tempVar3);
		}
		int c = 0;
		for (int i = 0;i <= n - 1;i++)
		{
				if (p[i] != del)
				{
					c++;
							 if (c == 1)
							 {
								 System.out.printf("%d",p[i]);
							 }
							 else
							 {
								 System.out.printf(" %d",p[i]);
							 }
				}


		}











	}

}

