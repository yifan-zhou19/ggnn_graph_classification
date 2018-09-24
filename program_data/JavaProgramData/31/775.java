//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class arr
{
	public String num = new String(new char[20]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[50]);
	public arr next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static arr create()
	{
		arr head;
		arr p1;
		arr p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (arr)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.address = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,"end") != 0)
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (arr)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.score = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
		}
		p2.next = null;
		return (head);
	}
	public static arr reverse(arr head)
	{
		arr p1;
		arr p2;
		arr p3;
		p1 = p2 = head;
		if (p1 != null && p1.next != null)
		{
			p1 = p1.next;
			p2.next = null;
			while (p1 != null && p1.next != null)
			{
				p3 = p1;
				p1 = p1.next;
				p3.next = p2;
				p2 = p3;
			}
			head = p1;
			p1.next = p2;
		}
		return (head);
	}
	public static void print(arr head)
	{
		int b;
		arr p1;
		p1 = head;
		while (p1 != null)
		{
			b = (int)p1.score;
			if (p1.score - b == 0.0)
			{
			System.out.printf("%s %s %c %d %d %s\n",p1.num,p1.name,p1.sex,p1.age,b,p1.address);
			}
			else
			{
				System.out.printf("%s %s %c %d %.1f %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			}
			p1 = p1.next;
		}
	}

	public static void freelist(arr head)
	{
			arr p = head;
			while (p != null)
			{
				head = head.next;
				p = null;
				p = head;
			}
	}
	public static void Main()
	{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


