package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char ID[10];
	//		int m;
	//		int c;
	//
	//	}
	//	tmp;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int n;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  tmp.ID = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  (tmp.m) = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  (tmp.c) = tempVar4;
		  }
		  if ((tmp.m + tmp.c) > max1)
		  {
			max3 = max2;
			max2 = max1;
			max1 = tmp.m + tmp.c;
			a3 = a2;
			a2 = a1;
			a1 = i;
		  }
		else if ((tmp.m + tmp.c) == max1)
		{
			max3 = max2;
			max2 = max1;
			max1 = tmp.m + tmp.c;
			a3 = a2;
			a2 = i;
		}
		else if ((tmp.m + tmp.c) < max1 && (tmp.m + tmp.c)> max2)
		{
			max3 = max2;
			max2 = tmp.m + tmp.c;
			a3 = a2;
			a2 = i;
		}

		else if ((tmp.m + tmp.c) == max2)
		{
			max3 = max2;
			a3 = Integer.parseInt(tmp.ID);
		}
		else if ((tmp.m + tmp.c) < max2 && (tmp.m + tmp.c)> max3)
		{
			max3 = tmp.m + tmp.c;
			a3 = i;
		}
		}

		System.out.printf("%d %d\n",a1,max1);
		System.out.printf("%d %d\n",a2,max2);
		System.out.printf("%d %d\n",a3,max3);

		return 0;
	}


}

