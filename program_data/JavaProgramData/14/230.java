package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int h;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sb
	//	{
	//		 int ID;
	//		 int m;
	//		 int c;
	//		 int sum;
	//	}
	//	a[n];
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i].ID = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i].m = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i].c = tempVar4;
			 }
			 a[i].sum = a[i].m + a[i].c;
		}
		for (i = 0,b = 0;i < n;i++)
		{
			 if (a[i].sum > b)
			 {
				 b = a[i].sum;
				 h = i;
			 }
		}
		System.out.printf("%d %d\n",a[h].ID,a[h].sum);
		a[h].sum = -1;
		for (i = 0,b = 0;i < n;i++)
		{
			 if (a[i].sum > b)
			 {
				 b = a[i].sum;
				 h = i;
			 }
		}
		System.out.printf("%d %d\n",a[h].ID,a[h].sum);
		a[h].sum = -1;
		for (i = 0,b = 0;i < n;i++)
		{
			 if (a[i].sum > b)
			 {
				 b = a[i].sum;
				 h = i;
			 }
		}
		System.out.printf("%d %d\n",a[h].ID,a[h].sum);
		System.in.read();
		System.in.read();
	}
}

