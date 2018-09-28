float m = new float(float,float,float,float,float);
void main()
{
float a;
float b;
float c;
float d;
float an;
float s;
String tempVar = ConsoleInput.scanfRead();
if (tempVar != null)
{
	a = Float.parseFloat(tempVar);
}
String tempVar2 = ConsoleInput.scanfRead();
if (tempVar2 != null)
{
	b = Float.parseFloat(tempVar2);
}
String tempVar3 = ConsoleInput.scanfRead();
if (tempVar3 != null)
{
	c = Float.parseFloat(tempVar3);
}
String tempVar4 = ConsoleInput.scanfRead();
if (tempVar4 != null)
{
	d = Float.parseFloat(tempVar4);
}
String tempVar5 = ConsoleInput.scanfRead();
if (tempVar5 != null)
{
	an = Float.parseFloat(tempVar5);
}
if (m(a,b,c,d,an) < 0)
{
System.out.print("Invalid input\n");
}
else
{
	s = Math.sqrt(m(a,b,c,d,an));
System.out.printf("%.4f\n",s);
}
}


float m(float a,float b,float c,float d,float an)
{
	float s;
	float e;
e = (a + b + c + d) / 2;
s = (e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * Math.pow(Math.cos(an * 3.1415926 / 360),2);
return s;
}


