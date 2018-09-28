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
		int nian = new int(int a,int b);
		int qian = new int(int a,int b,int c);
		int hou = new int(int a,int b,int c);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		g = d - a;
		k = nian(a, g);
		if (g != 0)
		{
			k = k + qian(a, b, c);
		k = k + hou(d, e, f);
		}
		else
		{
			k = k + hou(d, e, f);
		k = k - hou(a, b, c);
		}
		System.out.printf("%d\n",k);
	}

	public static int nian(int a,int b)
	{
		int i;
		int j = 0;
		for (i = 1;i <= b - 1;i++)
		{
			if (((a + i) % 4 == 0 && (a + i) % 100 != 0) || ((a + i) % 400 == 0))
			{
			j = j + 366;
			}
		else
		{
			j = j + 365;
		}
		}
		return (j);
	}

	public static int qian(int a,int b,int c)
	{
		int pd1 = new int(int a,int b);
		int pd2 = new int(int a,int b);
		int pd3 = int a;
		int pd4 = int a;
		int e = 0;
		int i;
		int j;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
		 e = pd1(b, c);
		 for (i = b + 1;i <= 12;i++)
		 {
			 e = e + pd3(i);
		 }
		}
		 else
		 {
		 e = pd2(b, c);
		 for (i = b + 1;i <= 12;i++)
		 {
			 e = e + pd4(i);
		 }
		 }
		return (e);
	}

	public static int hou(int a,int b,int c)
	{
		int pd3 = int a;
		int pd4 = int a;
		int e;
		int i;
		int j;
		e = c;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
		 for (i = 1;i < b;i++)
		 {
			 e = e + pd3(i);
		 }
		}
		 else
		 {
		 for (i = 1;i < b;i++)
		 {
			 e = e + pd4(i);
		 }
		 }
		return (e);
	}


	public static int pd1(int a,int b)
	{
		switch (a)
		{
			case 1:
				return (31 - b);
				break;
		case 2:
			return (29 - b);
			break;
		case 3:
			return (31 - b);
			break;
		case 4:
			return (30 - b);
			break;
		case 5:
			return (31 - b);
			break;
		case 6:
			return (30 - b);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


