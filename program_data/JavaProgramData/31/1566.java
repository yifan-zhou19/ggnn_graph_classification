///#include <memory.h>
public class information
{
	public String info = new String(new char[50]);
 public information next;
}

package <missing>;

public class GlobalMembers
{
	public static information creat()
	{
		information head;
		information p1;
		information p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (information)malloc(len);
	 p1.next = null;
	 p1.info = new Scanner(System.in).nextLine();
	 while (strcmp(p1.info,"end") != 0)
	 {
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (information)malloc(len);
		 p1.info = new Scanner(System.in).nextLine();
		 p1.next = p2;
	 }
	 return p2;
	}

	public static void print(information head)
	{
	 while (head != null)
	 {
			System.out.printf("%s\n",head.info);
		 head = head.next;
	 }
	}

	public static int Main()
	{
		information head;
	 head = creat();
	 print(head);
	}
}
