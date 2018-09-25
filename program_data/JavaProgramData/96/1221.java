//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int posi(tangible.RefObject<String> data, int k, int pos)
	{
		for (int ii = 0; ii < k; ii++)
		{
			if (data.argValue.charAt(pos + k - ii - 1) < 10)
			{
				data.argValue.charAt(pos + k - ii - 2)--;
				data.argValue.charAt(pos + k - ii - 1) += 10;
			}
		}
		return 1;
	}
	public static int convert(tangible.RefObject<String> data)
	{
		int k = data.argValue.length();
		for (int co = 0; co < k ; co++)
		{
			data.argValue.charAt(co) = data.argValue.charAt(co) - '0' + 10;
		}
		return 0;
	}
	public static int compare(tangible.RefObject<String> data1, tangible.RefObject<String> data2, int pos)
	{
		int j = data1.argValue.length();
		int k = data2.argValue.length();
		if (j < k + pos)
		{
			return 3;
		}
		if (pos >= 1)
		{
			if (data1.argValue.charAt(pos - 1) > 10)
			{
				return 1;
			}
		}
		for (int i = 0;i < k;i++)
		{
			if (data1.argValue.charAt(i + pos) > data2.argValue.charAt(i))
			{
				return 1;
			}
			if (data1.argValue.charAt(i + pos) < data2.argValue.charAt(i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int out(tangible.RefObject<String> data1, tangible.RefObject<String> data2, int pos)
	{
		int k = data2.argValue.length();
		for (int i = 0;i < k;i++)
		{
			data1.argValue.charAt(i + pos) -= data2.argValue.charAt(i) - 10;
		}
		posi(data1, k, pos);
		return 0;
	}

	public static int Main()
	{
		int n;
		String data1 = new String(new char[450]);
		final String data2 = "13";
		String r = new String(new char[450]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			data1 = tempVar.charAt(0);
		}
		int j;
		int k;
		j = data1.length();
		k = data2.length();
	tangible.RefObject<String> tempRef_data1 = new tangible.RefObject<String>(data1);
		convert(tempRef_data1);
		data1 = tempRef_data1.argValue;
	tangible.RefObject<String> tempRef_data2 = new tangible.RefObject<String>(data2);
		convert(tempRef_data2);
		data2 = tempRef_data2.argValue;
		int kk;
		int pp = 0;
		for (kk = 0; ;kk++)
		{
			int pd = 0;
		tangible.RefObject<String> tempRef_data12 = new tangible.RefObject<String>(data1);
		tangible.RefObject<String> tempRef_data22 = new tangible.RefObject<String>(data2);
			if (compare(tempRef_data12, tempRef_data22, kk) == 3)
			{
				data2 = tempRef_data22.argValue;
				data1 = tempRef_data12.argValue;
				break;
			}
			else
			{
				data2 = tempRef_data22.argValue;
				data1 = tempRef_data12.argValue;
			}
			for (;;pd++)
			{
			tangible.RefObject<String> tempRef_data13 = new tangible.RefObject<String>(data1);
			tangible.RefObject<String> tempRef_data23 = new tangible.RefObject<String>(data2);
				if (compare(tempRef_data13, tempRef_data23, kk) == 1)
				{
					data2 = tempRef_data23.argValue;
					data1 = tempRef_data13.argValue;
				tangible.RefObject<String> tempRef_data14 = new tangible.RefObject<String>(data1);
				tangible.RefObject<String> tempRef_data24 = new tangible.RefObject<String>(data2);
					out(tempRef_data14, tempRef_data24, kk);
					data2 = tempRef_data24.argValue;
					data1 = tempRef_data14.argValue;
				}
				else
				{
					data2 = tempRef_data23.argValue;
					data1 = tempRef_data13.argValue;
					break;
				}
			}
			r = tangible.StringFunctions.changeCharacter(r, kk - pp, pd + 10);
			if (kk == 0 && pd == 0)
			{
				pp++;
			}
		}
		r = r.substring(0, kk - pp);
		int w = r.length();
		for (int rr = 0 ;rr < w; rr++)
		{
			System.out.printf("%d",r.charAt(rr) - 10);
		}
		if (w == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		w = data1.length();
		int qq = 1;
		for (int rr = 0 ;rr < w; rr++)
		{
			if (qq != 0)
			{
				if (data1.charAt(rr) != 10)
				{
				System.out.printf("%d",data1.charAt(rr) - 10);
				qq = 0;
				}
			else
			{
				;
			}
			}
			else
			{
				System.out.printf("%d",data1.charAt(rr) - 10);
			}
		}
		if (qq != 0)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


