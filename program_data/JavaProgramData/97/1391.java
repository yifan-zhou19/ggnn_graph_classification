package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = n;i >= 100;i = i - 100)
		{
			a++;
		}
		for (i;i >= 50;i = i - 50)
		{
			b++;
		}
		for (i;i >= 20;i = i - 20)
		{
			c++;
		}
		for (i;i >= 10;i = i - 10)
		{
			d++;
		}
		for (i;i >= 5;i = i - 5)
		{
			e++;
		}
		f = i;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
		return 0;
	}
}

