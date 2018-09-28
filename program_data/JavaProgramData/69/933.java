//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int shift(char n)
	{
		int shift;
		switch (n)
		{
			case'1':
			shift = 1;
			break;
			case'2':
			shift = 2;
			break;
			case'3':
			shift = 3;
			break;
			case'4':
			shift = 4;
			break;
			case'5':
			shift = 5;
			break;
			case'6':
			shift = 6;
			break;
			case'7':
			shift = 7;
			break;
			case'8':
			shift = 8;
			break;
			case'9':
			shift = 9;
			break;
			case'0':
			shift = 0;
			break;
		}
		return shift;
	}

	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		String c = new String(new char[252]);
		String d = new String(new char[252]);
		int lengtha;
		int lengthb;
		int[] sum = new int[252];
		int lon;
		int i;
		int lina;
		int linb;
		int cha;
		int sh;
		d = tangible.StringFunctions.changeCharacter(d, 0, '0');
		d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		lengtha = a.length();
		lengthb = b.length();
		for (lina = 0;lina < lengtha;lina++)
		{
			if (a.charAt(lina) != '0')
			{
				break;
			}
		}
		lina;
		for (linb = 0;linb < lengthb;linb++)
		{
			if (b.charAt(linb) != '0')
			{
				break;
			}
		}
		linb;


		if (lengtha - lina >= lengthb - linb)
		{
			cha = (lengtha - lina) - (lengthb - linb);
			for (i = 0;i <= cha;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			c = tangible.StringFunctions.changeCharacter(c, cha + 1, '\0');
			c += b;
			d += a;
			lon = lengtha;
			sh = lina;
		}
		else
		{
			cha = (lengthb - linb) - (lengtha - lina);
			for (i = 0;i <= cha;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			c = tangible.StringFunctions.changeCharacter(c, cha + 1, '\0');
			c += a;
			d += b;
			lon = lengthb;
			sh = linb;
		}
		sum[lon] = 0;
		for (i = lon;i > sh;i--)
		{
			sum[i - 1] = 0;
			sum[i] = shift(d.charAt(i)) + shift(c.charAt(i)) + sum[i];
			if (sum[i] >= 10)
			{
				sum[i] -= 10;
				sum[i - 1]++;
			}
		}
		if (sh == 0)
		{
			if (sum[0] == 1)
			{
				System.out.print("1");
			}
			for (i = 1;i <= lon;i++)
			{
				System.out.printf("%d",sum[i]);
			}
			System.out.print("\n");
		}
		else
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


