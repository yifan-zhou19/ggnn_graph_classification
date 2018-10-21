public class student
{
	public String string = new String(new char[10000]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student create()
	{
		 student tail;
		 student p1;
		 student p2;
		 student head;

		 n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = p2 = (student)malloc(Len);
		 p1.string = new Scanner(System.in).nextLine();
		 tail = null;

		 while (strcmp(p1.string,"end") != 0)
		 {
			 n = n + 1;
			 if (n == 1)
			 {
				 tail = p1;
				 p1.next = null;
			 }
			 else
			 {
				 p1.next = p2;
			 }

			 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (student)malloc(Len);
			 p1.string = new Scanner(System.in).nextLine();
		 }
		 head = p2;
		 return head;
	}



	public static void Main()
	{

		student head;
		student p;
		head = create();

		p = head;

		  do
		  {
				System.out.println(p.string);
				p = p.next;
		  } while (p != null);




	}
}
