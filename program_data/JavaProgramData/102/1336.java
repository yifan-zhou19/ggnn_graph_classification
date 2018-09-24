package <missing>;

public class GlobalMembers
{
	public static int cmp(Object x, Object y)
	{
		return *(int)x - (int)y;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int j;
		int k;
		int a = 0;
		int b = 0;
		String sex = new String(new char[10]);
		float[] man = new float[40];
		float[] woman = new float[40];
		float h;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (sex.charAt(0) == 'm')
			{
				man[a] = h;
				a++;
			}
			else
			{
				woman[b] = h;
				b++;
			}
			i++;
		}
		qsort(man,a,(Float.SIZE / Byte.SIZE),cmp);
		qsort(woman,b,(Float.SIZE / Byte.SIZE),cmp);
		System.out.printf("%.2f",man[0]);
		for (k = 1;k < a;k++)
		{
			System.out.printf(" %.2f",man[k]);
		}
		for (k = b - 1;k > 0;k--)
		{
			System.out.printf(" %.2f",woman[k]);
		}
		System.out.printf(" %.2f\n",woman[0]);
	}
}

