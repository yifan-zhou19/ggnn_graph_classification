package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rest; //rest???????m100,m50,m20,m10,m5,m1???
		int m100;
		int m50;
		int m20;
		int m10;
		int m5;
		int m1;
		rest = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m100 = m50 = m20 = m10 = m5 = m1 = 0; //???
		while (rest >= 100) //100???
		{
						rest = rest - 100;
						m100++;
		}
		while (rest >= 50) //50???
		{
					   rest = rest - 50;
					   m50++;
		}
		while (rest >= 20) //20???
		{
					   rest = rest - 20;
					   m20++;
		}
		while (rest >= 10) //10???
		{
					   rest = rest - 10;
					   m10++;
		}
		while (rest >= 5) //5???
		{
					  rest = rest - 5;
					  m5++;
		}
		while (rest >= 1) //1???
		{
					  rest = rest - 1;
					  m1++;
		}
		System.out.print(m100);
		System.out.print("\n");
		System.out.print(m50);
		System.out.print("\n");
		System.out.print(m20);
		System.out.print("\n");
		System.out.print(m10);
		System.out.print("\n");
		System.out.print(m5);
		System.out.print("\n");
		System.out.print(m1);
		return 0;
	}

}

