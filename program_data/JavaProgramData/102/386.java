package <missing>;

public class GlobalMembers
{
	public static int pfCompare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return (p2 - p1);
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int mi = 0;
		int fi = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[7]);
		float c;
		float[] m = new float[40];
		float[] f = new float[40];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Float.parseFloat(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				m[mi] = c;
				mi++;
			}
			else
			{
				f[fi] = c;
				fi++;
			}
		}
	//
		qsort(m,mi,(Integer.SIZE / Byte.SIZE),pfCompare); //for(i=0;i<mi;i++) printf ("%.2f ",m[i]);
		qsort(f,fi,(Integer.SIZE / Byte.SIZE),pfCompare);
		for (i = mi;i > 0;i--)
		{
		System.out.printf("%.2f ",m[i - 1]);
		}
		for (i = 0;i < fi;i++)
		{
			if (i == (fi - 1))
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

