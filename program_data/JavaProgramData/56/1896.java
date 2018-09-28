package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		char a;
		char b;
		char c;
		char d;
		char e;
		int n;
		n = 0;
		while (scanf("%c", ch) != EOF)
		{
			n = n + 1;

			switch (n)
			{
			case 1:
				a = ch;
				break;
			case 2:
				b = ch;
				break;
			case 3:
				c = ch;
				break;
			case 4:
				d = ch;
				break;
			case 5:
				e = ch;
				break;
			}
		}

		while (n > 0)
		{

			switch (n)
			{
			case 5:
				System.out.printf("%c",e);
				break;
			case 4:
				System.out.printf("%c",d);
				break;
			case 3:
				System.out.printf("%c",c);
				break;
			case 2:
				System.out.printf("%c",b);
				break;
			case 1:
				System.out.printf("%c",a);
				break;
			}
				n = n - 1;
		}
		return 0;
	}
}
