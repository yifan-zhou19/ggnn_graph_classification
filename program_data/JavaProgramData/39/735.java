package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct stu
	//   {
	//	   char nam[20];
	//	   int sco1;
	//	   int sco2;
	//	   char a[2];
	//	   char b[2];
	//	   int num;
	//   }
	//   stu[101];
	   int n;
	   int max;
	   int i;
	   int s;
	   int[] sum = new int[101];
	   String maxn = new String(new char[30]);
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
			   stu[i].nam = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   stu[i].sco1 = tempVar3;
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   stu[i].sco2 = tempVar4;
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   stu[i].a = tempVar5;
		   }
		   String tempVar6 = ConsoleInput.scanfRead();
		   if (tempVar6 != null)
		   {
			   stu[i].b = tempVar6;
		   }
		   String tempVar7 = ConsoleInput.scanfRead();
		   if (tempVar7 != null)
		   {
			   stu[i].num = tempVar7;
		   }
		   sum[i] = 0;
		   if (stu[i].sco1 > 80 && stu[i].num >= 1)
		   {
		   sum[i] = sum[i] + 8000;
		   }
		   if (stu[i].sco1 > 85 && stu[i].sco2 > 80)
		   {
		   sum[i] = sum[i] + 4000;
		   }
		   if (stu[i].sco1 > 90)
		   {
		   sum[i] = sum[i] + 2000;
		   }
		   if (stu[i].sco1 > 85 && stu[i].b[0] == 'Y')
		   {
		   sum[i] = sum[i] + 1000;
		   }
		   if (stu[i].sco2 > 80 && stu[i].a[0] == 'Y')
		   {
		   sum[i] = sum[i] + 850;
		   }
	   }
	  max = sum[0];
	  maxn = stu[0].nam;
		  s = sum[0];
		  for (i = 1;i < n;i++)
		  {
		  if (sum[i] > max)
		  {
			  max = sum[i];
			  maxn = stu[i].nam;
		  }
		  s = s + sum[i];
		  }
	  System.out.printf("%s\n",maxn);
	  System.out.printf("%d\n",max);
	  System.out.printf("%d\n",s);
	}
}

