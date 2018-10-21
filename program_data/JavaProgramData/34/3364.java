package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (a != 1)
		{
			if (a % 2 == 1)
			{
				System.out.printf("%d*3+1=",a);
				a = a * 3 + 1;
				System.out.printf("%d\n",a);
			}
			else if (a % 2 == 0)
			{
				System.out.printf("%d/2=",a);
				a = a / 2;
				System.out.printf("%d\n",a);
			}
		}
		System.out.print("End");
	}







}

