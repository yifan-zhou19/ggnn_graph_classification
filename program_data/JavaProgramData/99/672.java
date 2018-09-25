package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int i;
		int[] a = new int[100];
		double n; //????
		double x = 0;
		double y = 0;
		double z = 0;
		double w = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] <= 18 && a[i] >= 1)
			{
				x = x + 1;
			}
			if (a[i] <= 35 && a[i] >= 19)
			{
				y = y + 1;
			}
			if (a[i] <= 60 && a[i] >= 36)
			{
				z = z + 1;
			}
			if (a[i] > 60)
			{
				w = w + 1; //???????
			}
		}
		x = 100 * (x / n);
		y = 100 * (y / n);
		z = 100 * (z / n);
		w = 100 * (w / n); //?????
		System.out.print("1-18: ");
		System.out.printf("%.2lf",x);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",y);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",z);
		System.out.print("%");
		System.out.print("\n");
		System.out.print("60??: ");
		System.out.printf("%.2lf",w);
		System.out.print("%");
		System.out.print("\n");
		return 0;
	}

}

