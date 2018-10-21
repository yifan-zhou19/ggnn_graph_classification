public class student
{
	   public String what = new String(new char[100]);
	   public student last;
}

package <missing>;

public class GlobalMembers
{
	public static void print(student p)
	{
		 System.out.printf("%s\n",p.what);
		 if (p.last != null)
		 {
			 print(p.last);
		 }
	}
	public static int Main()
	{
		  student stu = new student();
		  student head;
		  student tail;
		  student p1;
		  student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  tail = (student)malloc(LEN);
		  tail.last = null;
		  tail.what = new Scanner(System.in).nextLine();
		  p1 = tail;
		  while (strcmp(p1.what,"end") != 0)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
										  p2 = (student)malloc(LEN);
										  p2.last = p1;
										  p2.what = new Scanner(System.in).nextLine();
										  p1 = p2;
		  }
		  head = p1.last;
		  print(head);
	}
}
