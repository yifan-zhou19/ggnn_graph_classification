//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public int score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i = 0;
	public static int a;
	public static student m1;
	public static student m2;
	public static student m3;
	public static student q;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.shuxue = Integer.parseInt(tempVar3);
		}
		p1.score = p1.yuwen + p1.shuxue;
		head = null;
		while (i < n - 1)
		{
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.yuwen = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.shuxue = Integer.parseInt(tempVar6);
			}
			p1.score = p1.yuwen + p1.shuxue;
			if (i >= 3)
			{
				if (p2.score > m1.score)
				{
					m3 = m2;
					m2 = m1;
					m1 = p2;
				}
				else if (p2.score <= m1.score != 0 && p2.score> m2.score)
				{
					m3 = m2;
					m2 = p2;
				}
				else if (p2.score <= m2.score != 0 && p2.score> m3.score)
				{
					m3 = p2;
				}
				i++;
				continue;
			}
			if (i == 0)
			{
				m1 = p2;
			}
			else if (i == 1)
			{
				m2 = p2;
			}
			else if (i == 2)
			{
				m3 = p2;
				if (m1.score > m2.score)
				{
					if (m2.score <= m3.score)
					{
						if (m1.score > m3.score)
						{
							q = m3;
							m3 = m2;
							m2 = q;
						}
						else if (m1.score <= m3.score)
						{
							q = m1;
							m1 = m2;
							m2 = m3;
							m3 = q;
						}
					}
				}
				else if (m1.score <= m2.score)
				{
					if (m2.score > m3.score)
					{
						if (m1.score > m3.score)
						{
							q = m1;
							m1 = m2;
							m2 = q;
						}
						else if (m1.score <= m3.score)
						{
							q = m3;
							m3 = m1;
							m1 = m2;
							m2 = q;
						}
					}
					else if (m2.score <= m3.score)
					{
						q = m1;
						m1 = m3;
						m3 = q;
					}
				}
			}
			i++;
		}
		return (head);
	}
	public static int Main()
	{
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


