package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money; //???????
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int _100; //??????
		int _50;
		int _20;
		int _10;
		int _5;
		int _1;

		_100 = (money - money % 100) / 100; //100?????
		money = money % 100;
		System.out.print(_100);
		System.out.print('\n');

		_50 = (money - money % 50) / 50; //50?
		money = money % 50;
		System.out.print(_50);
		System.out.print('\n');

		_20 = (money - money % 20) / 20; //20?
		money = money % 20;
		System.out.print(_20);
		System.out.print('\n');

		_10 = (money - money % 10) / 10; //10?
		money = money % 10;
		System.out.print(_10);
		System.out.print('\n');

		_5 = (money - money % 5) / 5; //5?
		money = money % 5;
		System.out.print(_5);
		System.out.print('\n');

		_1 = money; //1?
		System.out.print(_1);

		return 0; //?> w <?
	}

}

