package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct h
	//   {
	//  int mun;
	//  int chinese;
	//  int math;
	//  struct h *p;
	//   };
	h a;
	h b;
	h lily;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = len;
	lily = a;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a.mun = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a.chinese = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a.math = tempVar4;
		}
	   b = len;
	   a.p = b;
	   a = b;
	}
	b = null;
	a = lily;
	int a1 = 0;
	int a2 = 0;
	int a3 = 0;
	int b1 = 0;
	int b2 = 0;
	int b3 = 0;
	int c;
	for (i = 0;i < n;i++)
	{
		c = (a.chinese + a.math);
		if (c > a1)
		{
			b3 = b2;
			b2 = b1;
			b1 = a.mun;
			a3 = a2;
			a2 = a1;
			a1 = c;
		}
		else if (c > a2)
		{
			b3 = b2;
			b2 = a.mun;
			a3 = a2;
			a2 = c;
		}
		else if (c > a3)
		{
			b3 = a.mun;
			a3 = c;
		}
		a = a.p;
	}
	System.out.printf("%d %d\n",b1,a1);
	System.out.printf("%d %d\n",b2,a2);
	System.out.printf("%d %d\n",b3,a3);
	}
}

