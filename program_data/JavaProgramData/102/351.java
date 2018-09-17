package <missing>;

public class GlobalMembers
{
	public static int com1(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		float p2;
		int x = 0;
		p1 = (float)e1;
		p2 = (float)e2;
		if (p1 > (p2))
		{
			x = 1;
		}
		if (p1 < p2)
		{
			x = -1;
		}
		return x;
	}
	public static int com2(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		float p2;
		int x = 0;
		p1 = (float)e1;
		p2 = (float)e2;
		if (p1 > (p2))
		{
			x = -1;
		}
		if (p1 < p2)
		{
			x = 1;
		}
		return x;
	}
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int n;
		float[] a;
		float[] b;
		String c = new String(new char[10]);
		float d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new float[n];
		b = new float[n];
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 c = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 d = Float.parseFloat(tempVar3);
			 }
			 if (c.length() == 4)
			 {
				 a[j] = d;
				 j++;
			 }
			 else
			 {
				 b[k] = d;
				 k++;
			 }
		}
		for (i = j;i < n;i++)
		{
			a[i] = 6F;
		}
		for (i = k;i < n;i++)
		{
			b[i] = 0F;
		}
		qsort(a,n,(Float.SIZE / Byte.SIZE),com1);
		qsort(b,n,(Float.SIZE / Byte.SIZE),com2);
		System.out.printf("%.2f",a[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2f",a[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2f",b[i]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

