package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int o;
	float a = 1F;
	float b = 1F;
	float c = 0F;
	float d = 1F;
	float p;
	float s = 0F;
	float e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			o = Integer.parseInt(tempVar2);
		}
		s = 0F;
		a = 1F;
		b = 1F;
		c = 0F;
		d = 1F;
	for (i = 0;i < o;i++)
	{
	p = (a + b) / (c + d);
	s = s + p;
	e = a;
	a = b;
	b = e + a;
	e = c;
	c = d;
	d = e + c;
	}
	System.out.printf("%.3f\n",s);
	}


	return 0;
	}
}

