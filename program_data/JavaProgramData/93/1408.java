package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int a = 3;
		int b = 5;
		int c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		if (t % a == 0 && t % b == 0 && t % c == 0)
		{
			System.out.printf("%d %d %d",a,b,c);
		}
		else if (t % a == 0 && t % b == 0)
		{
			System.out.printf("%d %d",a,b);
		}
		else if (t % a == 0 && t % c == 0)
		{
			System.out.printf("%d %d",a,c);
		}
		else if (t % b == 0 && t % c == 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (t % a == 0)
		{
			System.out.printf("%d",a);
		}
		else if (t % b == 0)
		{
			System.out.printf("%d",b);
		}
		else if (t % c == 0)
		{
			System.out.printf("%d",c);
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}
}

