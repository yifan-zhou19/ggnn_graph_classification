package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int b;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		e = a.length();
		int[] i = new int[e];
		int[] c = new int[e];
		for (g = 0;g < e;g++)
		{
		c[g] = 0;
		}
		for (g = 0;g < e;g++)
		{
		i[g] = a.charAt(g) - '0';
		}
		if (e == 1)
		{
		System.out.printf("%d\n%d",0,i[0]);
		}
		else if (e == 2)
		{
		System.out.printf("%d\n%d",(i[0] * 10 + i[1]) / 13,(i[0] * 10 + i[1]) % 13);
		}
		else
		{
		for (b = 0,d = 0;b < e;b++)
		{
						if (d * 10 + i[b] >= 13)
						{
						c[b] = (d * 10 + i[b]) / 13;
						d = (d * 10 + i[b]) % 13;
						}
						else
						{
						if (b < e-1)
						{
						c[b + 1] = (d * 100 + i[b] * 10 + i[b + 1]) / 13;
						d = (d * 100 + i[b] * 10 + i[b + 1]) % 13;
						b++;
						}
						else
						{
						d = d * 10 + i[b];
						b++;
						}
						}
		}
		if (c[1] != 0)
		{
		System.out.printf("%d",c[1]);
		}
		for (f = 2;f < e;f++)
		{
		System.out.printf("%d",c[f]);
		}
		System.out.printf("\n%d",d);
		}
	}
}

