package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  HomeWork_11.14.Functions
	//  ?????
	//  Created by ??? on 11/25/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//

	///#include <string>


	public static void delZero(String a)
	{
		int i = 0;
		int count = 0;
		for (i = 0; i < MAXNUM; i++)
		{
			if (a[i].equals('0'))
			{
				count++;
			}
			if (!a[i].equals('0'))
			{
				break;
			}
		}
		for (i = 0; !a[i + count].equals('\0'); i++)
		{
			a[i] = a[i + count];
		}
		int j;
		for (j = 0; j < count; j++)
		{
			a[i + j] = '\0';
		}
	}

//??????



	public static int addWorker(int[] a, int na, int[] b, int nb, int[] c)
	{



		//???????????
		int nc = na + 1;
		int l = nc;

		//????
		na--;
		nb--;
		nc--;

		//????
		while (nb >= 0)
		{
			//????
			int carry = 0;
			if (a[na] + b[nb] > 9)
			{
				carry = 1;
			}
			c[nc] += (a[na] + b[nb]) % 10;
			if (c[nc] == 10)
			{
				int i = nc;
				while (c[i] == 10)
				{
					c[i] = 0;
					c[i - 1] += 1;
					i--;
				}
			}
			c[nc - 1] += carry;
			// ????? 999999 + 1????
			if (c[nc - 1] == 10)
			{
				int i = nc;
				while (c[i - 1] == 10)
				{
					c[i - 1] = 0;
					c[i - 2] += 1;
					i--;
				}
			}
			//cout << c[nc]<<endl;
			nb--;
			na--;
			nc--;
		}
		//???????????????????
		while (na >= 0)
		{
			c[nc] += a[na];
			//?????? 9999 + 1
			if (c[nc] == 10)
			{
				int i = nc;
				while (c[i] == 10)
				{
					c[i] = 0;
					c[i - 1] += 1;
					i--;
				}
			}
		  //  cout << c[nc]<<endl;
			na--;
			nc--;

		}
		//c[nc]?????????????????-1
		if (c[nc] == 0)
		{
			return l - 1;
		}
		return l;
	}

	//???????c????????
	public static int add(String a, String b, int[] c)
	{
		int na = 0;
		int nb = 0;
		int[] _a = new int[MAXNUM];
		int[] _b = new int[MAXNUM];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(_a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(_b, 0, (Integer.SIZE / Byte.SIZE));
		//????
		while (a[na].equals('0'))
		{
			na++;
		}
		while (!a[na].equals('\0'))
		{
			_a[na] = (int)(a[na] - '0');
			na++;
		}
		while (!b[nb].equals('\0'))
		{
			_b[nb] = (int)(b[nb] - '0');
			nb++;
		}

		//????????????
		if (na > nb)
		{

			return (addWorker(_a, na, _b, nb, c));
		}
		else
		{
			return addWorker(_b, nb, _a, na, c);
		}

	}

	public static void Main(String[] args)
	{
		String a = new String(new char[MAXNUM]);
		String b = new String(new char[MAXNUM]);
		int[] c = new int[MAXNUM];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

		delZero(a);
		delZero(b);

		//?n??????
		int n = add(a, b, c);

		int i = 0;
		//???0??
		while (c[i] == 0)
		{
			i++;
		}
		while (i >= MAXNUM)
		{
			System.out.print(0);
		}
		int j;
		for (j = 0; j < n; j++)
		{
			System.out.print(c[i + j]);
		}
	 //   cout << endl << n;


	}

}

