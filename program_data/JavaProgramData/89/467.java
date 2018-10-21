package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int sus;
		int num;
		num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] k = new int[n];
		for (i = 0;i < n;i++)
		{
		k[i] = i;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		while (p != 0 || q != 0)
		{
						k[p] = -1;
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							p = Integer.parseInt(tempVar4);
						}
						String tempVar5 = ConsoleInput.scanfRead(" ");
						if (tempVar5 != null)
						{
							q = Integer.parseInt(tempVar5);
						}
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] != -1)
			{
			 sus = k[i];
			 break;
			}
			else
			{
			num = num + 1;
			}
		}
		if (num == n)
		{
		System.out.print("NOT FOUND");
		}
		else
		{
		System.out.printf("%d",sus);
		}
		System.in.read();
		System.in.read();
	}










}

