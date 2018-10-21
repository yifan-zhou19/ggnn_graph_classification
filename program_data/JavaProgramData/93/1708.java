package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int m;
		int p;
		int j;
		char t = 'n';
		m = 3;
		p = 5;
		j = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d %d",m,p,j);
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.printf("%c",t);
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.printf("%d %d",m,p);
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",m,j);
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.printf("%d %d",p,j);
		}
		else if (a % 3 == 0)
		{
			System.out.printf("%d",m);
		}
		else if (a % 5 == 0)
		{
			System.out.printf("%d",p);
		}
		else if (a % 7 == 0)
		{
			System.out.printf("%d",j);
		}
		System.out.print("\n");
	}

}

