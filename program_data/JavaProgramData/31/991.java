package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct student
	//   {
	//	  char id[200];
	//	  char name[200];
	//	  char sex;
	//	  int age;
	//	  double score;
	//	  char add[200];
	//   }
	//   stu[1000];
	   int i = 0;
	   while ((stu[i].id = ConsoleInput.readToWhiteSpace(true)).length() > 0)
	   {
		   if (strcmp(stu[i].id,"end") == 0)
		   {
			   break;
		   }
		   else
		   {
			   stu[i].name = ConsoleInput.readToWhiteSpace(true);
			   stu[i].sex = ConsoleInput.readToWhiteSpace(true);
			   stu[i].age = ConsoleInput.readToWhiteSpace(true);
			   stu[i].score = ConsoleInput.readToWhiteSpace(true);
			   stu[i].add = ConsoleInput.readToWhiteSpace(true);
		   }
		   i++;
	   }
	   int j = i;
	   for (j = i - 1;j >= 0;j--)
	   {
		   System.out.print(stu[j].id);
		   System.out.print(' ');
		   System.out.print(stu[j].name);
		   System.out.print(' ');
		   System.out.print(stu[j].sex);
		   System.out.print(' ');
		   System.out.print(stu[j].age);
		   System.out.print(' ');
		   System.out.print(stu[j].score);
		   System.out.print(' ');
		   System.out.print(stu[j].add);
		   System.out.print("\n");
	   }
	   return 0;
	}
}

