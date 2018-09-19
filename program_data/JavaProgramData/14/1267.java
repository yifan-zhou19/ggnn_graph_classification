public class student
 {
	  public int num;
	  public int scorec;
	  public int scorem;
	  public student next;
 }

package <missing>;

public class GlobalMembers
{
	 public static student creat(int n)
	 {
		 student head;
		 student p1;
		 student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (student)malloc(LEN);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p1.num = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 p1.scorec = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p1.scorem = Integer.parseInt(tempVar3);
		 }
		 int s = n - 1;
		 p1.next = null;
		 head = p1;
		 p2 = p1;
		 do
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (student)malloc(LEN);
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p1.num = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ");
			 if (tempVar5 != null)
			 {
				 p1.scorec = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ");
			 if (tempVar6 != null)
			 {
				 p1.scorem = Integer.parseInt(tempVar6);
			 }
			 p1.next = null;
			 p2.next = p1;
			 p2 = p1;
			 s = s - 1;
		 }while (s != 0);
		 return (head);
	 }
	public static void Main()
	{
	  student head;
	  student p;
	  student q;
	  student stu1 = new student();
	  student stu2 = new student();
	  student stu3 = new student();
	  int n;
	  int k1 = -1;
	  int k2 = -1;
	  int k3 = -1;
	  int i;
	  int j;
	  int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  head = creat(n);
	  for (p = head,i = 0;p != null;p = p.next,i++)
	  {
		  l = 0;
		  for (q = head,j = 0;q != null;q = q.next,j++)
		  {
			  if ((q.scorec + q.scorem) > (p.scorec + p.scorem) || (((q.scorec + q.scorem) == (p.scorec + p.scorem)) && j < i))
			  {
				  l = l + 1;
				  if (l > 3)
				  {
					  break;
				  }
			  }
		  }
		  if (l == 0)
		  {
			  k1 = i;
			  stu1.num = p.num;
			  stu1.scorec = p.scorec;
			  stu1.scorem = p.scorem;
		  }
		  if (l == 1)
		  {
			  k2 = i;
			  stu2.num = p.num;
			  stu2.scorec = p.scorec;
			  stu2.scorem = p.scorem;
		  }
		  if (l == 2)
		  {
			  k3 = i;
			  stu3.num = p.num;
			  stu3.scorec = p.scorec;
			  stu3.scorem = p.scorem;
		  }
		  if (k1 != -1 && k2 != -1 && k3 != -1)
		  {
			  break;
		  }
	  }
	  System.out.printf("%ld %d\n",stu1.num,stu1.scorec + stu1.scorem);
	  System.out.printf("%ld %d\n",stu2.num,stu2.scorec + stu2.scorem);
	  System.out.printf("%ld %d",stu3.num,stu3.scorec + stu3.scorem);
	}
}

