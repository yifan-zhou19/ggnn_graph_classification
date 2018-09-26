package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[15000];
		int[] l = new int[15000];
		int[] x = new int[50000];
		String a = new String(new char[30000]);
		String b = new String(new char[30000]);
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
		int along;
		int blong;
		int i = 0;
		int u = 0;
		int v = 0;
		int max = 0;
		int[] num = new int[30000];
		along = a.length();
		blong = b.length();
		while (u <= along - 1)
		{
			for (v = u; (a.charAt(v) != ',') && (a.charAt(v) != '\0'); v++)
			{
				num[i] = a.charAt(v) - '0';
				u++;
				f[i] = f[i] * 10 + num[i];
			}
			i = i + 1;
			u = u + 1;
		}
		u = 0;
		v = 0;
		i = 0;
		while (u <= blong - 1)
		{
			for (v = u; (b.charAt(v) != ',') && (b.charAt(v) != '\0'); v++)
			{
				num[i] = b.charAt(v) - '0';
				u++;
				l[i] = l[i] * 10 + num[i];
			}
			u++;
			i++;
		}
		int vmax = 0;
		for (u = 0; u <= i - 1; u++)
		{
			for (v = f[u]; v < l[u]; v++)
			{
				x[v] = x[v] + 1;
				if (vmax <= v)
				{
					vmax = v;
				}
			}
		}
		for (u = 0; u <= vmax + 1; u++)
		{
			if (max <= x[u])
			{
				max = x[u];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

