package <missing>;

public class GlobalMembers
{
	public static double Main()
	{
	float d;
	float b;
	float c;
	float f;
	float q = 0F;
	float w = 0F;
	float e = 0F;
	float r = 0F;
	int n;
	int i;
	int[] a = new int[100];
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
			a[i] = Integer.parseInt(tempVar2);
		}

		if (a[i] <= 18)
		{
		q = q + 1;
		}
	else if (a[i] <= 35)
	{
	w = w + 1;
	}
	else if (a[i] <= 60)
	{
	e = e+1;
	}
	else
	{
		r = r + 1;
	}
	}

	b = q * 100 / n;
	c = w * 100 / n;
	d = e * 100 / n;
	f = r * 100 / n;

	System.out.printf("1-18: %.2f",b);
	System.out.print("%%");
	System.out.print("\n");

	System.out.printf("19-35: %.2f",c);
	System.out.print("%%");
	System.out.print("\n");

	System.out.printf("36-60: %.2f",d);
	System.out.print("%%");
	System.out.print("\n");

	System.out.printf("60??: %.2f",f);
	System.out.print("%%");
	System.out.print("\n");
	}

}

