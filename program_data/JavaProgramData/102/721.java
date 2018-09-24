package <missing>;

public class GlobalMembers
{
	public static float height;
	public static float[] p1 = new float[nMax];
	public static float[] p2 = new float[nMax];
	public static String ss = new String(new char[10]);
	public static int cmp(Object a, Object b)
	{
		return *(float)a - (float)b;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int u = 0;
		int v = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Float.parseFloat(tempVar3);
			}
			if (strcmp(ss,"male") == 0)
			{
				p1[u] = height;
				u++;
			}
			else if (strcmp(ss,"female") == 0)
			{
				p2[v] = height;
				v++;
			}
		}
		sort(p1,p1 + u);
		sort(p2,p2 + v);
		for (i = 0;i < u;i++)
		{
			System.out.printf("%.2f ",p1[i]);
		}
		for (i = v - 1;i >= 0;i--)
		{
			System.out.printf("%.2f",p2[i]);
			if (i != 0)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
			return 0;
	}

}

