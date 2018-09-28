package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int shu;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shu = Integer.parseInt(tempVar);
		}
		if (11 <= shu != 0 && shu <= 99)
		{
			a = (int)shu / 10;
			b = shu - 10 * a;
			System.out.printf("%d",10 * b + a);
		}
		if (shu >= 111 && shu <= 999)
		{
			c = (int)(shu / 100);
			d = (int)((shu - 100 * c) / 10);
			e = shu - 100 * c - 10 * d;
			System.out.printf("%d",100 * e+10 * d + c);
		}
		if (shu >= 1111 && shu <= 9999)
		{
			f = (int)shu / 1000;
			g = (int)(shu - f * 1000) / 100;
			h = (int)(shu - f * 1000 - g * 100) / 10;
			i = shu - f * 1000 - g * 100 - h * 10;
			System.out.printf("%d",1000 * i + 100 * h + 10 * g + f);
		}
		if (shu >= 11111 && shu <= 99999)
		{
			j = (int)shu / 10000;
			k = (int)(shu - j * 10000) / 1000;
			l = (int)(shu - j * 10000 - k * 1000) / 100;
			m = (int)(shu - j * 10000 - k * 1000 - l * 100) / 10;
			n = (int)(shu - j * 10000 - k * 1000 - l * 100 - m * 10);
			System.out.printf("%d",n * 10000 + m * 1000 + l * 100 + k * 10 + j);
		}

	}


}

