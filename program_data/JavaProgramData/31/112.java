import java.util.*;

public class aa
{
		public String data = new String(new char[100]);
		public aa next;
}

package <missing>;

public class GlobalMembers
{
	public static void print(aa p)
	{
		if (p.next != null)
		{
			print(p.next);
		}
		System.out.print(p.data);
		System.out.print("\n");
	}
	public static int Main()
	{

		aa head;
		aa p;
		aa q;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		int si = sizeof(aa);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (aa)malloc(si);
		p = head;
		q = head;
		String s = new String(new char[100]);
		while (s = new Scanner(System.in).nextLine())
		{
			if (strcmp(s,"end"))
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				q = (aa)malloc(si);
				p.next = q;
				q.data = s;
				q.next = null;
				p = q;
			}
			else
			{
				break;
			}
		}
		print(head.next);
		return 0;
	}







}
