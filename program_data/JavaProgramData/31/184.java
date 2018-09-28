//struct student
public class student
{
	public String content = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student p1;
		student p2;
		student p3;
		student h;
		student p4;
		student p5;
		student p6;
		int i;
		int j;
		int k;
		String s = new String(new char[16]);
		s = tangible.StringFunctions.changeCharacter(s, 0, 'e');
		s = tangible.StringFunctions.changeCharacter(s, 1, 'n');
		s = tangible.StringFunctions.changeCharacter(s, 2, 'd');
		s = tangible.StringFunctions.changeCharacter(s, 3, '\0');
		int m = 0;
		p6 = p4 = p5 = p3 = p1 = p2 = new student();
		p1.content = new Scanner(System.in).nextLine();
		p4 = p1;
		for (;strcmp(p1.content,s) != 0;)
		{
				p2 = p1;
				p1 = new student();
				p1.next = p2;
				p1.content = new Scanner(System.in).nextLine();
		}
		p4.next = null;
		p3 = head = p1.next;
		m = 0;
		for (;p3 != null;)
		{
					   m++;
					   if (m == 1)
					   {
							   System.out.printf("%s",p3.content);
					   }
					   else
					   {
							   System.out.printf("\n%s",p3.content);
					   }
					   p3 = p3.next;
		}
		return 0;
	}
}

