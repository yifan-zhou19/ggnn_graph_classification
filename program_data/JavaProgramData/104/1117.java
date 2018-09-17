package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void Hanshu(int a,int b);
		int a;
		int b;
		int k;
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
		Hanshu(a, b);
		return 0;
	}

	public static void Hanshu(int a,int b)
	{
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else if (a > b)
		{
			a = a / 2;
			Hanshu(a, b);
		}
		else
		{
			b = b / 2;
			Hanshu(a, b);
		}
	}
}

