package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] d = new double[100];
		double[] e = new double[100];
		double[] f = new double[100];
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * aa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * bb;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * cc;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * dd;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * ee;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * ff;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		aa = a,bb = b,cc = c;
		for (i = 0;i < n;aa++,bb++,cc++,i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			aa = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			bb = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			cc = Double.parseDouble(tempVar4);
		}
		}
		aa = a,bb = b,cc = c,dd = d,ee = e,ff = f;
		for (i = 0;i < n;aa++,bb++,cc++,dd++,ee++,ff++,i++)
		{

			(*dd) = (*bb) * (*bb) - 4 * (*aa) * (*cc);
			if ((*dd) > 0)
			{
				(*ee) = ((-(*bb)) + Math.sqrt(*dd)) / (2 * (*aa));
				(*ff) = ((-(*bb)) - Math.sqrt(*dd)) / (2 * (*aa));
				System.out.printf("x1=%.5lf;x2=%.5lf\n",*ee,*ff);
			}
			else if ((*dd) == 0)
			{
				(*ee) = 0 - (*bb) / (2 * (*aa));
				System.out.printf("x1=x2=%.5lf\n",*ee);
			}

			else if ((*dd) < 0)
			{
				(*ee) = ((*bb) / (2 * (*aa)));
			   (*ff) = (Math.sqrt(0 - (*dd))) / (2 * (*aa));
			   System.out.printf("x1=-%.5lf+%.5lfi;x2=-%.5lf-%.5lfi\n",*ee,*ff,*ee,*ff);
			}
		}
	}



}

