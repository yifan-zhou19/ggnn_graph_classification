package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int i;
		int b;
		int s;
		int[] p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		int m;
		p = new int[100000];
		s = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			p[i] = a;
		}
		q = p;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}


		for (i = 0;i < n;)
		{
			if (q == b)
			{
				for (m = q;m < q + n - i;m++)
				{
					m = *(m + 1);
				}
				s = s + 1;

			}
			else
			{
				i++;
			q++;
			}
		}
	   q = p;
	   System.out.printf("%d", q);
	   q++;
	   for (i = 1;i < n - s;i++,q++)
	   {
		   System.out.printf(" %d", q);
	   }

	}

}

