public class people
{
	public String a = new String(new char[10]);
	public float h;
}

package <missing>;

public class GlobalMembers
{
	public static int com1(Object x, Object y)
	{
		return *(int)x - (int)y;
	}
	public static int com2(Object x, Object y)
	{
		return *(int)y - (int)x;
	}
	public static int Main()
	{
		people[] p = tangible.Arrays.initializeWithDefaultpeopleInstances(40);
		int n;
		int i;
		int j;
		int k;
		float[] m = new float[40];
		float[] f = new float[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].h = Float.parseFloat(tempVar3);
			}
			if (p[i].a.charAt(0) == 'm')
			{
				m[j] = p[i].h;
				j = j + 1;
			}
			else
			{
				f[k] = p[i].h;
				k = k + 1;
			}
		}
		qsort(m,j,(Float.SIZE / Byte.SIZE),com1);
		qsort(f,k,(Float.SIZE / Byte.SIZE),com2);
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2f ",f[i]);
		}
		System.out.printf("%.2f",f[k - 1]);
		return 0;
	}

}

