package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct INF
	//	  {
	//		  char a1[20];
	//		  char a2[20];
	//	  char a3[20];
	//	  char a4[20];
	//	  char a5[20];
	//	  char a6[20];
	//	  struct INF *pp;
	//	  }
	//	  *p1,*p2;
		  p1 = new INF();
		  p2 = null;
		  int n = 0;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.a1 = tempVar;
		  }
		  while (strcmp(p1.a1,"end") != 0)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  p1.a2 = tempVar2;
			  }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p1.a3 = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p1.a4 = tempVar4;
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 p1.a5 = tempVar5;
			 }
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 p1.a6 = tempVar6;
			 }
			 p1.pp = p2;
			 p2 = p1;
			 p1 = new INF();
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p1.a1 = tempVar7;
			 }
			 n++;
		  }
		  for (i = 0;i < n;i++)
		  {
			  System.out.printf("%s %s %s %s %s %s\n",p2.a1,p2.a2,p2.a3,p2.a4,p2.a5,p2.a6);
		   p2 = p2.pp;
		  }
	}

}

