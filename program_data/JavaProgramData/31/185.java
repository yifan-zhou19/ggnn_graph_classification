public class stu
{
	   public String x = new String(new char[300]);
	   public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void creat1(stu head, tangible.RefObject<String> p) //?????
	{
		 stu pre;
		 stu p1;
		 stu s;
		 s = new stu();
		 s.x = p.argValue;
		 pre = head;
		 p1 = pre.next;
		 pre.next = s;
		 s.next = p1;
	}

	public static void creat2(stu head, tangible.RefObject<String> p) //?????
	{
		 stu pre;
		 stu p1;
		 stu s;
		 s = new stu();
		 s.x = p.argValue;
		 pre = head;
		 p1 = pre.next;
		 for (;p1 != null;)
		 {
					   pre = p1;
					   p1 = p1.next;
		 }
		 pre.next = s;
		 s.next = p1;
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(300 * (Integer.SIZE / Byte.SIZE));
		stu head;
		stu s;
		head = new stu();
		head.next = null;
		for (i = 0;;i++)
		{
					 p = new Scanner(System.in).nextLine();
					 if (*(p.Substring(0)) == 'e')
					 {
									break;
					 }
					 else
					 {
					 tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
						 creat1(head, tempRef_p);
						 p = tempRef_p.argValue;
					 }
		}
		s = head.next;
		for (;s != null;)
		{
					  System.out.println(s.x);
					  s = s.next;
		}
		return 0;
	}

}

