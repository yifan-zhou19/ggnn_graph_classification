double getArea = double;
double getcos = double;
int main()
{
	double a;
	double b;
	double c;
	double d;
	double i;
	double j;
	double S;
	double s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		b = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		c = Double.parseDouble(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		d = Double.parseDouble(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead("\n");
	if (tempVar5 != null)
	{
		i = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	j = i * PI / 360;
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(j) * Math.cos(j));
	if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(i) * Math.cos(j) > 0.getValue() != 0)
	{
		System.out.printf("%.4lf\n",S);
	}
	else
	{
		System.out.print("Invalid input");
	}
	return 0;
}

