//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct Node;
public class Node
{
	public int av;
	public int py;
	public int thesis;
	public int sum;
	public String name = new String(new char[20]);
	public char west;
	public char gb;
	public Node next;
}

package <missing>;

public class GlobalMembers
{
	public static Node create()
	{
		Node p;
		p = new Node();
		p.next = null;
		return p;
	}
	public static int Main()
	{
		int i;
		int n;
		int max;
		int sum = 0;
		Node q = null;
		Node p = null;
		Node head = null;
		Node maxn = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create();
		q = head;
		for (i = 1;i <= n;i++)
		{
			p = new Node();
		if (p != null)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (p.name) = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (p.av) = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 (p.py) = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 (p.gb) = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 (p.west) = tempVar6.charAt(0);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 (p.thesis) = Integer.parseInt(tempVar7);
		 }
		 p.sum = 0;
		 if (p.av > 80 && p.thesis > 0)
		 {
				p.sum += 8000;
		 }
		 if (p.av > 85 && p.py > 80)
		 {
				p.sum += 4000;
		 }
		 if (p.av > 90)
		 {
				p.sum += 2000;
		 }
		 if (p.av > 85 && p.west == 'Y')
		 {
				p.sum += 1000;
		 }
		 if (p.py > 80 && p.gb == 'Y')
		 {
				p.sum += 850;
		 }
		 p.next = null;
		 q.next = p;
		 sum += p.sum;
		 q = p;
		}
		}
		maxn = head.next;
		p = head.next;
		while (true)
		{
			 if (p.sum > maxn.sum)
			 {
			 maxn = p;
			 }
			 if (p.next == null)
			 {
				 break;
			 }
			 p = p.next;
		}
		System.out.printf("%s\n%d\n%d", maxn.name,maxn.sum,sum);

		return 0;
	}
}

