package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int[] e = new int[10008];
		int i;
		int j;
		int m;
		int log;
		log = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 1)
		{
			if (n == k)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			e[1] = a;
			for (i = 2;i <= n;i++)
			{
				 String tempVar4 = ConsoleInput.scanfRead(" ");
				 if (tempVar4 != null)
				 {
					 a = Integer.parseInt(tempVar4);
				 }
				e[i] = a;
			}
			for (j = 1;j <= n;j++)
			{
				for (m = n;m > j;m--)
				{
					if ((e[j] + e[m]) == k)
					{
						System.out.print("yes");
						log = 1;
						break;
					}
				}
				if (log > 0.1)
				{
					break;
				}
			}
			if (log < 0.1)
			{
				System.out.print("no");
			}
		}
			return 0;
	}





}

