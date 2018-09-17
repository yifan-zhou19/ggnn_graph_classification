public class person
{
	public String s = new String(new char[6]);
	public float h;
}

package <missing>;

public class GlobalMembers
{
	public static person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(50);
	public static int Main()
	{
		int i;
		int j;
		int n;
		int man;
		int woman;
		float[] m = new float[50];
		float[] w = new float[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i].s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i].h = Float.parseFloat(tempVar3);
		}
		}
		man = 0;
		woman = 0;
		for (i = 0;i < n;i++)
		{
		if (p[i].s.charAt(0) == 'm')
		{
			m[man] = p[i].h;
			man++;
		}
		else
		{
			w[woman] = p[i].h;
			woman++;
		}
		}
		for (j = man - 1;j >= 0;j--)
		{
		for (i = 0;i < j;i++)
		{
		if (m[i] > m[i + 1])
		{
			m[i] = m[i] + m[i + 1];
			m[i + 1] = m[i] - m[i + 1];
			m[i] = m[i] - m[i + 1];
		}
		}
		}
		for (i = 0;i < man;i++)
		{
		System.out.printf("%.2f ",m[i]);
		}
		for (j = woman - 1;j >= 0;j--)
		{
		for (i = 0;i < j;i++)
		{
		if (w[i] < w[i + 1])
		{
			w[i] = w[i] + w[i + 1];
			w[i + 1] = w[i] - w[i + 1];
			w[i] = w[i] - w[i + 1];
		}
		}
		}
		for (i = 0;i < woman;i++)
		{
		if (i != woman - 1)
		{
		System.out.printf("%.2f ",w[i]);
		}
		else
		{
		System.out.printf("%.2f",w[i]);
		}
		}
	}

}

