package <missing>;

public class GlobalMembers
{
	public static float[] male = new float[50];
	public static int nm = 0;
	public static float[] fema = new float[50];
	public static int nf = 0;

	public static int mcmp(Object a, Object b)
	{
		float x = (float)a;
		float y = (float)b;
		if (x > y)
		{
			return 1;
		}
		if (x == y)
		{
			return 0;
		}
		if (x < y)
		{
			return -1;
		}
	}

	public static int fcmp(Object a, Object b)
	{
		return -mcmp(a, b);
	}

	public static void Main()
	{
		String buf = new String(new char[100]);
		String p;
		int n;
		int i;
		float a;

		fgets(buf, (Character.SIZE / Byte.SIZE), stdin);
		n = Integer.parseInt(buf);
		for (;n > 0;n--)
		{
			fgets(buf, (Character.SIZE / Byte.SIZE), stdin);
			p = tangible.StringFunctions.strTok(buf, " ");
			a = Double.parseDouble(tangible.StringFunctions.strTok(null, " "));
			if (strcmp(p,"male") == 0)
			{
				male[nm++] = a;
			}
			else
			{
				fema[nf++] = a;
			}
		}

		qsort(male, nm, (Float.SIZE / Byte.SIZE), mcmp);
		qsort(fema, nf, (Float.SIZE / Byte.SIZE), fcmp);

		for (i = 0;i < nm;i++)
		{
			System.out.printf("%.2f ", male[i]);
		}
		for (i = 0;i < nf - 1;i++)
		{
			System.out.printf("%.2f ", fema[i]);
		}
		System.out.printf("%.2f", fema[i]);

	}
}

