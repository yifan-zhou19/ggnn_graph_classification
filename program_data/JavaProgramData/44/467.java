package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[100];
		int x;
		int b;
		int answer;
		answer = 0;
		if (num < 0)
		{
		x = -num;
		}
		else
		{
		x = num;
		}
		while (x != 0)
		{
			b = x % 10;
			answer = answer * 10 + b;
			x = x / 10;
		}
		if (num < 0)
		{
		answer = -answer;
		}
		return answer;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d",reverse(a));
		System.out.print("\n");
		System.out.printf("%d",reverse(b));
		System.out.print("\n");
		System.out.printf("%d",reverse(c));
		System.out.print("\n");
		System.out.printf("%d",reverse(d));
		System.out.print("\n");
		System.out.printf("%d",reverse(e));
		System.out.print("\n");
		System.out.printf("%d",reverse(f));
		System.out.print("\n");
	}



}

