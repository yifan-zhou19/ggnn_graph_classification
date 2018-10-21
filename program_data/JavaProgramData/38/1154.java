package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cases;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		while (cases-- != 0)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (float)calloc(n,(Float.SIZE / Byte.SIZE));
			int i;
			double j;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p++ = Double.parseDouble(tempVar3);
				}
			}
			p = p - n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * f;
			 f = p;
			double sum = 0;
			for (i = 0;i < n;i++,f++)
			{
				sum = sum + (*f);
			}
			 double x = sum / n;
			 double x1 = 0;
			 f = p;
			 for (i = 0;i < n;i++,f++)
			 {
				 x1 = x1 + (*f - x) * (*f - x);
			 }
			 double x2;
			 x2 = Math.sqrt(x1 / n);
			 System.out.printf("%.5f\n",x2);



		}


	}
}

