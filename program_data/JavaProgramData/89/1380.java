package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[2 * n];
		for (i = 0;i < n;i++)
		{
			p[i] = 0;
		}
		for (i = 1,j = 1;i != 0 || j != 0;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			p[j]++;
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (p[i] == (n - 1))
			{
				System.out.printf("%d\n",i);
				j = 1;
			}
		}
		if (j != 1)
		{
			System.out.print("NOT FOUND\n");
		}
	}







}

