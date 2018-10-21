package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int bai;
		int wushi;
		int ershi;
		int shi;
		int wu;
		int yi;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bai = a / 100;
		a = a % 100;
		wushi = a / 50;
		a = a % 50;
		ershi = a / 20;
		a = a % 20;
		shi = a / 10;
		a = a % 10;
		wu = a / 5;
		a = a % 5;
		yi = a;
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

