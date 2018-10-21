package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (x = 1;x <= k;x++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *head;
			double head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (double)(calloc(n,8));
			head = p;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				p++;
			}
			p = head;
			double sum_a = 0.0;
			double sum_s = 0.0;
			double a;
			double s;
			for (i = 0;i < n;i++)
			{
				sum_a += *p;
				p++;
			}
			a = sum_a / (n * 1.0);
			p = head;
			for (i = 0;i < n;i++)
			{
				sum_s += (*p - a) * (*p - a);
				p++;
			}
			s = Math.sqrt(sum_s / (n * 1.0));
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

