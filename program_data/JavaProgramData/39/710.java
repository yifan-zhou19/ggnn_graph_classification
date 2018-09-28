package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//  {
	//	  char name[20];
	//   int scorea;
	//   int scoreb;
	//   char a;
	//   char f;
	//   int b;
	//   int c;
	//	}
	//	d[100],s;
	 s.c = 0;
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
			 d[i].name = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 d[i].scorea = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 d[i].scoreb = tempVar4;
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 d[i].a = tempVar5;
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 d[i].f = tempVar6;
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 d[i].b = tempVar7;
		 }
	  d[i].c = 0;
	  if (d[i].scorea > 80 && d[i].b > 0)
	  {
	  d[i].c = d[i].c + 8000;
	  }
	  if (d[i].scorea > 85 && d[i].scoreb > 80)
	  {
	  d[i].c = d[i].c + 4000;
	  }
	  if (d[i].scorea > 90)
	  {
	  d[i].c = d[i].c + 2000;
	  }
	  if (d[i].scorea > 85 && d[i].f == 'Y')
	  {
	  d[i].c = d[i].c + 1000;
	  }
	  if (d[i].scoreb > 80 && d[i].a == 'Y')
	  {
	  d[i].c = d[i].c + 850;
	  }
	  e = e + d[i].c;
	 }
	  for (i = 0;i < n;i++)
	  {
		  if (d[i].c > s.c)
		  {
	  s = d[i];
		  }
	  }
	  System.out.printf("%s\n%d\n%d",s.name,s.c,e);
	 return 0;
	}
}

