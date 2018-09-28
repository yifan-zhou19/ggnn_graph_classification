package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
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

		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int[] numa = new int[260];
		int[] numb = new int[260];
		int[] c = new int[260];

		int i;
		int j;
		int lena;
		int lenb;
		lena = a.length();
		lenb = b.length();

		int k = 0;
		for (i = lena - 1;i >= 0;i--)
		{
			for (j = 0;j < 10;j++)
			{
				if (a.charAt(i) == num[j])
				{
					numa[k] = j; //???a(12345)?????(54321)
				}
			}
			k++;
		}
		k = 0; //???!!
		for (i = lenb - 1;i >= 0;i--)
		{
			for (j = 0;j < 10;j++)
			{
				if (b.charAt(i) == num[j])
				{
					numb[k] = j; //???b(1234567)?????(7654321)
				}
			}
			k++;
		}
		for (i = 0;i < max(lena, lenb);i++)
		{
			if (c[i] + numa[i] + numb[i] < 10)
			{
				c[i] = numa[i] + numb[i] + c[i]; //??????,??c
			}
			else
			{
				c[i] = numa[i] + numb[i] + c[i] - 10;
				c[i + 1] = c[i + 1] + 1; //?10?1
			}
		}
		int M;
		for (i = max(lena, lenb);i >= 0;i--)
		{
			if (c[i] != 0)
			{
				M = i;
				break;
			}
		}
		for (i = M;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

