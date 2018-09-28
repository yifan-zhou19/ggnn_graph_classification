package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct student
	//	  {
	//			char num[200];
	//			char name[200];
	//			char sex;
	//			int age;
	//			char score[20];
	//			char add[500];
	//			 }
	//			 stu[1000];
				 i = 0;
				while (true)
				{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							stu[i].num = tempVar;
						}
						if (strcmp(stu[i].num,"end") == 0)
						{
									 break;
						}
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  stu[i].name = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar3 != null)
		  {
			  stu[i].sex = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  stu[i].age = tempVar4;
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  stu[i].score = tempVar5;
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  stu[i].add = tempVar6;
		  }
									 i++;
				}
		  for (j = i - 1;j >= 0;j--)
		  {
		  System.out.printf("%s %s %c %d %s %s\n",stu[j].num,stu[j].name,stu[j].sex,stu[j].age,stu[j].score,stu[j].add);
		  }



	}
}

