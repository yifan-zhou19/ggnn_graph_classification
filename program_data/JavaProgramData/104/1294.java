package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
		do
		{
			if (a > b)
			{
			  a = a / 2;
			}
			if (a < b)
			{
			  b = b / 2;
			}
		}while (a != b);
		System.out.printf("%d",a);
	}
}

