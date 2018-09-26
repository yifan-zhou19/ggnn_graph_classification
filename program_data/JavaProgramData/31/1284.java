public class student
{
  public String name = new String(new char[50]);
  public student next;
  public student former;
} //????????

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  student head1;
	  student head2;
	  student p1;
	  student p2;



//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = p2 = (student)malloc(LEN);
	  p1.name = new Scanner(System.in).nextLine();
	  p1.next = null; //???p1->next???
	  p1.former = null;
	  head1 = p1;

	  while (strcmp(p1.name,"end"))
	  {
		   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p1.name = new Scanner(System.in).nextLine();

		p1.next = null;
		p1.former = p2;
		p2.next = p1;
	  }
	  p2.next = null;

	  do
	  {
		System.out.println(p2.name);
		p2 = p2.former;
	  } while (p2 != null);

	}
}
