//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

// ??????????

public class record
{
	public int stuID;
	public short YuWen;
	public short math;
	public short total;
}

public class YyxNode
{
	public record m_rec = new record();
	public YyxNode next;
}

public class YyxLink
{
	public int n;
	public YyxNode head;
	public YyxNode tail;
}

package <missing>;

public class GlobalMembers
{
	public static YyxLink CreateNewLink()
	{
		YyxLink newLn;
		if ((newLn = new YyxLink()) == null)
		{
			System.out.print("Error: memory out! (1)\n");
			System.exit(-1);
		}
		newLn.n = 0;
		newLn.head = null;
		newLn.tail = null;

		return newLn;
	}

	public static YyxLink AddNode(YyxLink ln, record rec)
	{
		YyxNode newNode;
		if ((newNode = new YyxNode()) == null)
		{
			System.out.print("Error: memory out! (2)\n");
			System.exit(-1);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: newNode->m_rec = *rec;
		newNode.m_rec.copyFrom(rec);
		newNode.next = null;
		if (ln.n == 0)
		{
			ln.head = newNode;
			ln.tail = newNode;
		}
		else
		{
			ln.tail.next = newNode;
			ln.tail = newNode;
		}
		ln.n++;

		return ln;
	}

	public static int myCompare(record rec1, record rec2)
	{
		return rec2.total - rec1.total;
	}

	public static YyxNode Search(YyxLink ln, record rec)
	{
		YyxNode nd = ln.head;
		while (nd != null && myCompare(nd.m_rec, rec) != 0)
		{
			nd = nd.next;
		}

		return nd;
	}

	public static YyxLink ClearLink(YyxLink ln)
	{
		YyxNode delNode = ln.head;
		YyxNode nextNode;
		while (delNode != null)
		{
			nextNode = delNode.next;
			delNode = null;
			delNode = nextNode;
		}
		ln.n = 0;
		ln.head = null;
		ln.tail = null;

		return ln;
	}

	public static int Main()
	{
		YyxLink mainLn;
		record stu = new record();
		int n;
		int i;
		record max1;
		record max2;
		record max3;
		YyxNode temp;
		mainLn = CreateNewLink();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.stuID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu.YuWen = Short.parseShort(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu.math = Short.parseShort(tempVar4);
			}
			stu.total = stu.YuWen + stu.math;
			AddNode(mainLn, stu);
		}

		max1 = max2 = max3 = mainLn.head.m_rec;
		temp = mainLn.head;
		while (temp != null)
		{
			if (max1.total < temp.m_rec.total)
			{
				max1 = temp.m_rec;
			}
			temp = temp.next;
		}
		temp = mainLn.head;
		if (max2 == max1)
		{
			temp = mainLn.head.next;
			max2 = temp.m_rec;
		}
		while (temp != null)
		{
			if (max2.total < temp.m_rec.total)
			{
				if (max1 != temp.m_rec)
				{
					max2 = temp.m_rec;
				}
			}
			temp = temp.next;
		}
		temp = mainLn.head;
		while (temp.m_rec == max1 || temp.m_rec == max2)
		{
			temp = temp.next;
		}
		max3 = temp.m_rec;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


