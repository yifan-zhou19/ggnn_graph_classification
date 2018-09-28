//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public int num;
	public int score1;
	public int score2;
	public String name = new String(new char[50]);
	public char west;
	public char ganbu;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student create()
	{
		int i;
		int j;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score2 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.ganbu = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.west = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.num = Integer.parseInt(tempVar6);
		}
		while (true)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (i == n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.score1 = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.score2 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.ganbu = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.west = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.num = Integer.parseInt(tempVar12);
			}
			i++;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x;
		int x;
		int amount;
		int max;
		String y = new String(new char[50]);
		student head;
		student p1;
		student p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create();
		p1 = p2 = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		x = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		y = (char[50])calloc(100,50 * (Character.SIZE / Byte.SIZE));
		i = 0;
		while (p1 != null)
		{
			*(x + i) = 0;
			if (p1.score1 > 80 && p1.num > 0)
			{
				*(x + i) = *(x + i) + 8000;
			}
			if (p1.score1 > 85 && p1.score2 > 80)
			{
				*(x + i) = *(x + i) + 4000;
			}
			if (p1.score1 > 90)
			{
				*(x + i) = *(x + i) + 2000;
			}
			if (p1.score1 > 85 && p1.west == 'Y')
			{
				*(x + i) = *(x + i) + 1000;
			}
			if (p1.score2 > 80 && p1.ganbu == 'Y')
			{
				*(x + i) = *(x + i) + 850;
			}
			*(y.Substring(i)) = p1.name;
			p1 = p1.next;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


