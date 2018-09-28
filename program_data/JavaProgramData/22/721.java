package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		char c;
		a = 0,b = 0;

		do
		{

				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tempVar2.charAt(0);
				}
				if (n > b)
				{
					a = b;
					b = n;
				}
				else if (n > a && n < b)
				{
					a = n;
				}
		}while (c == ',');
		if (a == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d",a);
		}
		return 0;
	}

}

