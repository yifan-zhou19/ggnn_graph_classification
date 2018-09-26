//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

// 10000.cpp : ??????????????
//

///#include<StdAfx.h>
public class node
{
	public char data;
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] l = {0, 0};
	public static int k = 0;
	public static int n;
	public static node create()
	{
		node p1;
		node p2;
		node head;
		head = null_Renamed;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (node)malloc(len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (node)malloc(len);
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			p1.data = tempVar.charAt(0);
		}
		head = null_Renamed;
		while (p1.data != '\n')
		{
			l[k]++;
			if (l[k] == 1)
			{
			head = p1;
			}
			else
			{
			p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (node)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				p1.data = tempVar2.charAt(0);
			}
		}
		k++;
		p2.next = null_Renamed;
		return (head);
	}
	public static node add(node s1, node s2)
	{
		node p1;
		node p2;
		node ans;
		node p;
		node pp;
		ans = null_Renamed;
		p1 = s1;
		p2 = s2;
		int i;
		int j;
		int a;
		int b;
		int c = 0;
		int d;
		n = l[0] > l[1] != 0?l[0]:l[1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (node)malloc(len);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < l[0] - i - 1;j++)
			{
			p1 = p1.next;
			}
			for (j = 0;j < l[1] - i - 1;j++)
			{
			p2 = p2.next;
			}
			a = i >= l[0] != 0?0:p1.data - '0';
			b = i >= l[1] != 0?0:p2.data - '0';
			d = (a + b + c) % 10;
			c = (a + b + c) / 10;
			p.data = d + '0';
			if (i == 0)
			{
			ans = p;
			}
			else
			{
			pp.next = p;
			}
			pp = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (node)malloc(len);
			p1 = s1;
			p2 = s2;
		}
		if (c == 1)
		{
			 p.data = '1';
			 pp.next = p;
			 pp = p;
			 n++;
		}
		pp.next = null_Renamed;
		return (ans);
	}
	public static void put(node head)
	{
		node p;
		p = head;
		int i;
		int flag = 0;
		for (;n != 0;)
		{
			for (i = 0;i < n - 1;i++)
			{
			p = p.next;
			}
			if (flag == 0 && p.data == '0')
			{
				 p = head;
				 n--;
				continue;
			}
			//if (flag==1)
		   // {
				System.out.printf("%c",p.data);
				flag = 1;
			//}

			p = head;
			n--;
		}
		if (flag == 0)
		{
		System.out.print("0");
		}
	}
	 public static int Main()
	{
		node s1;
		node s2;
		node ans;
		s1 = create();
		s2 = create();
		ans = add(s1, s2);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


