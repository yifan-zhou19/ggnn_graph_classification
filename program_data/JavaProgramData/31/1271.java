public class student
{
	public String inf = new String(new char[100]);
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
		student end;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student) malloc(LEN);
		p1.inf = new Scanner(System.in).nextLine();
		head = end = null;
		while (strcmp(p1.inf,"end") != 0)
		{

			n = n + 1;
			if (n == 1)
			{
			  p1.next = head;
			  end = p1;

			}
			else
			{
				p1.next = end;
				   end = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student) malloc(LEN);
			p1.inf = new Scanner(System.in).nextLine();

		}
		return end;
	}
	public static void print(student end)
	{
		student p1;
		p1 = end;
	while (p1 != null)
	{
			System.out.printf("%s\n",p1.inf);
			p1 = p1.next;
	}

	}
	public static void Main()
	{
		student end;
		end = creat();
		print(end);
	}


}
