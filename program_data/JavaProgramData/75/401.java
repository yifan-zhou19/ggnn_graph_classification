package <missing>;

public class GlobalMembers
{
	/**
	 *@ file    1000012834_007homework.cpp
	 *@ author  ???
	 *@ date    2010-11-26
	 *@ description 
	 *          ????????????
	 */
	public static int num;
	public static int minn = 5000;
	public static int maxx = 0;
	public static void trans(int[] num1, String str)
	{
		int len;
		int i;
		int ii;
		int jj;
		int kk;
		int s;
		int[] q = new int[5000];
		len = str.length();
		i = 0;
		num = 0;
		while (i < len)
		{
			s = 1;
			num++;
			ii = i;
			jj = 1;
			while ((!str[ii].equals(',')) && (ii < len))
			{
				q[jj] = str[ii] - '0';
				jj++;
				ii++;
			}
			for (kk = jj - 1; kk >= 1; kk--)
			{
					num1[num] += s * q[kk];
					s *= 10;
			}
			if (num1[num] < minn)
			{
				minn = num1[num];
			}
			if (num1[num] > maxx)
			{
				maxx = num1[num];
			}
			i = ii + 1;
		}
	}
	public static int Main()
	{
		String x = new String(new char[5000]);
		String y = new String(new char[5000]);
		int[] xx = new int[5000];
		int[] yy = new int[5000];
		int[] t = new int[5000];
		int j;
		int k;
		int ii;
		int s;
		int most = 0;
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = ConsoleInput.readToWhiteSpace(true).charAt(0);
			trans(xx, x);
			trans(yy, y);
		/*i = 0;
		num = 0;
		while (x[i] != 0)
		{
			s = 1;
			ii = i;
			num ++;
			while (x[ii] != ',')
			{
				xx[num / 2 + 1] += s * (x[ii] - '0');
				s *= 10;
				ii ++;
			}
				//cout << xx[i / 2 + 1]<< endl;
			if (xx[num / 2 + 1] < min)
				min = xx[num / 2 + 1];
			}
			i = ii;
		}
		i = 0;
		num = 0;
		s = 1;
		while (y[i] != 0)
		{
			ii = i;
			s = 1;
			num ++;
			while (y[ii] != ',')
			{
				yy[num / 2 + 1] += s * (y[ii] - '0');
				s *= 10;
				ii ++;
			}
				if (yy[num / 2 + 1] > max)
				max = yy[num / 2 + 1];
			i = ii;
		}*/

	for (j = 1; j <= num; j++)
	{
			for (k = xx[j]; k < yy[j]; k++)
			{
				t[k]++;
			}
	}
		for (k = minn; k <= maxx; k++)
		{
			//cout << t[k] << endl;
			if (t[k] > most)
			{
				most = t[k];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(most);
		System.out.print("\n");

		return 0;
	}
}

