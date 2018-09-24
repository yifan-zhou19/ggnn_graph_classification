//??
public class data
{
	public String ch = new String(new char[10]);
	public double h;
}

package <missing>;

public class GlobalMembers
{
	public static data[] p = tangible.Arrays.initializeWithDefaultdataInstances(40);
	public static data[] f = tangible.Arrays.initializeWithDefaultdataInstances(40);
	public static data[] m = tangible.Arrays.initializeWithDefaultdataInstances(40);
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i].ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p[i].h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			len = String.valueOf(p[i].ch).length();
			if (len == 4)
			{
				m[j++].h = p[i].h;
			}
			else
			{
				f[k++].h = p[i].h;
			}
		}
		for (i = j - 1; i > 0; i--)
		{
			for (int x = 0; x < i; x++)
			{
				if (m[x].h > m[x + 1].h)
				{
					double temp = m[x].h;
					m[x].h = m[x + 1].h;
					m[x + 1].h = temp;
				}
			}
		}
		for (i = k - 1; i > 0; i--)
		{
			for (int x = 0; x < i; x++)
			{
				if (f[x].h < f[x + 1].h)
				{
					double temp = f[x].h;
					f[x].h = f[x + 1].h;
					f[x + 1].h = temp;
				}
			}
		}
		for (i = 0; i < j;i++)
		{
			System.out.printf("%.2f", m[i].h);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", f[0].h);
		for (i = 1; i < k; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", f[i].h);
		}
		return 0;
	}













}

