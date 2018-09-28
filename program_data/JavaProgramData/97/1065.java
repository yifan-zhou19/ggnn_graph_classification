package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int bai;
		int wushi;
		int ershi;
		int shi;
		int wu;
		int yi;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bai = n / 100;
		wushi = (n - 100 * bai) / 50;
		ershi = (n - 100 * bai - 50 * wushi) / 20;
		shi = (n - 100 * bai - 50 * wushi - 20 * ershi) / 10;
		wu = (n - 100 * bai - 50 * wushi - 20 * ershi - 10 * shi) / 5;
		yi = n % 5;
		System.out.print(bai);
		System.out.print("\n");
		System.out.print(wushi);
		System.out.print("\n");
		System.out.print(ershi);
		System.out.print("\n");
		System.out.print(shi);
		System.out.print("\n");
		System.out.print(wu);
		System.out.print("\n");
		System.out.print(yi);
		System.out.print("\n");
		return 0;
	}
}

