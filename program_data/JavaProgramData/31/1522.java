public class student
{
	public String a = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void Main()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(L);
		p1.a = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.a,"end") != 0)
		{
			n = n + 1;
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
			p1 = (student)malloc(L);
			p1.a = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		int i;
		int k;
		student j;
		j = head;
		for (k = n - 1;k > -1;k--)
		{
			for (i = 0;i < k;i++)
			{
				j = j.next;
			}
			System.out.println(j.a);
			j = head;
		}
	}

}
