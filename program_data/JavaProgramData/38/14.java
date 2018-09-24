package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int e;
		int[] num = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		double[] a = new double[100];
		double[] s = new double[100];
		double m;
		double t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * ps;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = num,ps = s;q < num + n;q++,ps++)
		{
			m = 0;
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q = Integer.parseInt(tempVar2);
			}
			for (p = a;p < a + *q;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				m = m + *p;
			}
			m = m / (*q);
			for (p = a;p < a + *q;p++)
			{
				t = t + Math.pow((*p - m),2);
			}
			t = t / (*q);
			*ps = Math.sqrt(t);
		}
		for (ps = s;ps < s + n;ps++)
		{
			System.out.printf("%.5lf\n",*ps);
		}
	}
}

