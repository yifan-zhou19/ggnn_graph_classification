public class student
{
	public String s = new String(new char[100]);
  public student next;
}

package <missing>;

public class GlobalMembers
{
	 public static student creat()
	 {
		 student head;
		 student p1;
		 student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (student)malloc(len);
		 p1.s = new Scanner(System.in).nextLine();
		 p1.next = null_Renamed;
		 do
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(len);
			p2.s = new Scanner(System.in).nextLine();
			p2.next = p1;
			p1 = p2;
		 } while (strcmp(p2.s,"end"));
			 head = p2;
			 return (head);
	 }
	 public static void Main()
	 {
		 student p;
		 student head;
		 head = creat();
		 p = head;
		 while (p.next != null)
		 {
			 p = p.next;
			 System.out.printf("%s\n",p.s);
		 }
	 }


}
