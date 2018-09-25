package <missing>;

public class GlobalMembers
{
	public static int Compare1(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		 p2 = (int)elem2;
		return (p1) - p2;
	}
	public static int Compare2(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		 p2 = (int)elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int p;
	int q;
	p = q = 0;
	float[] m = new float[n];
	float[] f = new float[n];
	for (i = 0;i < n;i++)
	{
	String sex = new String(new char[7]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sex = tempVar2.charAt(0);
	}
	if (sex.charAt(0) == 'm')
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m[p] = Float.parseFloat(tempVar3);
	}
	p++;
	}
	if (sex.charAt(0) == 'f')
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		f[q] = Float.parseFloat(tempVar4);
	}
	q++;
	}
	}
	qsort(m,p,(Float.SIZE / Byte.SIZE),Compare1);
	for (i = 0;i < p;i++)
	{
	System.out.printf("%.2f ",m[i]);
	}
	qsort(f,q,(Float.SIZE / Byte.SIZE),Compare2);
	for (i = 0;i < q;i++)
	{
		if (i == q - 1)
		{
	System.out.printf("%.2f",f[i]);
		}
	else
	{
	System.out.printf("%.2f ",f[i]);
	}
	}
	}

}

