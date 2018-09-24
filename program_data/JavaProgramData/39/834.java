package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct xuesheng
	//{
	//	char x[21];
	// int qimo;
	// int banji;
	// char ganbu;
	// char xibu;
	// int lunwen;
	// int qian;
	//};
	 xuesheng[] x = tangible.Arrays.initializeWithDefaultxueshengInstances(101);
	 xuesheng p;
	 int i;
	 int n;
	 int max = 0;
	 int total = 0;
	 int money;
	 String name = new String(new char[21]);
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
			 x[i].x = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 x[i].qimo = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 x[i].banji = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 x[i].ganbu = tempVar5;
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 x[i].xibu = tempVar6;
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 x[i].lunwen = tempVar7;
		 }
	  x[i].qian = 0;
	  if (x[i].qimo > 80 && x[i].lunwen != 0)
	  {
		  x[i].qian += 8000;
	  }
	  if (x[i].qimo > 85 && x[i].banji > 80)
	  {
		  x[i].qian += 4000;
	  }
	  if (x[i].qimo > 90)
	  {
		  x[i].qian += 2000;
	  }
	  if (x[i].qimo > 85 && x[i].xibu == 'Y')
	  {
		  x[i].qian += 1000;
	  }
	  if (x[i].banji > 80 && x[i].ganbu == 'Y')
	  {
		  x[i].qian += 850;
	  }
	  total = total + x[i].qian;
	 }

	 for (i = 0;i < n;i++)
	 {
		 if (max < x[i].qian)
		 {
			 name = x[i].x;
			 max = x[i].qian;
		 }
	 }
	 System.out.printf("%s\n%d\n%d",name,max,total);
	}
}

