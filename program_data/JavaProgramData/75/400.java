package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[5000]);
		String y = new String(new char[5000]);
		int[] xx = new int[5000];
		int[] yy = new int[5000];
		int[] t = new int[5000];
		int[] q = new int[5000];
		int i;
		int j;
		int ii;
		int num;
		int s;
		int k;
		int max = 0;
		int min = 1200;
		int most = 0;
		int least = 1200;
		int n1;
		int kk;
		int jj;
		int n2;
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = 0;
		num = 0;
		n1 = x.length();
		n2 = y.length();
		while (i < n1)
		{
			s = 1;
			num++;
			ii = i;
			jj = 1;
			while ((x.charAt(ii) != ',') && (ii < n1))
			{
				q[jj] = x.charAt(ii) - '0';
				jj++;
				ii++;
			//	cout << xx[num]<< endl;

			}
			for (kk = jj - 1; kk >= 1; kk--)
			{
					xx[num] += s * q[kk];
					s *= 10;
			}
		//	cout << xx[num]<< endl;
			if (xx[num] < min)
			{
				min = xx[num];
			}
			i = ii + 1;
			//cout << i << endl;
		}
		//cout << num << endl;
		i = 0;
		num = 0;
		while (i < n2)
		{
			s = 1;
			ii = i;
			num++;
			jj = 1;
			while ((y.charAt(ii) != ',') && (ii < n2))
			{
				q[jj] = y.charAt(ii) - '0';
				jj++;
				ii++;

			}
			for (kk = jj - 1; kk >= 1; kk--)
			{
					yy[num] += s * q[kk];
					s *= 10;
			}
			if (yy[num] > max)
			{
				max = yy[num];
			}
			i = ii + 1;
		}
	//	cout << num<< endl;
	//	cout << min << " " << max << endl;
		//cout << i << endl;
		for (j = 1; j <= num; j++)
		{
			//cout << xx[j] << endl;
			for (k = xx[j]; k < yy[j]; k++)
			{
				t[k]++;
			}
		}
		for (k = min; k <= max; k++)
		{
			//cout << t[k] << endl;
			if (t[k] > most)
			{
				most = t[k];
			}
			if (t[k] < least)
			{
				least = t[k];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(most);
		System.out.print("\n");

		return 0;
	}

}

