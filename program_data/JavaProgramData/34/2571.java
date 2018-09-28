package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int a) //????jiaogu
	{
		if (a % 2 == 0 && a != 0) //??a?????????2???????
		{
			System.out.print(a);
			System.out.print("/");
			System.out.print("2");
			System.out.print("=");
			System.out.print(a / 2);
			System.out.print("\n");
		 return jiaogu(a / 2);
		}
		else if (a % 2 == 1 && a != 1) //??a?????????3??????????
		{
			System.out.print(a);
			System.out.print("*");
			System.out.print("3");
			System.out.print("+");
			System.out.print("1");
			System.out.print("=");
			System.out.print((a * 3) + 1);
			System.out.print("\n");
		return jiaogu(a * 3 + 1);
		}
		else if (a == 1) //???1?????
		{
			System.out.print("End");
			System.out.print("\n");
		 return 0;
		}

	}
	public static int Main() //?????
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(a); //????
		return 0;
	} //?????
}

