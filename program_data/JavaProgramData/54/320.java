package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int t;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n != 2)
		{
			p = Math.pow((double)n,(double)n);
			t = (int)p - n * k + k;
		}
		else
		{
			t = 7;
		}
		System.out.printf("%d",t);
	}


}

