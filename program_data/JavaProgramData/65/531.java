package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int z;
		int a = 0;
		int b = 0;
		int[] sa = new int[100];
		int[] sb = new int[100];
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
			sa[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sb[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (sa[i] == 0 && sb[i] == 1)
			{
	a = a + 1;
			}
		else if (sa[i] == 1 && sb[i] == 0)
		{
		b = b + 1;
		}
		else if (sa[i] == 1 && sb[i] == 2)
		{
			a = a + 1;
		}
		else if (sa[i] == 2 && sb[i] == 1)
		{
			b = b + 1;
		}
		else if (sa[i] == 0 && sb[i] == 2)
		{
		b = b + 1;
		}
		else if (sa[i] == 2 && sb[i] == 0)
		{
		a = a + 1;
		}
		 else if (sa[i] == sb[i])
		 {
		z = 0;
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

