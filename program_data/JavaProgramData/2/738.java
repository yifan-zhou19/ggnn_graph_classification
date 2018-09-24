public class book
{
public int number;
public String a = new String(new char[26]);
public int la;
public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book insert(book head, book temp)
	{
	book p0;
	book p1;
	book p2;
	p1 = head;
	p0 = temp;
	if (head == null)
	{
		 head = p0;
		 p0.next = null;
	}
	else
	{
	 while (p1.next != null)
	 {
		 p1 = p1.next;
	 }
	 p1.next = p0;
	 p0.next = null;
	}
	return head;
	}



	public static void Main()
	{
	book p;
	book temp;
	book head = null;
	int i;
	int m;
	int max;
	int[] b = new int[26];
	char writer;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
	temp = new book();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		temp.number = Integer.parseInt(tempVar2);
	}
	temp.a = new Scanner(System.in).nextLine();

	temp.la = temp.a.length();
	temp.next = null;
	head = insert(head, temp);
	}

	p = head;
	while (p != null)
	{
	for (i = 0;i < p.la;i++)
	{
	b[p.a.charAt(i) - 65]++;
	}
	p = p.next;

	}
	max = b[0];
	writer = 65;
	for (i = 0;i < 26;i++)
	{
	 if (b[i] > max)
	 {
	  max = b[i];
	  writer = i + 65;
	 }
	}

	System.out.printf("%c\n%d\n",writer,max);

	p = head;
	while (p != null)
	{
	for (i = 0;i < p.la;i++)
	{
	if (p.a.charAt(i) == writer)
	{
		System.out.printf("%d\n",p.number);
		break;
	}
	}
	p = p.next;
	}



	}
}

