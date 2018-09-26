package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	char name[30];
	//int final;
	//int crit;
	//char leader;
	//char west;
	//int paper;
	//}
	//stu;

		int max = 0;
		int n;
		int i;
		int total = 0;
		int money;
	String bestboy = new String(new char[30]);
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
						stu.name = tempVar2;
					}
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 stu.final = tempVar3;
				 }
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  stu.crit = tempVar4;
				  }
				 String tempVar5 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar5 != null)
				 {
					 stu.leader = tempVar5;
				 }
				 String tempVar6 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar6 != null)
				 {
					 stu.west = tempVar6;
				 }
				 String tempVar7 = ConsoleInput.scanfRead();
				 if (tempVar7 != null)
				 {
					 stu.paper = tempVar7;
				 }
				 money = 0;
				 if (stu.final > 80 && stu.paper != 0) //1) ????????8000??????????80??>80???????????1??1?????????????
				 {

	//3) ????????2000??????????90??>90????????? 
	//4) ????????1000??????????85??>85????????????? 
	//5) ????????850??????????80??>80??????????? 

					 money += 8000;
				 }
				 if (stu.final > 85 && stu.crit > 80) //2) ????????4000??????????85??>85????????????80??>80?????????
				 {
					 money += 4000;
				 }
				 if (stu.final > 90)
				 {
					 money += 2000;
				 }
				 if (stu.final > 85 && stu.west == 'Y')
				 {
				 money += 1000;
				 }
				 if (stu.crit > 80 && stu.leader == 'Y')
				 {
					 money += 850;
				 }

				 total += money;
				 if (money > max)
				 {
					 max = money;
				  bestboy = stu.name;
				 }
				}
				System.out.printf("%s\n%d\n%d",bestboy,max,total);

	}

}

