double f = new double(double,double,double,double,double);
void main()
{
	double a;
	double b;
	double c;
	double d;
	double p;
	double m;
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
		p = Double.parseDouble(tempVar5);
	}
	p = p / 360 * 3.1415926;
	m = f(a,b,c,d,p);
	if (m > 0)
	{
		System.out.printf("%.4lf",Math.sqrt(m));
	}
	else
	{
		System.out.print("Invalid input");
	}
}
double f(double a,double b,double c,double d,double p)
{
	double s = (a + b + c + d) / 2;
	return ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(p) * Math.cos(p));
}




