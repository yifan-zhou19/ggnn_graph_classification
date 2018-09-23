package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int h;
		double[] a = new double[40];
		double[] b = new double[40];
		double[] c = new double[40];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char sex[7];
	//		double height;
	//	}
	//	p[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].height = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(p[i].sex,"male") == 0)
			{
				a[j] = p[i].height;
				j++;

			}
			else
			{
				b[k] = p[i].height;
				k++;


			}
		}
		double t = 0;
		for (h = 0;h < j;h++)
		{
		for (i = 0;i < j - 1;i++)
		{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
		}
		}
		for (h = 0;h < k;h++)
		{
			for (i = 0;i < k - 1;i++)
			{
			if (b[i] < b[i + 1])
			{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
			}
			}
		}
		for (i = 0;i < j;i++)
		{
			c[i] = a[i];
		}
		for (i = j;i < n;i++)
		{
			c[i] = b[i - j];
		}
		System.out.printf("%.2lf",c[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %.2lf",c[i]);
		}
		return 0;
	}




}

