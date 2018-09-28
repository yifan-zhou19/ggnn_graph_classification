//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class Patient
{
	public String num = new String(new char[10]);
	public int age;
	public Patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void paixu(int n,struct Patient * head);
		Patient creat = new Patient(int n);
		int n;
		int i;
		Patient head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		paixu(n, head);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",head.num);
			head = head.next;
		}

	}
	public static Patient creat(int n)
	{
		int i;
		Patient head;
		Patient thispoint;
		Patient nextpoint;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				nextpoint = new Patient();
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					nextpoint.num = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					nextpoint.age = Integer.parseInt(tempVar2);
				}
				head = nextpoint;
				thispoint = head;
			}
			else
			{
				nextpoint = new Patient();
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					nextpoint.num = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					nextpoint.age = Integer.parseInt(tempVar4);
				}
				thispoint.next = nextpoint;
				thispoint = nextpoint;
			}
		}
		thispoint.next = null;
		return head;
	}
	public static void paixu(int n, Patient head)
	{
		int i;
		int j;
		int k;
		int count;
		Patient p1;
		Patient p2;
		Patient p3;
		Patient p4;
		String tempnum = new String(new char[10]);
		String tempnum3 = new String(new char[10]);
		String tempnum4 = new String(new char[10]);
		int tempage;
		int tempage3;
		int tempage4;
		p1 = head;
		for (i = 0;i < n - 1;i++)
		{
			if (p1.age < 60)
			{
				p2 = p1.next;
				for (j = i + 1;j < n;j++)
				{
					if (p2.age > 59)
					{
						tempnum = p2.num;
						tempage = p2.age;
						p3 = p1;
						p4 = p3.next;
						for (k = i;k < j;k++)
						{
							tempnum4 = p4.num;
							tempage4 = p4.age;
							if (k == i)
							{
								p4.num = p3.num;
								p4.age = p3.age;
							}
							else
							{
								p4.num = tempnum3;
								p4.age = tempage3;
							}
							tempnum3 = tempnum4;
							tempage3 = tempage4;
							p3 = p3.next;
							p4 = p4.next;
						}
						p1.num = tempnum;
						p1.age = tempage;
						break;
					}
					else
					{
						p2 = p2.next;
					}
				}
			}
			p1 = p1.next;
		}
		p1 = head;
		for (i = 0,count = 0;i < n;i++)
		{
			if (p1.age > 59)
			{
				count++;
			}
			p1 = p1.next;
		}
		p1 = head;
		for (i = 1;i < count;i++)
		{
			p2 = p1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


