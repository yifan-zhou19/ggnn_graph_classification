double area = new double(double, double, double, double, double);
int main()
{
	double a;
	double b;
	double c;
	double d;
	double an;
	double s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Double.parseDouble(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		an = Double.parseDouble(tempVar5);
	}
	s = area(a, b, c, d, an);
	if (s < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		System.out.printf("%.4f", s);
	}
	return 0;
}

double area(double q, double w, double e, double r, double ty)
{
	double ang;
	double ss;
	double k;
	double t;
	ang = (ty / 2) / 180 * PI;
	t = (q + w + e + r) / 2;
	ss = (t - q) * (t - w) * (t - e) * (t - r) - q * w * e * r * Math.cos(ang) * Math.cos(ang);
	/*printf ("%f ", q);*/
	if (ss < 0)
	{
		return -1;
	}
	else
	{
		k = Math.sqrt(ss);
		return k;
	}
}

