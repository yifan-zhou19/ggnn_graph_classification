package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct stu
	//  {
	//	char name[20];
	//	int a;
	//	int b;
	//	char c[1];
	//	char d[1];
	//	int e;
	//	int m;
	//  }
	//  s[100];
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
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i].name = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  s[i].a = tempVar3;
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  s[i].b = tempVar4;
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  s[i].c = tempVar5;
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  s[i].d = tempVar6;
	  }
	  String tempVar7 = ConsoleInput.scanfRead(" ");
	  if (tempVar7 != null)
	  {
		  s[i].e = tempVar7;
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  s[i].m = 0;
	  }
	  for (i = 0;i < n;i++)
	  {
		if (((s[i].a) > 80) && ((s[i].e) > 0))
		{
		s[i].m += 8000;
		}
		if (((s[i].a) > 85) && ((s[i].b) > 80))
		{
		s[i].m += 4000;
		}
		if ((s[i].a) > 90)
		{
		s[i].m += 2000;
		}
		if (((s[i].a) > 85) && ((s[i].d[0]) == 'A' + 24))
		{
		s[i].m += 1000;
		}
		if (((s[i].b) > 80) && ((s[i].c[0]) == 'A' + 24))
		{
		s[i].m += 850;
		}
	  }
	  for (i = 0;i < n;i++)
	  {
	   if (s[i].m > max)
	   {
		  max = s[i].m;
		  t = i;
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	  sum += s[i].m;
	  }
	  System.out.printf("%s\n",s[t].name);
	  System.out.printf("%d\n",max);
	  System.out.printf("%d\n",sum);
	  return 0;
	}

}

