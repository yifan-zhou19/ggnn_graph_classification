package <missing>;

public class GlobalMembers
{
	public static int fei(int a)
	{
		int t;
		if (a == 1)
		{
		return 1;
		}
		if (a == 2)
		{
		return 1;
		}
		if (a != 1 && a != 2)
		{
			 t = fei(a - 1) + fei(a - 2);
			 return t;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] t = new int[20];
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
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",fei(t[i]));
		}
		System.in.read();
		System.in.read();
	}



}

