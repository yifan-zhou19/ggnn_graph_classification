package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double sita;
	double s;
	double tmp;
	a = b = c = d = sita = s = tmp = 0;
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
		sita = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	sita = sita * PI / 360;
	sita = Math.cos(sita);
	tmp = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * sita * sita;
	if (tmp < 0)
	{
	System.out.print("Invalid input\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto eof;
	}
	tmp = Math.sqrt(tmp);
	System.out.printf("%.4f",tmp);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	eof:
	;
	}
}

