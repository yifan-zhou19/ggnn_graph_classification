package <missing>;

public class GlobalMembers
{
	public static int compare1(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int compare2(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		float[] a = new float[41];
		float[] b = new float[41];
		for (int i = 0;i < 41;i++)
		{
			a[i] = -1F;
			b[i] = -1F;
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int aa = 0;
		int bb = 0;
		for (int i = 0;i < n;i++)
		{
			String temp = new String(new char[10]);
			temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
			float height;
			height = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (temp.charAt(0) == 'm')
			{
				a[aa] = height;
				aa++;
			}
			else
			{
				b[bb] = height;
				bb++;
			}
		}
		qsort(a,aa,(Integer.SIZE / Byte.SIZE),compare1);
		qsort(b,bb,(Integer.SIZE / Byte.SIZE),compare2);
		for (int i = 0;i < aa;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (int i = 0;i < bb;i++)
		{
			if (i == bb - 1)
			{
				System.out.printf("%.2f",b[i]);
			}
			else
			{
				System.out.printf("%.2f ",b[i]);
			}
		}
	return 0;
	}

}

