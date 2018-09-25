package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		float a;
		a = (float)elem1 - (float)elem2;
		if (a > 0F)
		{
			return 1;
		}
		else if (a == 0F)
		{
			return 0;
		}
		else
		{
			return -1;
		}

	}

	public static int Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		int c = 0;
		int d = 0;
		int n;
		String ch = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			if (strcmp(ch,"male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[c++] = Float.parseFloat(tempVar3);
				}
			}

			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					b[d++] = Float.parseFloat(tempVar4);
				}
			}
		}

		qsort(a,c,(Float.SIZE / Byte.SIZE),compare);
		qsort(b,d,(Float.SIZE / Byte.SIZE),compare);

		for (i = 0;i < c;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}

		for (i = d - 1;i >= 0;i--)
		{
			if (i != 0)
			{
				System.out.printf("%.2f ",b[i]);
			}
			else
			{
				System.out.printf("%.2f",b[i]);
			}

		}

		System.out.print("\n");

		return 1;

	}
}

