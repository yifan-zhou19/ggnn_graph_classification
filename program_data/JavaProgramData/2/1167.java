public class student
{
	public String name = new String(new char[27]);
	public int anum;
	public int num;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static char c;

	public static student creat()
	{
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(LEN);
		if (n == 0)
		{
			head = null;
		}
		else
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				head.num = Integer.parseInt(tempVar);
			}
			for (i = 0;(c = System.in.read()) != '\n';i++)
			{
				head.name = tangible.StringFunctions.changeCharacter(head.name, i, c);
			}
			head.anum = i;
			head.next = null;
		}
		return (head);
	}


	public static int Main()
	{
		student head;
		student p1;
		student p2;
		student p;
		char[] l = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int j;
		int max = 0;
		int lmax;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p1 = p2 = head;

		for (i = 1;i < n;i++)
		{
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
				p2.next = p1;
				p2 = p1;

				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p2.num = Integer.parseInt(tempVar2);
				}
				for (j = 0;(c = System.in.read()) != '\n';j++)
				{
					p2.name = tangible.StringFunctions.changeCharacter(p2.name, j, c);
				}
				p2.anum = j;

				p2.next = null;
		}
		}

		p = head;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < p.anum;i++)
			{
				l[p.name.charAt(i)] = l[p.name.charAt(i)] + 1;
			}
			p = p.next;
		}



		for (i = 65;i <= 90;i++)
		{
			if (l[i] > max)
			{
				max = l[i];
				lmax = i;
			}

		}
		System.out.printf("%c\n%d\n",lmax,max);

		p = head;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < p.anum;i++)
			{
				if (p.name.charAt(i) == lmax)
				{
					System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}


		return 0;
	}


}

