package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*   ?  ?   ?: ?????.cpp                          *
	//*   ?       ?: ? ?                                   *
	//*   ? ? ? ?: 2010?10?22?                          *
	//*   ? ? ? ?: ??????????????????345 *
	//*                ????????????????????*
	//*                ?????100??50??20??10??5??*
	//*                1??????????????????? *
	//**********************************************************
	public static int Main() //???
	{ //?????
		int n = 0; //??n?????,a,b,c,d,e,
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
																		//f???100??50??20??10??5??1????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 100;
		b = (n - a * 100) / 50;
		c = (n - a * 100 - b * 50) / 20;
		d = (n - a * 100 - b * 50 - c * 20) / 10;
		e = (n - a * 100 - b * 50 - c * 20 - d * 10) / 5;
		f = n - a * 100 - b * 50 - c * 20 - d * 10 - e * 5;
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
																		//?????
		return 0;
	}
}

