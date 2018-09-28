package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int i;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 1000;i++)
		{
			if (a == 1)
			{
			System.out.print("End");
			break;
			}
		if (a % 2 == 1)
		{
			b = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,b);
			a = b;
		}
		else
		{
			b = a / 2;
			System.out.printf("%d/2=%d\n",a,b);
			a = b;
		}

		}
	}

}

