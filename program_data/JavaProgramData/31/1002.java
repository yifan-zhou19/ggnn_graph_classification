public class student
{
	public String c = new String(new char[300]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student create()
	{
		student head;
		student p1;
		student p2;
	 n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = head = (student)malloc(Len);
	 head.c = new Scanner(System.in).nextLine();
	 head.next = null;
	 while (strcmp("end",p1.c) != 0)
	 {
		 head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (student)malloc(Len);
	  p1.next = head;
	  p1.c = new Scanner(System.in).nextLine();
	 }
	 return head;
	}
	public static int Main()
	{
		student start;
		start = (student)create();
		do
		{
			System.out.printf("%s\n",start.c);
		 start = start.next;
		}while (start.next != 0);
		System.out.printf("%s\n",start.c);
		return 7;
	}














}
