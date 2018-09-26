package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b = 0;
		int c = 0;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (;a > 0;a--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			if (temp > b)
			{
				c = b;
				b = temp;
			}
			else if (temp <= b != 0 && temp> c)
			{
				c = temp;
			}
		}
		System.out.printf("%d\n%d\n",b,c);




	}


}

