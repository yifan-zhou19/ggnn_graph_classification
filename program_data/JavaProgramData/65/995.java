package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int i;
		int[] a = new int[200];
		int[] b = new int[200];
		p = 0;
		q = 0;
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
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
						 if (a[i] == 0)
						 {
									if (b[i] == 1)
									{
										p++;
									}
									if (b[i] == 2)
									{
										q++;
									}
						 }
						 else if (a[i] == 1)
						 {
									if (b[i] == 2)
									{
										p++;
									}
									if (b[i] == 0)
									{
										q++;
									}
						 }
						 else if (a[i] == 2)
						 {
									if (b[i] == 0)
									{
										p++;
									}
									if (b[i] == 1)
									{
										q++;
									}
						 }
		}
		if (p > q)
		{
			System.out.print("A");
		}
		else if (p < q)
		{
			System.out.print("B");
		}
		else if (p == q)
		{
			System.out.print("Tie");
		}
		return 0;
	}



}

