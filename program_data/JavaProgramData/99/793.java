package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //?????????????
		double a = 0; //???????????????????
		double b = 0;
		double c = 0;
		double d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] e = new int[n]; //??????????????????
		for (int k = 0;k < n;k++)
		{
			e[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int k = 0;k < n;k++)
		{
			if (e[k] <= 18)
			{
				a++; //????????18?a+1
			}
			if (e[k] >= 19 && e[k] <= 35)
			{
				b++; //???????19?35???b+1
			}
			if (e[k] >= 36 && e[k] <= 60)
			{
				c++; //???????36?60???c+1
			}
			if (e[k] >= 61)
			{
				d++; //????????60?d+1
			}
		}
		a = a / n * 100; //????????
		b = b / n * 100; //????????
		c = c / n * 100; //????????
		d = d / n * 100; //????????
		System.out.print("1-18:"); //??
		System.out.print(" ");
			 System.out.printf("%.2f",a);
		System.out.print("%%");
		System.out.print("\n");
		System.out.print("19-35:");
			 System.out.print(" ");
		System.out.printf("%.2f",b);
		System.out.print("%%");
		System.out.print("\n");
		System.out.print("36-60:");
			 System.out.print(" ");
		System.out.printf("%.2f",c);
		System.out.print("%%");
		System.out.print("\n");
		System.out.print("60??:");
			 System.out.print(" ");
		System.out.printf("%.2f",d);
		System.out.print("%%");
		System.out.print("\n");
		return 0;
	}
































}

