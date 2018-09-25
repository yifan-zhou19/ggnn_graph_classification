package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int temp;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		if (a < b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		t1 = (int)(Math.log(a) / Math.log(2));
		t2 = (int)(Math.log(b) / Math.log(2));
		for (i = t1;i > t2;i--)
		{
			a = a / 2;
		}
		for (;a != b;)
		{
			a = a / 2;
			b = b / 2;
		}
		System.out.printf("%d\n",a);
		return 0;
	}
}

