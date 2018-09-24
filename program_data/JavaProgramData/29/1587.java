package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0; //????
		double s = 0; //??
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0; //??
		int k = 0;
		float a = 2F;
		float b = 1F;
		float c = 3F;
		float d = 2F;
		float[] z = new float[100];
		int e = 0;
		z[0] = 2F;
		z[1] = 1.5F;
		int tem1 = 0;
		int tem2 = 0;
		for (e = 2;e < 100;e++)
		{
			z[e] = (a + c) / (b + d);
			tem1 = a + c;
			tem2 = b + d;
			a = c;
			c = tem1;
			b = d;
			d = tem2;
		}
		int n = 0; //???n?
		for (i = 0;i < m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (k = 0;k < n;k++)
			{
				s = s + z[k];
			}
			System.out.printf("%.3f",s);
			System.out.print("\n");
			s = 0;
		}
		return 0;
	}

}

