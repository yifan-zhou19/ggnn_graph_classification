package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ? ?                        *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 24 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int[] x = new int[5000];
		int[] y = new int[5000];
		int[] k1 = new int[5000];
		int[] k2 = new int[5000];
		int p = 1;
		int q = 1;
		int k;
		int la;
		int lb;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

		//???????????????????????????
		la = a.length();
		lb = b.length();
		for (int i = 0; i < la; i++) //????????
		{
			if (a.charAt(i) == ',')
			{
				k1[p++] = i;
			}
		}
		for (int i = 0; i < lb; i++)
		{
			if (b.charAt(i) == ',')
			{
				k2[q++] = i;
			}
		}

		//?????????????k[i]?k[i+1]????????p=q
		k1[0] = -1;
		k2[0] = -1;
		k1[p] = la;
		k2[q] = lb;

		//??????????????
		for (int i = 0; i < p; i++)
		{
			k = 1;
			for (int j = k1[i + 1] - 1; j >= k1[i] + 1; j--)
			{
				x[i] += (a.charAt(j) - '0') * k;
				k *= 10;
			}
			k = 1;
			for (int j = k2[i + 1] - 1; j >= k2[i] + 1; j--)
			{
				y[i] += (b.charAt(j) - '0') * k;
				k *= 10;
			}
		}
		for (int i = 0; i < p; i++) //???????
		{
			for (int j = 1; j < p - i; j++)
			{
				if (x[j - 1] > x[j])
				{
					k = x[j];
					x[j] = x[j - 1];
					x[j - 1] = k;
					k = y[j];
					y[j] = y[j - 1];
					y[j - 1] = k;
				}
			}
		}
		int max = 0;
		int[] t = new int[5000];
		int sum;
		k = 1;
		t[0] = 0;
		for (int i = 0; i < p - 1; i++) //???t???????????x????
		{
			if (x[i + 1] != x[i])
			{
				t[k++] = i + 1;
			}
		}
		t[k] = p;
		max = t[1];

		//?????????????????
		for (int i = 1; i < k; i++)
		{
			sum = t[i + 1] - t[i]; //????????????
			for (int j = 0; j < t[i]; j++) //?????????????
			{
				if (y[j] > x[t[i]])
				{
					sum += 1;
				}
			}
			if (sum > max) //???????????
			{
				max = sum;
			}
		}
		System.out.print(p);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}

