//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class patient
{
 public int num;
 public String hao = new String(new char[20]);
 public int age;
 public patient next;
}
public class ans
{
 public int numan;
 public String haoan = new String(new char[20]);
 public int agean;
 public ans nextan;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		patient head;
		patient p1;
		patient p2;
		ans headan;
		ans ans1;
		ans ans2;
		int i;
		int j;
		int max;
		int n;
		int shu;
		shu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = new patient();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.hao = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.age = Integer.parseInt(tempVar3);
		}
		p1.num = 1;
		head = p1;
		p2 = p1;
		for (i = 0;i < n - 1;i++)
		{
			p1 = new patient();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.hao = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
			p2.next = p1;
			p1.num = i + 2;
			p2 = p1;
		}
		p2.next = null;
		max = 0;
		p1 = head;
		for (j = 0;j < n;j++)
		{
			if (max < p1.age)
			{
				max = p1.age;
			}
			p1 = p1.next;
		}
		p1 = head;
		for (j = 0;j < n;j++)
		{
			if (max == p1.age)
			{
				ans1 = new ans();
				ans1.haoan = p1.hao;
				System.out.printf("%s\n",ans1.haoan);
				ans1.agean = max;
				headan = ans1;
				ans2 = ans1;
				p1.num = -1;
				p1.age = -1;
				shu = shu + 1;
				break;
			}
			p1 = p1.next;
		}
		for (i = 0;i < n - 1;i++)
		{
			max = 0;
			p1 = head;
			for (j = 0;j < n;j++)
			{
				if (max < p1.age)
				{
					max = p1.age;
				}
				p1 = p1.next;
			}
			if (max < 60)
			{
				break;
			}
			p1 = head;
			for (j = 0;j < n;j++)
			{
				if (max == p1.age)
				{
					ans1 = new ans();
					ans1.haoan = p1.hao;
					System.out.printf("%s\n",ans1.haoan);
					ans1.agean = max;
					headan = ans1;
					ans2 = ans1;
					p1.num = -1;
					p1.age = -1;
					shu = shu + 1;
					break;
				}
				p1 = p1.next;
			}
		}
		for (i = 0;i < n - shu;i++)
		{
			max = 101;
			p1 = head;
			for (j = 0;j < n;j++)
			{
				if (max > p1.num && p1.num != -1)
				{
					max = p1.num;
				}
				p1 = p1.next;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


