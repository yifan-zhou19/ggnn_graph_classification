public class w
{
	public String id = new String(new char[100]);
public w next;
}

package <missing>;

public class GlobalMembers
{
	public static w head;
	public static w new;
	public static w newhead;
	public static w p1;
	public static w p2;
	 public static int i;
	 public static int n;

	public static void Main()
	{
		  n = 0;
		head = null_Renamed;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (w)malloc(len);
		p1.id = new Scanner(System.in).nextLine();
		while (strcmp(p1.id,"end") != 0)
		{
		n++;
		if (n == 1)
		{
			head = p1;
		}
		else
		{
			p2.next = p1;
		}
		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (w)malloc(len);
		p1.id = new Scanner(System.in).nextLine();
		}
		p2.next = null_Renamed;
		for (i = 0;i < n;i++)
		{
			p2 = p1 = head;
		while (p1.next != null_Renamed)
		{
			p2 = p1;
			p1 = p1.next;
		}
		if (i == 0)
		{
			newhead = new = p1;
		}
		else
		{
			new = new.next = p1;
		}
		p2.next = null_Renamed;
		}
		p1 = newhead;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p1.id);
		p1 = p1.next;
		}
	}
}
