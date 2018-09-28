//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			k = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			l = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			m = Integer.parseInt(tempVar6);
		}
		int reverse = int x;
		h = reverse(h);
		i = reverse(i);
		j = reverse(j);
		k = reverse(k);
		l = reverse(l);
		m = reverse(m);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",h,i,j,k,l,m);
	}
	public static int reverse(int x)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int y;
		if (x < 0)
		{
			f = -1 * x;
			x = f;
			a = x % 10;
			b = (int)(x / 10) % 10;
			c = (int)(x / 100) % 10;
			d = (int)(x / 1000) % 10;
			e = (int)(x / 10000);
			if (a != 0 && b == 0 && c == 0 && d == 0 && e == 0)
			{
				y = -1 * a;
			}
			if (a == 0 && b != 0 && c == 0 && d == 0 && e == 0)
			{
				y = -1 * b;
			}
			if (a != 0 && b != 0 && c == 0 && d == 0 && e == 0)
			{
				y = -1 * (10 * a + b);
			}
			if (a == 0 && b == 0 && c != 0 && d == 0 && e == 0)
			{
				y = -1 * c;
			}
			if (a == 0 && b != 0 && c != 0 && d == 0 && e == 0)
			{
				y = -1 * (10 * b + c);
			}
			if (a != 0 && c != 0 && d == 0 && e == 0)
			{
				y = -1 * (100 * a + 10 * b + c);
			}
			if (a == 0 && b == 0 && c == 0 && d != 0 && e == 0)
			{
				y = -1 * d;
			}
			if (a == 0 && b == 0 && c != 0 && d != 0 && e == 0)
			{
				y = -1 * (10 * c + d);
			}
			if (a == 0 && b != 0 && d != 0 && e == 0)
			{
				y = -1 * (100 * b + 10 * c + d);
			}
			if (a != 0 && d != 0 && e == 0)
			{
				y = -1 * (1000 * a + 100 * b + 10 * c + d);
			}
			if (a == 0 && b == 0 && c == 0 && d == 0 && e != 0)
			{
				y = -1 * e;
			}
			if (a == 0 && b == 0 && c == 0 && d != 0 && e != 0)
			{
				y = -1 * (10 * d + e);
			}
			if (a == 0 && b == 0 && c != 0 && e != 0)
			{
				y = -1 * (100 * c + 10 * d + e);
			}
			if (a == 0 && b != 0 && e != 0)
			{
				y = -1 * (1000 * b + 100 * c + 10 * d + e);
			}
			if (a != 0 && e != 0)
			{
				y = -1 * (10000 * a + 1000 * b + 100 * c + 10 * d + e);
			}
		}
		else if (x == 0)
		{
			y = 0;
		}
		else
		{
			a = x % 10;
			b = (int)(x / 10) % 10;
			c = (int)(x / 100) % 10;
			d = (int)(x / 1000) % 10;
			e = (int)(x / 10000);
			if (a != 0 && b == 0 && c == 0 && d == 0 && e == 0)
			{
				y = a;
			}
			if (a == 0 && b != 0 && c == 0 && d == 0 && e == 0)
			{
				y = b;
			}
			if (a != 0 && b != 0 && c == 0 && d == 0 && e == 0)
			{
				y = 10 * a + b;
			}
			if (a == 0 && b == 0 && c != 0 && d == 0 && e == 0)
			{
				y = c;
			}
			if (a == 0 && b != 0 && c != 0 && d == 0 && e == 0)
			{
				y = 10 * b + c;
			}
			if (a != 0 && c != 0 && d == 0 && e == 0)
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


