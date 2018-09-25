//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class book
{
	public int number;
	public String author = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int i;
	public static book creat()
	{
		book head;
		book p1;
		book p2;
		int i = 1;
		p1 = p2 = new book();
		head = p1;
		for (i = 1;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.number = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.author = tempVar2.charAt(0);
			}
			p1 = new book();
			p2.next = p1;
			p2 = p1;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.number = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.author = tempVar4.charAt(0);
		}
		p2.next = p1;
		p1.next = null;
		return head;
	}
	public static int Main()
	{
		book head;
		book p;
		int j;
		int[] a = new int[26];
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat();
		for (p = head;p != null;p = p.next)
		{
		for (i = 0;i < p.author.length();i++)
		{
			switch (p.author.charAt(i))
		{
		case 'A':
			a[0]++;
			break;
		case 'B':
			a[1]++;
			break;
		case 'C':
			a[2]++;
			break;
		case 'D':
			a[3]++;
			break;
		case 'E':
			a[4]++;
			break;
		case 'F':
			a[5]++;
			break;
		case 'G':
			a[6]++;
			break;
		case 'H':
			a[7]++;
			break;
		case 'I':
			a[8]++;
			break;
		case 'J':
			a[9]++;
			break;
		case 'K':
			a[10]++;
			break;
		case 'L':
			a[11]++;
			break;
		case 'M':
			a[12]++;
			break;
		case 'N':
			a[13]++;
			break;
		case 'O':
			a[14]++;
			break;
		case 'P':
			a[15]++;
			break;
		case 'Q':
			a[16]++;
			break;
		case 'R':
			a[17]++;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


