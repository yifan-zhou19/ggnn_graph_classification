package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		void search(int,int);
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
		search(a, b);
	}
	public static void search(int a,int b)
	{
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else if (a > b)
		{
			search(a / 2, b);
		}
		else
		{
			search(a, b / 2);
		}
	}
}

