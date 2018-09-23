package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct stu
	// {
	//  int num,c,m,d;
	//  struct stu *next;
	// };
	 int n;
	 int i;
	 int f;
	 stu head;
	 stu p1;
	 stu p2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = (stu)malloc(LEN);
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   p1.num = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p1.c = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   p1.m = tempVar4;
	   }
	   p1.d = p1.c + p1.m;
	   if (i == 1)
	   {
		 p1.next = 0;
		 head = p1;
	   }
		 else
		 {
		 if (i <= 3)
		 {
			 f = 1;
		 }
		   else
		   {
		   p2 = head.next.next;
		   if (p1.d > p2.d)
		   {
			   f = 1;
		   }
		 else
		 {
			 f = 0;
		 }
		   }
		 if (f == 1)
		 {
		 p2 = head;
		 if (p2.d < p1.d)
		 {
		   p1.next = p2;
		   head = p1;
		 }
		   else
		   {
		 while ((p2.next != 0) && (p2.next.d > p1.d))
		 {
		   p2 = p2.next;
		 }
		 p1.next = p2.next;
		 p2.next = p1;
		   }
		 }
		 }
	 }
	 p1 = head;
	 for (i = 1;i <= 3;i++)
	 {
	   System.out.printf("%ld %ld\n",p1.num,p1.d);
	   p1 = p1.next;
	 }
	}
}

