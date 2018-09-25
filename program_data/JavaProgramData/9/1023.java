public class person
{
	public String id = new String(new char[10]);
	public int age;
	public person next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		person head;
		person ppre;
		person pnew;
		person p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pnew = (person)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			pnew.id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			pnew.age = Integer.parseInt(tempVar3);
		}
		pnew.next = null;
		head = pnew;
		for (i = 2;i <= n;i++)
		{
			p = head;
			ppre = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pnew = (person)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				pnew.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				pnew.age = Integer.parseInt(tempVar5);
			}
			pnew.next = null;
			if ((pnew.age >= 60) && (pnew.age > head.age))
			{
				pnew.next = head;
				head = pnew;
			}
			else
			{
				if (pnew.age >= 60)
				{
					p = p.next;
					for (j = 2;j < i;j++)
					{
						if (pnew.age > p.age)
						{
							pnew.next = p;
							ppre.next = pnew;
							break;
						}
						p = p.next;
						ppre = ppre.next;
					}
					if (pnew.next == null)
					{
						ppre.next = pnew;
					}
				}
				else
				{
					while (p.next != null)
					{
						p = p.next;
					}
					p.next = pnew;
				}
			}
		}
		p = head;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}
	}

}

