package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int f;
	int[] a = new int[10];
	float[] b = new float[10];
	float s = 0F;
	float t = 0F;
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
	};
	System.out.print("\n");
	for (j = 0;j < n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		f = Integer.parseInt(tempVar3);
	}
	if (f > 89)
	{
		b[j] = 4.0F;
	}
	else if (f > 84)
	{
		b[j] = 3.7F;
	}
	else if (f > 81)
	{
		b[j] = 3.3F;
	}
	else if (f > 77)
	{
		b[j] = 3.0F;
	}
	else if (f > 74)
	{
		b[j] = 2.7F;
	}
	else if (f > 71)
	{
		b[j] = 2.3F;
	}
	else if (f > 67)
	{
		b[j] = 2.0F;
	}
	else if (f > 63)
	{
		b[j] = 1.5F;
	}
	else if (f > 59)
	{
		b[j] = 1.0F;
	}
	else
	{
		b[j] = 0F;
	}
	};
	for (i = 0;i < n;i++)
	{
		s = s + a[i] * b[i];
	t = t + a[i];
	}
	s = s / t;

	System.out.printf("%.2f",s);





	}
}

