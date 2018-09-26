public class student
{
	public String info = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (student)malloc(LEN);
	 p1.info = new Scanner(System.in).nextLine();
	 p1.next = null_Renamed;
	 while (strcmp("end",p1.info) != 0)
	 {
			head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		  p1.next = p2;
		  p2 = p1;

		  p1.info = new Scanner(System.in).nextLine();
	 }
	 return (head);
	}
	public static void print(student head)
	{
		student p;
	 p = head;
	 while (p != null_Renamed)
	 {
			System.out.printf("%s\n",p.info);
		 p = p.next;
	 }
	}
	public static int Main()
	{
		student head;
	 head = creat();
	 print(head);
	}

}
