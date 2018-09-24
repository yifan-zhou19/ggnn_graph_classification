package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
			if (a % 2 == 0)
			{
				b = a / 2;
				System.out.printf("%d/2=%d\n",a,b);
			}
			else
			{
				b = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,b);
			}
			a = b;
		} while (a != 1);
		System.out.print("End");
		}
	}
}

