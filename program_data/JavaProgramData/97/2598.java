package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int money;
	  int left;
	  int p100;
	  int p50;
	  int p20;
	  int p10;
	  int p5;
	  int p1;
	  money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  p100 = money / 100;
	  p50 = (money % 100) / 50;
	 left = money - p100 * 100 - p50 * 50;
	  p20 = left / 20;
	  p10 = (left - p20 * 20) / 10;
	  p5 = (money % 10) / 5;
	  p1 = money % 10 - p5 * 5;
	  System.out.print(p100);
	  System.out.print("\n");
	  System.out.print(p50);
	  System.out.print("\n");
	  System.out.print(p20);
	  System.out.print("\n");
	  System.out.print(p10);
	  System.out.print("\n");
	  System.out.print(p5);
	  System.out.print("\n");
	  System.out.print(p1);
	  System.out.print("\n");
	  return 0;
	}
}

