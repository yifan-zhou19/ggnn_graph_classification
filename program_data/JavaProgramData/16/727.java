package <missing>;

public class GlobalMembers
{
	//********************** 
	//*?????????***
	//*?????? 1300012728***
	//*???2013.9.28******
	//**********************
	public static int Main()
	{
		int a; // ??abcd?????5??????
		int b;
		int c;
		int d;
		int num; // ??????
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num == 10000) // ??????10000????00001
		{
			System.out.print("00001");
		}
		else if (num < 10000 && num > 999) // ???4??
		{
			d = num / 1000; // d???
			c = num / 100 - d * 10; // c???
			b = num / 10 - d * 100 - c * 10; // b???
			a = num % 10; // a???
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
		}
		else if (num < 1000 && num >99) //?????
		{
			c = num / 100; // c???
			b = num / 10 - c * 10; // b???
			a = num % 10; // a???
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
		else if (num < 100 && num > 9) //?????
		{
			b = num / 10; // b???
			a = num - b * 10; // a???
			System.out.print(a);
			System.out.print(b);
		}
		else
		{
			System.out.print(num);
		}
		return 0;
	}

}

