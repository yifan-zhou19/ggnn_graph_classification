package <missing>;

public class GlobalMembers
{
	public static int reverse(int number)
	{
		int res = 0;
		while (number != 0)
		{
			res = res * 10 + number % 10;
			number /= 10;
		}
		return res;
	}
	public static void Main()
	{
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int num6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			num2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			num3 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			num4 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			num5 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead("\n");
		if (tempVar6 != null)
		{
			num6 = Integer.parseInt(tempVar6);
		}
		System.out.printf("%ld\n%ld\n%ld\n%ld\n%ld\n%ld\n", reverse(num1),reverse(num2),reverse(num3),reverse(num4),reverse(num5),reverse(num6));
	}
}

