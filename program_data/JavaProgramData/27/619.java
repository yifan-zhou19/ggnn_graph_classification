package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	float a;
	float b;
	float c;
	float delta;
	float e;
	float x1;
	float x2;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0;i < n;i++)
	{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		e = (b == 0F)?0:-b / (2 * a);
	delta = (b * b - 4 * a * c) / (2 * a);
	if (delta > 0F)
	{
		x1 = e + Math.sqrt(b * b - 4 * a * c) / (2 * a);
	x2 = e - Math.sqrt(b * b - 4 * a * c) / (2 * a);
	System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	}
	else if (delta == 0F)
	{
	System.out.printf("x1=x2=%.5f\n",e);
	}
	else
	{
	x2 = Math.sqrt((-1) * (b * b - 4 * a * c)) / (2 * a);
	if (e == -0F)
	{
		e = 0F;
	}
	System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,x2,e,x2);
	}
	}
	return 0;
	}
}

