//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class patient
{
	public String id = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static patient creat(int num) //????
	{
		patient head;
		patient p1;
		patient p2;
		n = 0;
		p1 = p2 = new patient();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.age = Integer.parseInt(tempVar2);
		}
		head = null;
		while (n < (num - 1))
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new patient();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.id = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static patient old(patient head) //??????????????old???????????60?????????
	{
		patient old;
		patient p1;
		patient p2;
		patient p;
		n = 0;
		p = head;
		p1 = p2 = new patient();
		old = null;
		while (p != null)
		{
			if ((n == 0) && (p.age >= 60))
			{
				p1.id = "";
				p1.id = p.id;
				p1.age = p.age;
				old = p1;
				p2 = p1; //?????????????????
				n = 1; //?????????????????
			}
			else if (p.age >= 60)
			{
				p1.id = "";
				p1.id = p.id;
				p1.age = p.age;
				p2.next = p1;
				p2 = p1; //?????????????p2=p1???????
			}
			p1 = new patient();
			p = p.next;
		}
		p2.next = null;
		return (old);
	}
	public static patient sort(patient head) //?????????????????????????????????????
	{
		patient head0 = new patient();
		patient end0 = new patient();
		patient p0;
		patient p1;
		patient p2;
		patient p;
		head0.next = head;
		p = head;
		while (p.next != null)
		{
			p = p.next;
		}
		p = p.next = end0;
		while (p != head0.next) //????????????????p!=head,????p!=head0.next
		{
			p0 = head0;
			p1 = p0.next;
			p2 = p1.next;
			while (p2 != p)
			{
				if ((p1.age) < (p2.age))
				{
					p0.next = p2;
					p1.next = p2.next;
					p2.next = p1;
					p0 = p2;
					p2 = p1.next;
				}
				else
				{
					p0 = p1;
					p1 = p2;
					p2 = p2.next;
				}
			}
			p = p1;
		}
		while (p.next != end0)
		{
			p = p.next;
		}
		p.next = null;
		return (p1);
	}
	public static void print2(patient head) //??????????????60????id
	{
		patient p;
		p = head;
		while (p != null)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


