public class student
{
	public String seq = new String(new char[10]);
	public String other = new String(new char[100]);
	public student next;
	public student previous;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		int n = 1;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);

		while (n++ != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.seq = tempVar.charAt(0);
			}
			if (strcmp(p1.seq,"end") == 0)
			{
				break;
			}
			p1.other = new Scanner(System.in).nextLine();
			if (n > 1)
			{
				p1.previous = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2.next = p1 = (student)malloc(LEN);

		}

		p1 = p2;
		n = n - 1;
		for (n;n > 1;n--)
		{
			System.out.printf("%s%s\n",p1.seq,p1.other);
			p1 = p1.previous;
		}
	}
}

