package <missing>;

public class GlobalMembers
{
	//********************************
	//* ????2.cpp                *
	//* ?? 1000012747              *
	//* ????????             *
	//********************************
	public static int reverse(int x) //?????????????
	{
		int[] b = new int[10]; //????b?????????i,j??????c??????
		int i;
		int j;
		int c = 0;
		for (i = 0;i < 10;i++)
		{
			b[i] = x % 10;
			x = x / 10;
			if (x < 10)
			{
				b[i + 1] = x;
				break;
			}
		} //??????????
		j = 0;
		while (b[j] == 0)
		{
			j++; //??????0?????
		}
		for (;j < i + 2;j++)
		{
			c = c + b[j] * (Math.pow(10.0,i + 1 - j)); //??c??
		}
		return (c);
	}
	public static int Main()
	{
		int a; //??????a?n=6????6???c??????
		int n = 6;
		int c;
		while (n > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else if (a < 0)
			{
				a = 0 - a; //a<0?????
				c = reverse(a);
				System.out.print("-");
				System.out.print(c);
				System.out.print("\n");
			}
			else
			{
				c = reverse(a);
				System.out.print(c);
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}
}

