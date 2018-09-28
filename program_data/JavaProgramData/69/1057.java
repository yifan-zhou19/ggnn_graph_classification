//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class Node
{
	public int num;
	public Node llink;
	public Node rlink;
}

package <missing>;

public class GlobalMembers
{
	/****???:???****/
	/**??:2012?3?5?**/
	/**??:1100012450****/
	/**?????????*/
	/**????????????**/
	public static int count = 1; //?????create???print??
	public static int x1 = 0;
//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
	//struct Node; //????
	public static Node createNullList_link() //?????
	{
		Node p = new Node();
		if (p != null)
		{
			p.rlink = p.llink = null;
		}
		else
		{
			System.out.print("out of space!\n");
		}
		return (p);
	}
	public static Node create() //????????
	{
		//printf("????%d????\n",count);
		char c; //???????
		int X = 0;
		Node p;
		p = createNullList_link();
		p.rlink = null;
		while ((c = System.in.read()) != '\n') //???????????????????
		{
			Node q = new Node();
			if (q != null)
			{
				if (c == '-')
				{
					X = 1;
					continue;
				}
				if (X == 1)
				{
					q.num = -1 * (c - '0'); //???????????
				}
				else
				{
					q.num = c - '0';
				}
				q.rlink = p;
				q.llink = null;
				p.llink = q;
				p = q;
			}
			else
			{
			System.out.print("out of space!\n");
			}
		}
		count++; //???????????
		return (p);
	}
	public static void print(Node llist) //???????
	{
		int x0 = 0;
		while (llist.rlink != null)
		{
			if (llist.num > 0 && llist.rlink.num < 0) //????????
			{
				llist.num--;
				llist.rlink.num += 10;
			}
			if (llist.num == 0 && llist.rlink.num < 0)
			{
				System.out.print("-");
			}
			if (x0 == 0 && llist.rlink.rlink != null && llist.num == 0 && x1 == 0) //?????????????0
			{
				llist = llist.rlink;
				continue;
			}
			System.out.printf("%d",Math.abs(llist.num));
			llist = llist.rlink;
			x0++;
		}
	}
	public static Node add(Node p1, Node p2, Node q) //????
	{
		int Jw = 0; //????
		int out = 0; //?????????
		while ((p1.rlink != null) || (p2.rlink != null))
		{
			if ((p1.rlink != null) && (p2.rlink != null))
			{
				out = p1.num + p2.num + Jw;
				p1 = p1.rlink;
				p2 = p2.rlink;
			}
			else if ((p1.rlink == null) && (p2.rlink != null)) //??1???????????2????1?
			{
				out = 0 + p2.num + Jw;
				p2 = p2.rlink;
			}
			else //??2???????????1????2?
			{
				out = p1.num + 0 + Jw;
				p1 = p1.rlink;
			}

			Jw = 0;
			Node p = new Node();
			if (p == null)
			{
				System.out.print("out of space!\n");
			}
			if (out > 0 || out == 0)
			{
			p.num = (out % 10);
			}
			else
			{
				p.num = -1 * ((-1 * out) % 10);
			}
			p.rlink = q;
			p.llink = null;
			q.llink = p;
			q = p;
			if (out > 0 || out == 0)
			{
			Jw = out / 10;
			}
			else if (out < (-1 * 9))
			{
			Jw = -1;
			}
		}
	 //   printf("???????\n");
		if (Jw == 1)
		{
			System.out.print("1");
			x1 = 1;
		} //??????????1????????????
		if (Jw == -1 && out != 0)
		{
			System.out.print("-1");
			x1 = 1;
		} //????????????1???
		else if (out < 0)
		{
			System.out.print("-"); //??
		}
		return q;
	}
	public static void destroy1List_link(Node llist) //??????
	{
		Node p;
		while (llist != null)
		{
			p = llist;
			llist = llist.rlink;
			p = null;
		}
	}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
