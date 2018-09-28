package <missing>;

public class GlobalMembers
{
	//******************************************** 
	//**  ????7???????               ** 
	//**  ?????? 1300012917               **
	//**  ???2013.10.11                      **
	//********************************************
	public static int Main()
	{
		int n; //??????
		int i;
		int s;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = n * (n + 1) * (2 * n + 1) / 6; //???n???????
		//?n<7????s 
		if (n < 7)
		{
			System.out.print(s);
			return (0);
		}

		//??17?n??????7?????? 
		a = 0;
		for (i = 17; i <= n; i += 10)
		{
		  a = a + i * i;
		}

		//????n?7??????? 
		b = 0;
		for (i = 7; i <= n; i += 7)
		{
		  b = b + i * i;
		}

		//????n?????7?????? 
		c = 0;
		if (n > 70)
		{
		  for (i = 71; (i <= n) && (i <= 79); i++)
		  {
			c = c + i * i;
		  }
		}

		s = s - a - b - c; //?s???a, b, c
		if (n >= 77)
		{
		  s += 2 * 77 * 77; //???77???3?????
		}
		System.out.print(s);
		return (0);
	}
}

