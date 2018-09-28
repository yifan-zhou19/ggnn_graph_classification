//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int q;
		int r;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float s;
		float m1;
		float m2;
		float m3;
		float m4;
		float m5;
		float m6;
		float f;
		float g;
		float[] l = new float[50]; //??
		float[] x = new float[10];
		float[] y = new float[10];
		float[] z = new float[10]; //??
		float[][] a1 = new float[50][2];
		float[][] a2 = new float[50][2];
		float[][] a3 = new float[50][2];
		float[][] b1 = new float[50][2];
		float[][] b2 = new float[50][2];
		float[][] b3 = new float[50][2]; //????????
		for (i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			z[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				l[p] = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]) + (z[j] - z[k]) * (z[j] - z[k]));
				a1[p][0] = x[j];
				a2[p][0] = y[j];
				a3[p][0] = z[j];
				b1[p][0] = x[k];
				b2[p][0] = y[k];
				b3[p][0] = z[k];
				a1[p][1] = j;
				a2[p][1] = j;
				a3[p][1] = j;
				b1[p][1] = k;
				b2[p][1] = k;
				b3[p][1] = k;
				p = p + 1;
			} //????????
		}
		for (q = 0;q < p - 1;q++)
		{
			for (r = q + 1;r < p;r++)
			{
				if (l[q] < l[r])
				{
					s = l[q];
					l[q] = l[r];
					l[r] = s;
					f = a1[q][1];
					a1[q][1] = a1[r][1];
					a1[r][1] = f;
					g = b1[q][1];
					b1[q][1] = b1[r][1];
					b1[r][1] = g;
					m1 = a1[q][0];
					a1[q][0] = a1[r][0];
					a1[r][0] = m1;
					m2 = a2[q][0];
					a2[q][0] = a2[r][0];
					a2[r][0] = m2;
					m3 = a3[q][0];
					a3[q][0] = a3[r][0];
					a3[r][0] = m3;
					m4 = b1[q][0];
					b1[q][0] = b1[r][0];
					b1[r][0] = m4;
					m5 = b2[q][0];
					b2[q][0] = b2[r][0];
					b2[r][0] = m5;
					m6 = b3[q][0];
					b3[q][0] = b3[r][0];
					b3[r][0] = m6;
				} //??????
				if (l[q] == l[r] && a1[q][1] >= a1[r][1])
				{
					f = a1[q][1];
					a1[q][1] = a1[r][1];
					a1[r][1] = f;
					g = b1[q][1];
					b1[q][1] = b1[r][1];
					b1[r][1] = g;
					m1 = a1[q][0];
					m1 = a1[q][0];
					a1[q][0] = a1[r][0];
					a1[r][0] = m1;
					m2 = a2[q][0];
					a2[q][0] = a2[r][0];
					a2[r][0] = m2;
					m3 = a3[q][0];
					a3[q][0] = a3[r][0];
					a3[r][0] = m3;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


