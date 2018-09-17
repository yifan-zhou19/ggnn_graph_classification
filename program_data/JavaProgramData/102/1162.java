package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x = 0;
		int y = 0;
		String a = new String(new char[10]);
		float[] b = new float[100];
		float[] c = new float[100];
		float[] d = new float[100];
		float t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (a.charAt(0) == 'm')
			{
				c[x] = b[i];
				x++;
			}
			if (a.charAt(0) == 'f')
			{
				d[y] = b[i];
				y++;
			}
		}
		for (i = 0;i < x;i++)
		{
		for (j = x - 1;j > i;j--)
		{
		if (c[j] < c[j - 1])
		{
		t = c[j];
		c[j] = c[j - 1];
		c[j - 1] = t;
		}
		}
		}
		for (i = 0;i < y;i++)
		{
		for (j = y - 1;j > i;j--)
		{
		if (d[j] > d[j - 1])
		{
		t = d[j];
		d[j] = d[j - 1];
		d[j - 1] = t;
		}
		}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%.2lf ",c[i]);
		}
		for (i = 0;i < y - 1;i++)
		{
			System.out.printf("%.2lf ",d[i]);
		}
		System.out.printf("%.2lf",d[y - 1]);
		return 0;
	}







}

