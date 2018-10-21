//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

/************************************************************
                ???(??)?????????
                  ??????
				  ?????2012.3.2
                  ???1100012617
************************************************************/

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct Node;


public class Node //???????
{
	public Node last;
	public Node next;
	public char a;
}

package <missing>;

public class GlobalMembers
{
	public static Node CreateNullList() //????????????
	{
		Node p = new Node();
		p.next = null;
		p.last = null;
		return p;
	}

	public static void InsertNode(Node p, char b) //?????????????
	{
		Node pn = new Node();
		pn.a = b;
		pn.next = p.next;
		pn.last = p;
		p.next = pn;
		if (pn.next != null)
		{
		pn.next.last = pn;
		}
	}

	public static int Compare(Node p1, Node p2) //??????p1?p2???
	{ //????1??p1???????2??
		int i; //p2??
		int j;
		i = 0;
		j = 0;
		p1 = p1.next;
		p2 = p2.next;
		while (p1 != null)
		{
			i += 1;
			p1 = p1.next;
		}
		while (p2 != null)
		{
			j += 1;
			p2 = p2.next;
		}
		if ((i - j) >= 0)
		{
			return 1;
		}
		else
		{
		return 2;
		}
	}

	public static int Add(Node p1, Node p2) //????????????????
	{ //?p1?p2??????????
		int n; //?????
		int k;
		k = Compare(p1, p2);
		Node p3;
		p1 = p1.next;
		p2 = p2.next;
		if (k == 2) //??k????p1?p2?????p1?????????
		{
		   p3 = p1;
		   p1 = p2;
		   p2 = p3;
		}

			  while ((p1 != null) && (p2 != null)) //????
			  {
				  n = p1.a - '0' + p2.a - '0';
				  if (n < 10) //???
				  {
					  p1.a = n + '0';
				  }
				  else //?????????????
				  {
					  p1.a = n - 10 + '0';
					  if (p1.next == null)
					  {
						  Node p = new Node();
						  p.a = '1';
						  p1.next = p;
						  p.next = null;
						  p.last = p1;
					  }
					  else
					  {
						  if (p2.next != null)
						  {
						  p1.next.a = (p1.next.a) - '0' + 1 + '0';
						  }
						  else
						  {
							  p1.next.a = (p1.next.a) - '0' + 1 + '0';
							  p1 = p1.next;
							  while ((p1.a - '0') > 9)
							  {
								   p1.a = p1.a - '0' - 10 + '0';
								   if (p1.next != null)
								   {

									  p1.next.a = (p1.next.a) - '0' + 1 + '0';

									  p1 = p1.next;
								   }
								   else
								   {
									   Node pointer = new Node();
										pointer.a = '1';
										p1.next = pointer;
										pointer.next = null;
										pointer.last = p1;
								   }
							  }
						  }
					  }
				  }
				  p1 = p1.next;
				  p2 = p2.next;
			  }
		return k;
	}

	public static int Main()
	{
		   char c;
		Node p1 = CreateNullList();
		Node p2 = CreateNullList();
		Node p3 = p1; //p3,p4????????????
		Node p4 = p2; //????????

		c = System.in.read();
		while (c != '\n')
		{
			InsertNode(p1, c);
			  c = System.in.read();
		}

	   c = System.in.read();
		while (c != '\n')
		{
			InsertNode(p2, c);
			c = System.in.read();
		}



		int w;
		w = Add(p1, p2);

				if (w == 1)
				{
			 p2 = p1;
				}
				while (p2.next != null)
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
