package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct student
	//	  {
	//			 int num;
	//			 int yuwen;
	//			 int shuxue;
	//			 int zongfen;
	//	  }
	//	  stu[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct qiansan
	//	  {
	//			 int num;
	//			 int zongfen;
	//	  }
	//	  st[3]={{0,0},{0,0},{0,0}};
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
				  stu[i].num = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  stu[i].yuwen = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  stu[i].shuxue = tempVar4;
			  }
			  stu[i].zongfen = stu[i].yuwen + stu[i].shuxue;
			  if (stu[i].zongfen > st[0].zongfen)
			  {
				  st[2] = st[1];
				  st[1] = st[0];
				  st[0].zongfen = stu[i].zongfen;
				  st[0].num = stu[i].num;
			  }
			  else if (stu[i].zongfen <= st[0].zongfen && stu[i].zongfen> st[1].zongfen)
			  {
				  st[2] = st[1];
				  st[1].zongfen = stu[i].zongfen;
				  st[1].num = stu[i].num;
			  }
			  else if (stu[i].zongfen <= st[1].zongfen && stu[i].zongfen> st[2].zongfen)
			  {
				  st[2].zongfen = stu[i].zongfen;
				  st[2].num = stu[i].num;
			  }
		  }
		  for (i = 0;i < 3;i++)
		  {
			  if (i == 0)
			  {
			  System.out.printf("%d %d",st[i].num,st[i].zongfen);
			  }
			  else
			  {
			  System.out.printf("\n%d %d",st[i].num,st[i].zongfen);
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

