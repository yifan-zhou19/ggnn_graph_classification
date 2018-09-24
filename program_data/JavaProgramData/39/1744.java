package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int i;
		 int summoney = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct data
	//	 {
	//	 char name[50];
	//	 int grade,classgrade,papers;
	//	 char monitor,west;
	//	 int money;
	//	 }
	//	 *number;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		 number = (data)malloc(sizeof(data) * n);
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 number[i].name = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 number[i].grade = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 number[i].classgrade = tempVar4;
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 number[i].monitor = tempVar5;
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 number[i].west = tempVar6;
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 number[i].papers = tempVar7;
			 }
			 number[i].money = 0;
			 if (number[i].grade > 80 && number[i].papers >= 1)
			 {
				 number[i].money += 8000;
			 }
			 if (number[i].grade > 85 && number[i].classgrade > 80)
			 {
				 number[i].money += 4000;
			 }
			 if (number[i].grade > 90)
			 {
				 number[i].money += 2000;
			 }
			 if (number[i].grade > 85 && number[i].west == 'Y')
			 {
				 number[i].money += 1000;
			 }
			 if (number[i].classgrade > 80 && number[i].monitor == 'Y')
			 {
				 number[i].money += 850;
			 }
			 summoney += number[i].money;
		 }
		 int a;
		 int k;
		 a = number[n - 1].money;
		 k = 0;
		 for (i = n - 1;i > 0;i--)
		 {
			 if (a > number[i - 1].money)
			 {
				 a = a;
			 }
			 else
			 {
				 a = number[i - 1].money;
				 k = i - 1;
			 }
		 }
		 System.out.printf("%s\n%d\n%d\n",number[k].name,number[k].money,summoney);
		 return 0;
	 }
}

