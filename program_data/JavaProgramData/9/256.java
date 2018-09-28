//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class rat
{
	public String num = new String(new char[11]);
	public int age;
	public rat next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static rat creat()
	{
		rat head;
		rat p1;
		rat p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (rat)malloc(LEN);
		head = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
		for (i = 2;i <= n;i++)
		{
			p2.next = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (rat)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}

	public static rat sort(rat head, int count)
	{
		rat p1;
		rat p2;
		rat p3;
		rat temp;
		int i;
		int j;
		for (j = 1;j <= count - 1;j++)
		{
			p1 = head;
			p2 = p1.next;
			p3 = p2;
			for (i = 0;i < count - j;i++)
			{
				if (p1.age < p2.age)
				{
					temp = p2.next;
					p2.next = p1;
					p1.next = temp;
					if (i == 0)
					{
						head = p2;
						p2 = temp;
					}
					else
					{
						p3.next = p2;
						p3 = p2;
						p2 = temp;
					}
				}
				else
				{
					if (i == 0)
					{
						p3 = head = p1;
						p1 = p1.next;
						p2 = p2.next;
					}
					else
					{
						p1 = p1.next;
						p2 = p2.next;
						p3 = p3.next;
					}
				}
			}
		}
		return (head);
	}

	public static rat del(rat head, int t)
	{
		rat p1;
		rat p2;
		int i;
		p1 = head;
		for (i = 1;i <= t;i++)
		{
			if (p1.age < 60)
			{
				if (i == 1)
				{
					head = p1;
				}
				p2 = p1;
				p1 = p1.next;
				continue;
			}
			if (p1.age >= 60)
			{
				if (i == 1)
				{
					head = p1.next;
					break;
				}
				p2.next = p1.next;
				break;
			}
		}
		return (head);
	}




	public static void Main()
	{
		rat head;
		rat p1;
		rat s;
		rat p2;
		rat p3;
		int i;
		int count = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		head = creat();
		p1 = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


