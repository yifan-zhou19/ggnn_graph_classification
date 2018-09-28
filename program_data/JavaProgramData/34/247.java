package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a != 1)
		{
		for (i = 0;i < 1000;i++)
		{
		 if (a % 2 == 0)
		 {
			b = a / 2;
			System.out.printf("%d/2=%d\n",a,b);
			a = b;
		 }
		 else
		 {
			c = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,c);
			a = c;
		 }
		if (a == 1)
		{
			break;
		}
		else
		{
			continue;
		}
		}
			System.out.print("End");
		}
		else
		{
			System.out.print("End");
		}
		return 0;
	}

}

