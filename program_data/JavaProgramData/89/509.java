package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int ncount;
		int[] they = new int[10000];
		int[] me = new int[10000];
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
				they[a]++;
				me[b]++;
			}
		}
		ncount = 0;
		for (i = 0;i < n;i++)
		{
			if (they[i] == 0 && me[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				ncount++;
			}
		}
		if (ncount == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}


}

