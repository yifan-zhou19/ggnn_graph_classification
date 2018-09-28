package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct stu
	//  {
	//	char name[25];
	//	int score;
	//	int pinyi;
	//	char ganbu;
	//	char xibu;
	//	int lunwen;
	//  }
	//  stu[110];
	  int n;
	  int i;
	  int m;
	  String str = new String(new char[25]);
	  m = 0;
	  int[] a = new int[110];
	  int total;
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
		   stu[i].name = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   stu[i].score = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   stu[i].pinyi = tempVar4;
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   stu[i].ganbu = tempVar5;
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   stu[i].xibu = tempVar6;
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   stu[i].lunwen = tempVar7;
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
		  a[i] = 0;
		if (stu[i].score > 80 && stu[i].lunwen >= 1)
		{
			a[i] += 8000;
		}

		if (stu[i].score > 85 && stu[i].pinyi > 80)
		{
			a[i] += 4000;
		}

		if (stu[i].score > 90)
		{
			a[i] += 2000;
		}

		if (stu[i].score > 85 && stu[i].xibu == 'Y')
		{
			a[i] += 1000;
		}

		if (stu[i].pinyi > 80 && stu[i].ganbu == 'Y')
		{
			a[i] += 850;
		}

	  }
		for (i = 0;i < n;i++)
		{
		   if (a[i] > m)
		   {
			   str = stu[i].name;
			   m = a[i];
		   }
		}
		System.out.printf("%s\n%d\n",str,m);
		total = 0;
		for (i = 0;i < n;i++)
		{
			total += a[i];
		}
		System.out.printf("%d\n",total);

	}

}

