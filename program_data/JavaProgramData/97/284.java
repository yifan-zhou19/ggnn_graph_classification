package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int num1 = n / 100;
		System.out.printf("%d\n",num1);
		n -= num1 * 100;
		int num2 = n / 50;
		System.out.printf("%d\n",num2);
		n -= num2 * 50;
		int num3 = n / 20;
		System.out.printf("%d\n",num3);
		n -= num3 * 20;
		int num4 = n / 10;
		System.out.printf("%d\n",num4);
		n -= num4 * 10;
		int num5 = n / 5;
		System.out.printf("%d\n",num5);
		n -= num5 * 5;
		int num6 = n;
		System.out.printf("%d\n",num6);

	}
}

