public class student
{
	public String name = new String(new char[20]);
	public int finalmarks;
	public int classmarks;
	public char monitor;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student stu = new student();

	public static void Main()
	{
	 int n;
	 final String bigname = "0";
	 int max = 0;
	 int temp = 0;
	 int sum = 0;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 stu.name = tangible.StringFunctions.changeCharacter(stu.name, 20, "0");
		 temp = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu.name = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 stu.finalmarks = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 stu.classmarks = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 stu.monitor = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 stu.west = tempVar6.charAt(0);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 stu.paper = Integer.parseInt(tempVar7);
		 }
	  //????????8000??????????80??>80???????????1??1????????????? 
	  if (stu.finalmarks > 80 && stu.paper >= 1)
	  {
		 temp = temp + 8000;
	  }
	  //????????4000??????????85??>85????????????80??>80?????????
	  if (stu.finalmarks > 85 && stu.classmarks > 80)
	  {
		 temp = temp + 4000;
	  }
	  //????????2000??????????90??>90?????????
	  if (stu.finalmarks > 90)
	  {
		 temp = temp + 2000;
	  }
	  //????????1000??????????85??>85????????????? 
	  if (stu.finalmarks > 85 && stu.west == 'Y')
	  {
		 temp = temp + 1000;
	  }
	  //????????850??????????80??>80???????????
	  if (stu.classmarks > 80 && stu.monitor == 'Y')
	  {
		temp = temp + 850;
	  }
	  sum = sum + temp;
	  if (max < temp)
	  {
	   max = temp;
	   bigname = stu.name;
	  }
	 }
	 System.out.printf("%s\n",bigname);
	 System.out.printf("%d\n",max);
	 System.out.printf("%d",sum);
	}
}

