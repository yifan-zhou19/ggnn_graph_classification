package <missing>;

public class GlobalMembers
{
	public static int Main(int a,int b)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		while (a != b)
		{
			while (a > b)
			{
				a /= 2;
			}
			while (a < b)
			{
				b /= 2;
			}
		}
		System.out.printf("%d\n",a);
	}
}

