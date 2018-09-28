package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[10000];
		int i;
		int k;
		int a;
		int b;
		int n;
		int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		p = c;
		q = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (k = 0;k < n;k++)
	{
		p = c;
		q = p;
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}

			for (i = 0;i < a * b;i++)
			{

			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  *p = Integer.parseInt(tempVar4);
			  }
			  p++;
			}
		p = q;
		for (i = 0;i < a;i++)
		{
			s = s + *p;
			p++;
		}
		p = q;
		for (i = 0;i < b - 2;i++)
		{
			p = p + a;
			s = s + *p;

		}
		p = q + a - 1;
		for (i = 0;i < b - 2;i++)
		{
			p = p + a;
			s = s + *p;


		}
		if (b != 1)
		{
		p = q + a * (b - 1);
		for (i = 0;i < a;i++)
		{

			s = s + *p;
			p = p + 1;

		}
		}
		System.out.printf("%d\n",s);


	}


	}
}

