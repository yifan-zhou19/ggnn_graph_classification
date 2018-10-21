package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		e = k % 10;
			  d = (k % 100 - e) / 10;
			 c = (k % 1000 - d * 10 - e) / 100;
			 b = (k % 10000 - c * 100 - d * 10 - e * 1) / 1000;
			 a = (k % 100000 - b * 1000 - c * 100 - d * 10 - e * 1) / 10000;
		if (a != 0)
		{
			l = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			System.out.printf("%d",l);
		}
		else if (b != 0)
		{
			l = e * 1000 + d * 100 + c * 10 + b;
			System.out.printf("%d",l);
		}
		else if (c != 0)
		{
					  l = e * 100 + d * 10 + c * 1;
			System.out.printf("%d",l);
		}
		else if (d != 0)
		{
			l = e * 10 + d;
			System.out.printf("%d",l);
		}
		else if (e != 0)
		{
					 l = e;
			System.out.printf("%d",l);
		}
		else
		{
			System.out.print("error");
		}
	}


}

