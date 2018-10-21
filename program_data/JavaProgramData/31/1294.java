package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct student
	//{
	// char str[100];
	// struct student *before;
	// struct student *next;
	// }
	// *head,*p1,*p2;
	 p1 = new student();
	 p1.before = null;
	 head = p1;
	 while (strcmp(p2.str,"end") != 0)
	 {
	  p1.str = new Scanner(System.in).nextLine();
	  p2 = p1;
	  p1 = new student();
	  p1.before = p2;
	  p2.next = p1;
	 }
	  p2.next = null;
	  p2 = p2.before;
	  do
	  {
	   System.out.printf("%s\n",p2.str);
	   p2 = p2.before;
	  }while (p2.before != null);
	  System.out.printf("%s\n",p2.str);
	}
}
