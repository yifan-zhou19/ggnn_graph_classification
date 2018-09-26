double S = new double(double,double,double,double,double);
int main()
{
	double a;
	double b;
	double c;
	double d;
	double jiaodu;
	double pingjun;
	double hudu;
	double mianji;
	double genhaonei;
	double PI = 3.1415926;
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
		jiaodu = Double.parseDouble(tempVar5);
	}
	hudu = jiaodu * 2 * PI / 360 / 2;
	pingjun = (a + b + c + d) / 2;
	S(a,b,c,d,hudu);
	return 0;
}
double S(double a,double b,double c,double d,double hudu)
{
	double pingjun;
	double mianji;
	double genhaonei;
	 pingjun = (a + b + c + d) / 2;
	 genhaonei = (pingjun - a) * (pingjun - b) * (pingjun - c) * (pingjun - d) - a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
	 if (genhaonei < 0)
	 {
		 System.out.print("Invalid input");
	 }
	 else
	 {
		 mianji = Math.sqrt(genhaonei);
	 System.out.printf("%.4lf",mianji);
	 }
	 return 0;
}


