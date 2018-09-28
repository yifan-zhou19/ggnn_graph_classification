package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct number
	//	{
	//		int num;
	//		struct number * next;
	//	};
		number head = null;
		number p;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			p = new number();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2;
			}
			if (i == 1)
			{
				p.next = 0;
			}
			else
			{
				p.next = head;
			}
			head = p;
		}
		if (head != 0)
		{
			for (i = 1;i <= n;i++)
			{
				System.out.printf("%d",p.num);
				if (i < n)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
				p = p.next;
			}
		}
	}
}

