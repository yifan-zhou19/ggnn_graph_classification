package <missing>;

public class GlobalMembers
{
	/*
	 *???: bigAdd.cpp
	 *??: ???
	 *????: 2012-11-21
	 *??: ?????
	 */



	public static void conv(int[] a, String str) //????str?????????a
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE) * MAXN); //?a??
		int l = str.length(); //????
		for (int i = l - 1;i >= 0;--i)
		{
			a[l - 1 - i] = str[i] - '0'; //????????a????
		}
	}

	public static void BigNumAdd(int[] a, int[] b, int[] c) //?????a,b?????c
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE) * MAXN); //c??
		for (int i = 0;i < MAXN;i++)
		{
			c[i] += a[i] + b[i];
			if (c[i] >= 10)
			{ //???
				c[i + 1]++; //??
				c[i] -= 10;
			}
		}
	}

	public static void printBigNum(int[] a) //???????
	{
		int i;
		for (i = MAXN - 1;a[i] == 0 && i >= 0;--i) //?a??0????
		{
			;
		}
		if (i == -1)
		{ //???0
			System.out.print(0);
			System.out.print("\n");
			return;
		}
		for (;i >= 0;--i)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int[] a = new int[MAXN];
		int[] b = new int[MAXN];
		int[] c = new int[MAXN];
		String str = new String(new char[MAXN]); //????????

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		conv(a, str); //?????????a
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		conv(b, str);
		BigNumAdd(a, b, c); //c=a+b
		printBigNum(c);
		return 0;
	}


}

