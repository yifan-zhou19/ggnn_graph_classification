package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
		if ((float)p1 < (float)p2)
		{
			return -1;
		}
		else if ((float)p1 > (float)p2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void photo(float[] a, float[] b, int n)
	{
		int x = 0;
		int y = 0;
		int i;
		String s = new String(new char[7]);
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			System.in.read();
			if (s.charAt(4) == '\0')
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a + x = Float.parseFloat(tempVar2);
				}
				x++;
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b + y = Float.parseFloat(tempVar3);
				}
				y++;
			}
			System.in.read();
		}
		qsort(a,x,(Float.SIZE / Byte.SIZE),cmp);
		qsort(b,y,(Float.SIZE / Byte.SIZE),cmp);
		for (i = 0;i < x;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = y - 1;i > 0;i--)
		{
			System.out.printf("%.2f ",b[i]);
		}
		System.out.printf("%.2f",b[0]);
	}

	public static int Main()
	{
		float[] a = new float[40];
		float[] b = new float[40];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		photo(a, b, n);
	}
}

