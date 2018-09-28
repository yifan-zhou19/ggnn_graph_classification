package <missing>;

public class GlobalMembers
{
	public static int checkyear(int a) //?????1
	{
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
	double x;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		c[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
		if (checkyear(a[i]) != 0)
		{
		int[] x = {0, 0, 31, 31 + 29, 31 + 29 + 31, 31 + 29 + 31 + 30, 31 + 29 + 31 + 30 + 31, 31 + 29 + 31 + 30 + 31 + 30, 31 + 29 + 31 + 30 + 31 + 30 + 31, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31};
		if ((x[b[i]] - x[c[i]]) % 7 == 0)
		{
	 System.out.print("YES\n");
		}
	 else
	 {
		 System.out.print("NO\n");
	 }
		}
	 else
	 {
		 int[] x = {0, 0, 31, 31 + 28, 31 + 28 + 31, 31 + 28 + 31 + 30, 31 + 28 + 31 + 30 + 31, 31 + 28 + 31 + 30 + 31 + 30, 31 + 28 + 31 + 30 + 31 + 30 + 31, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31};
		 if ((x[b[i]] - x[c[i]]) % 7 == 0)
		 {
	 System.out.print("YES\n");
		 }
	 else
	 {
		 System.out.print("NO\n");
	 }
	 }
	}




	System.in.read();
	System.in.read();
	System.in.read();

	}


}

