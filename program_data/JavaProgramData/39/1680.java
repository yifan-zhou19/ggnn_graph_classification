package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int a;
	//		int b;
	//		char c[2];
	//		char d[2];
	//		int e;
	//		int m;
	//	};
		stu p;
		int n;
		int i;
		int max = 0;
		int t;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (stu)malloc(n * sizeof(stu));
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(p + i).name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(p + i).a = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(p + i).b = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			(p + i).c = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			(p + i).d = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			(p + i).e = tempVar7;
		}
		}
		for (i = 0;i < n;i++)
		{
		(p + i).m = 0;
		}
		for (i = 0;i < n;i++)
		{
		  if ((((p + i).a) > 80) && (((p + i).e) > 0))
		  {
			(p + i).m += 8000;
		  }
		  if ((((p + i).a) > 85) && (((p + i).b) > 80))
		  {
			(p + i).m += 4000;
		  }
		  if (((p + i).a) > 90)
		  {
			 (p + i).m += 2000;
		  }
		  if ((((p + i).a) > 85) && (((p + i).d[0]) == 'A' + 24))
		  {
			(p + i).m += 1000;
		  }
		  if ((((p + i).b) > 80) && (((p + i).c[0]) == 'A' + 24))
		  {
			(p + i).m += 850;
		  }
		}

	  for (i = 0;i < n;i++)
	  {

	   if (((p + i).m) > max)
	   {
		  max = (p + i).m;
		  t = i;
	   }
	  }

	  for (i = 0;i < n;i++)
	  {
		   sum += (p + i).m;
	  }
	  System.out.printf("%s\n",(p + t).name);
	  System.out.printf("%d\n",max);
	  System.out.printf("%d\n",sum);
	  return 0;

	}

}

