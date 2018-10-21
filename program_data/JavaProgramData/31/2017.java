public class stu
{
	public String xuehao = new String(new char[100]);

	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		stu head = null;
		stu p1 = null;
		stu p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		p1.xuehao = new Scanner(System.in).nextLine();

		while (strcmp(p1.xuehao,"end") != 0)
		{


			n++;
			if (n == 1)
			{

				p1.next = null;
			}
			else
			{

				p1.next = p2;
			}
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (stu)malloc(LEN);
				p1.xuehao = new Scanner(System.in).nextLine();


		}
		while (p2.next != null)
		{
			System.out.printf("%s\n",p2.xuehao);
			p2 = p2.next;
		}
		System.out.printf("%s\n",p2.xuehao);

	}




}
