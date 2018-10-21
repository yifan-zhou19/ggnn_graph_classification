public class sick
{
	public String num;
	public int age;
	public sick next;
}

package <missing>;

public class GlobalMembers
{
	public static sick range(int N)
	{
		sick pnew;
		sick ppre;
		sick p;
		sick head;
		sick last;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pnew = (sick)malloc(len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pnew.num = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		pnew.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pnew.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			pnew.age = Integer.parseInt(tempVar2);
		}
		head = last = pnew;
		int i;
		for (i = 2;i <= N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pnew = (sick)malloc(len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pnew.num = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			pnew.next = null;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pnew.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pnew.age = Integer.parseInt(tempVar4);
			}
			int j;
			if (pnew.age < 60)
			{
				last.next = pnew;
				last = pnew;
			}
			else
			{
				if (pnew.age > head.age)
				{
					pnew.next = head;
					head = pnew;
				}
				else
				{
					ppre = head;
					p = head.next;
					for (j = 2;p != null;j++)
					{
						if (pnew.age > p.age)
						{
							ppre.next = pnew;
							pnew.next = p;
							break;
						}
						else
						{
							ppre = ppre.next;
							p = p.next;
						}
					}
				}
				if (pnew.next == null)
				{
					last.next = pnew;
					last = pnew;
				}
			}
		}
		return (head);
	}
	public static void print(sick head, int N)
	{
		sick p = head;
		int i;
		for (i = 1;i <= N;i++)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
	}



	public static void Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		sick head = range(N);
		print(head, N);
	}

}

