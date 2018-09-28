public class node
{
	public int data;
	public node next;
}

public class link
{
   public node head;
   public node tail;
}

package <missing>;

public class GlobalMembers
{
	//allocate a node for the link
	public static int init_link(link plink)
	{
		node p = new node(); //dynamic allocate memory
		if (p == null)
		{
			return -1;
		}
		p.data = 0;
		p.next = null;
		plink.head = p;
		plink.tail = p;
		return 0;
	}

	//insert a node with data = value at the end of the list 
	public static int insert_link(link plink, int value)
	{
		node p = new node(); //dynamic allocate memory
		if (p == null)
		{
			return -1;
		}
		p.data = value;
		p.next = null;
		plink.tail.next = p;
		plink.tail = p;

		return 0;
	}

	//delete the next node of *pnode from the linklist
	//if  *pnode is the last node then delete the first node
	public static int delete_link(link plink, node pnode)
	{
		// if delete the first node
		//if ( plink->head == pnode ) 
		node p = pnode.next;
		if (p == null)
		{ //delete the first node
		  pnode = plink.head;
		  p = plink.head.next;
		  pnode.next = pnode.next.next;
		}
		else if (plink.tail == p)
		{
		  pnode.next = null;
		  plink.tail = pnode;
		}
		else
		{
		  pnode.next = pnode.next.next;
		}

		p = null;
		return 0;

	}

	public static int destroy_link(link plink)
	{
		node p = plink.head;
		node q;
		while (p != null)
		{
		   q = p.next;
		   p = null;
		   p = q;
		}
		plink.head = null;
		plink.tail = null;
		return 0;
	}

	// slove problem 
	// n the number of monkeys
	// m the count number
	public static int solve(int n,int m)
	{
		int i;
		int j;
		int result;
		link link1 = new link();
		node p;
		// p mark the position count begins
		// p mark the position to delete
		// p point to the pre node of the node to be deleted
		init_link(link1);
		for (i = 1;i <= n;i++)
		{
			insert_link(link1, i);
		}
		p = link1.head;
		for (i = 1;i < n;i++)
		{
			//count
			for (j = 1;j < m;j++)
			{
			   if (p.next == null)
			   {
				  p = link1.head.next;
			   }
			   else
			   {
				  p = p.next;
			   }
			}
			//delete
			delete_link(link1, p);
		}
		// at last left one 
		result = link1.head.next.data;
		destroy_link(link1);
		return result;

	}

	public static int Main()
	{
		int n;
		int m;
		int k;
		link link1 = new link();
		node p;
		init_link(link1);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0 || m != 0)
		{
			k = solve(n, m);
			insert_link(link1, k);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		p = link1.head;
		while (p.next != null)
		{
			System.out.printf("%d\n",p.next.data);
			p = p.next;
		}
		destroy_link(link1);

		return 0;
	}
}

