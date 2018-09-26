public class student
{
	public student pre;
	public String mess = new String(new char[500]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		student p1;
		student p2;
		student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		while (strcmp(gets(p1.mess),"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				p1.pre = null;
			}
			else
			{
				p1.pre = p2;
			}
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
		}
		p = p2;
		do
		{
			System.out.printf("%s\n",p.mess);
			p = p.pre;
		}while (p != null);

	}

}
