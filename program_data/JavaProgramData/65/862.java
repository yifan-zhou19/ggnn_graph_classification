package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] aa = new int[n];
		int[] bb = new int[n];
		a = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				aa[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bb[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (aa[i] == 0 && bb[i] == 1)
			{
				a++;
			}
			if (aa[i] == 1 && bb[i] == 2)
			{
				a++;
			}
			if (aa[i] == 2 && bb[i] == 0)
			{
				a++;
			}
			if (aa[i] == 1 && bb[i] == 0)
			{
				a--;
			}
			if (aa[i] == 2 && bb[i] == 1)
			{
				a--;
			}
			if (aa[i] == 0 && bb[i] == 2)
			{
				a--;
			}
		}
		if (a == 0)
		{
			System.out.print("Tie");
		}
		if (a > 0)
		{
			System.out.print("A");
		}
		if (a < 0)
		{
			System.out.print("B");
		}
		return 0;
	}

}

