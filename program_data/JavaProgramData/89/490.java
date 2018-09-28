package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int icount;
		int[] know = new int[10000];
		int[] known = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				know[a]++;
				known[b]++;
			}
		}
		icount = 0;
		for (i = 0;i < n;i++)
		{
			if (know[i] == 0 && known[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				icount++;
			}
		}
		if (icount == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}

}

