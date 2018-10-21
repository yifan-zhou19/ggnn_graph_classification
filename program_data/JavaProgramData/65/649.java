package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		a = 0;
		b = 0;
		int[] zzd = new int[202];
		int[] hzy = new int[202];
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
				zzd[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hzy[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzd[i] == 0 && hzy[i] == 1)
			{
				a++;
			}
			if (zzd[i] == 0 && hzy[i] == 0)
			{
				a = a;
			}
			if (zzd[i] == 0 && hzy[i] == 2)
			{
				b++;
			}
			if (zzd[i] == 1 && hzy[i] == 1)
			{
				a = a;
			}
			if (zzd[i] == 1 && hzy[i] == 0)
			{
				b++;
			}
			if (zzd[i] == 1 && hzy[i] == 2)
			{
				a++;
			}
			if (zzd[i] == 2 && hzy[i] == 0)
			{
				a++;
			}
			if (zzd[i] == 2 && hzy[i] == 1)
			{
				b++;
			}
			if (zzd[i] == 2 && hzy[i] == 2)
			{
				a = a;
			}
		}
		if (a > b)
		{
		System.out.print("A");
		}
		else if (a < b)
		{
		System.out.print("B");
		}
		else if (a = b)
		{
		System.out.print("Tie");
		}
		return 0;
	}


}

