package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
		System.out.print("End");
		}
		else
		{
		do
		{
			b = a % 2;
		if (b == 0)
		{
		c = a / 2;
		System.out.printf("%d/2=%d\n",a,c);
		a = a / 2;
		}
		else
		{
		c = a * 3 + 1;
		System.out.printf("%d*3+1=%d\n",a,c);
		a = a * 3 + 1;
		}
		} while (a > 1);


		System.out.print("End");
		}
		System.in.read();
		System.in.read();
	}

}

