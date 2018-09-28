//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct data;
public class data
{
	public int x;
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static data create() //??head
	{
		data p;
		p = new data();
		p.next = null;
		return p;
	}

	public static void sort(data head, int n) //head???????n???
	{
		data p = null;
		data q = null;
		data s = null;
		int i;
		for (i = 1;i <= n;i++)
		{
		s = new data();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s.x = Integer.parseInt(tempVar);
		}
		q = head;
		p = head.next;
		while (p != null)
		{
			if (p.x >= s.x)
			{
				break;
			}
			q = p;
			p = p.next;
		}
		q.next = s;
		s.next = p;
		}

	}

	public static void outputdata(data p) //??head
	{
		p = p.next;
		while (p.next != null)
		{
		  System.out.printf("%d ",p.x);
		  p = p.next;
		}
		System.out.printf("%d",p.x);
	}


	public static data inputdata(int n) //??head?????n???
	{
		data q = null;
		data p = null;
		data head = null;
		int i;
		head = create();
		q = head;
		for (i = 1;i <= n;i++)
		{
			p = new data();
		if (p != null)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p.x = Integer.parseInt(tempVar);
		 }
		 p.next = null;
		 q.next = p;
		 q = p;
		}
		}
		return head;
	}

	public static void del(data p, int k) //??head??k???
	{
		data q = null;
		q = p;
		p = p.next;
		while (p != null)
		{
			if (p.x == k)
			{
				q.next = p.next;
				p = null;
				p = q.next;
			}
			else
			{
				q = p;
				p = p.next;
			}
		}
	}

	public static data rinputdata(int n) //??head,????n???
	{
		data q = null;
		data p = null;
		data head = null;
		int i;
		head = create();
		for (i = 1;i <= n;i++)
		{
			p = new data();
			if (p != null)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p.x = Integer.parseInt(tempVar);
				}
				p.next = q;
				q = p;
			}
		}
		head.next = q;
		return head;
	}

	public static void outputk(data p, int k) //???k???
	{
		int i = 1;
		p = p.next;
		while (p != null)
		{
		  if (i == k)
		  {
			 System.out.printf("%d",p.x);
		  }
		  p = p.next;
		  i++;
		}
	}

	public static void change(data p, int n, int m) //?head?n?????m???????
	{
		int i = 1;
		data q = null;
		data s = null;
		data head = null;
		q = p;
		head = p;
		p = p.next;
		while (p != null)
		{
			if (i == n - m + 1)
			{
				break;
			}
			i++;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


