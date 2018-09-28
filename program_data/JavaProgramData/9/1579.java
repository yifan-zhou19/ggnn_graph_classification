package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int n;
		  int m;
		  int i;
		  int j;
		  int max;
		  int l;
		  int sign = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct tt
	//	  {
	//		  char pp[10];
	//		  int age;
	//		  struct tt *next;
	//	  };
		  tt head;
		  tt p1;
		  tt p2;
		  tt p3;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  head = (tt)malloc(LEN);
		  p1 = head;
		  p2 = head;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  head.pp = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  head.age = tempVar3;
		  }
		  for (i = 1;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (tt)malloc(LEN);
			  p2.next = p1;
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  p1.pp = tempVar4;
			  }
			  String tempVar5 = ConsoleInput.scanfRead();
			  if (tempVar5 != null)
			  {
				  p1.age = tempVar5;
			  }
			  p2 = p1;
		  }
		  p2.next = null;
		  for (i = 1;i <= n;i++)
		  {
			  if (sign == 1)
			  {
				  System.out.printf("%s\n",head.pp);
				  head = head.next;
			  }
			  else if (sign == 0)
			  {
				 max = (-1);
				 for (p2 = null,p1 = head;p1 != null;p1 = p1.next)
				 {
					  if (p1.age > max)
					  {
						  max = p1.age;
						  p3 = p2;
					  }
					  p2 = p1;
				 }
				 if (max < 60)
				 {
					 sign = 1;
					 i--;
					 continue;
				 }
				 else if (max >= 60)
				 {
					 if (p3 == null)
					 {
						 System.out.printf("%s\n",head.pp);
						 head = head.next;
					 }
					 else
					 {
						 p1 = p3.next;
						 System.out.printf("%s\n",p1.pp);
						 p3.next = p1.next;
					 }
				 }
			  }
		  }
	}
}

