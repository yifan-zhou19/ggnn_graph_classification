//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 3.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n]; //x[n],y[n],z[n]?????????
		int[] y = new int[n];
		int[] z = new int[n];
		int f = n * (n - 1) / 2; //f??????
		for (int i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] a1 = new int[f];
		int[] b1 = new int[f];
		int[] c1 = new int[f];
		int[] a2 = new int[f];
		int[] b2 = new int[f];
		int[] c2 = new int[f];
		float[] e = new float[f];
		int d = 0;
		int[] num = new int[f];
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				a1[d] = x[i]; //????????
				b1[d] = y[i];
				c1[d] = z[i];
				a2[d] = x[j];
				b2[d] = y[j];
				c2[d] = z[j];
				e[d] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				num[d] = d;
				d++; //e[f]???????
			}
		}
		int m = 0; //m,n1????????????
		float n1 = 0F;
		for (int i = 0;i < f;i++)
		{
			for (int j = i + 1;j < f;j++)
			{
				if (e[i] < e[j])
				{
					n1 = e[i];
					e[i] = e[j];
					e[j] = n1;
					m = a1[i];
					a1[i] = a1[j];
					a1[j] = m;
					m = b1[i];
					b1[i] = b1[j];
					b1[j] = m;
					m = c1[i];
					c1[i] = c1[j];
					c1[j] = m;
					m = a2[i];
					a2[i] = a2[j];
					a2[j] = m;
					m = b2[i];
					b2[i] = b2[j];
					b2[j] = m;
					m = c2[i];
					c2[i] = c2[j];
					c2[j] = m;
					m = num[i];
					num[i] = num[j];
					num[j] = m;
				}
				if ((e[i] == e[j]) && (num[i] > num[j])) //????????????
				{
					n1 = e[i];
					e[i] = e[j];
					e[j] = n1;
					m = a1[i];
					a1[i] = a1[j];
					a1[j] = m;
					m = b1[i];
					b1[i] = b1[j];
					b1[j] = m;
					m = c1[i];
					c1[i] = c1[j];
					c1[j] = m;
					m = a2[i];
					a2[i] = a2[j];
					a2[j] = m;
					m = b2[i];
					b2[i] = b2[j];
					b2[j] = m;
					m = c2[i];
					c2[i] = c2[j];
					c2[j] = m;
					m = num[i];
					num[i] = num[j];
					num[j] = m;
				}
			}
		}
		for (int i = 0;i < f;i++)
		{
			System.out.print("(");
			System.out.print(a1[i]);
			System.out.print(",");
			System.out.print(b1[i]);
			System.out.print(",");
			System.out.print(c1[i]);
			System.out.print(")-(");
			System.out.print(a2[i]);
			System.out.print(",");
			System.out.print(b2[i]);
			System.out.print(",");
			System.out.print(c2[i]);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


