public class stu
{
	public String num = new String(new char[50]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p1;
		stu p2;
		int i = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(L);
		p1.num = new Scanner(System.in).nextLine();
		head = p1;
		while ((strcmp(p1.num,"end") != 0))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu) malloc(L);
			p1.num = new Scanner(System.in).nextLine();
			p2.next = p1;
			p2 = p1;
			i++;
		}
		p2.next = null;
		int k;
		for (;i > 1;i--)
		{
			k = i;
			for (p1 = head;k > 2;k--)
			{
				p1 = p1.next;
			}
			System.out.printf("%s\n",p1.num);
		}
	}

}
