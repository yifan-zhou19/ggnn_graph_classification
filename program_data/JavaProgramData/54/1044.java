package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p = int a;
		double n;
		double k;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Double.parseDouble(tempVar2);
		}
		o = -k * (n - 1) + Math.pow(n,n);
		p(o);
	}

	public static int p(int a)
	{
		System.out.printf("%d",a);
	}


}

