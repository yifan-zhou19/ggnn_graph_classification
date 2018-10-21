public class Student
{
   public String imf = new String(new char[100]);
   public Student next;
   public Student pre;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		Student p;
		Student q;
		Student h;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		h = p = q = malloc(LEN);
		q.imf = new Scanner(System.in).nextLine();
		q.pre = q.next = null;

		while (strcmp(q.imf,"end") != 0)
		{
		   p = q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   q = malloc(LEN);
		   q.next = null;
		   q.pre = p;
		   p.next = q;
		   q.imf = new Scanner(System.in).nextLine();
		}

		while (p != null)
		{
		  System.out.println(p.imf);
		  p = p.pre;
		}
	}

}
