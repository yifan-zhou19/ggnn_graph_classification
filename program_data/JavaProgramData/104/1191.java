package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int temp;
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
		while (a != b)
		{
			do
			{
				a /= 2;
			}while (a > b);
			if (a < b)
			{
				temp = a;
				a = b;
				b = temp;
			}
		}
		System.out.printf("%d",a);
	}
}

