//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public int num;
	public String name = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return (head);

	}

	public static void Main()
	{
		student head;
		student p1;
		String p2;
		int i;
		int[] a = new int[26];
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p1 = head;
		do
		{
			p2 = p1.name;
			for (; p2 != '\0';p2++)
			{
				if (p2 == 'A')
				{
					a[0] = a[0] + 1;
				}
				if (p2 == 'B')
				{
					a[1] = a[1] + 1;
				}
				if (p2 == 'C')
				{
					a[2] = a[2] + 1;
				}
				if (p2 == 'D')
				{
					a[3] = a[3] + 1;
				}
				if (p2 == 'E')
				{
					a[4] = a[4] + 1;
				}
				if (p2 == 'F')
				{
					a[5] = a[5] + 1;
				}
				if (p2 == 'G')
				{
					a[6] = a[6] + 1;
				}
				if (p2 == 'H')
				{
					a[7] = a[7] + 1;
				}
				if (p2 == 'I')
				{
					a[8] = a[8] + 1;
				}
				if (p2 == 'J')
				{
					a[9] = a[9] + 1;
				}
				if (p2 == 'K')
				{
					a[10] = a[10] + 1;
				}
				if (p2 == 'L')
				{
					a[11] = a[11] + 1;
				}
				if (p2 == 'M')
				{
					a[12] = a[12] + 1;
				}
				if (p2 == 'N')
				{
					a[13] = a[13] + 1;
				}
				if (p2 == 'O')
				{
					a[14] = a[14] + 1;
				}
				if (p2 == 'P')
				{
					a[15] = a[15] + 1;
				}
				if (p2 == 'Q')
				{
					a[16] = a[16] + 1;
				}
				if (p2 == 'R')
				{
					a[17] = a[17] + 1;
				}
				if (p2 == 'S')
				{
					a[18] = a[18] + 1;
				}
				if (p2 == 'T')
				{
					a[19] = a[19] + 1;
				}
				if (p2 == 'U')
				{
					a[20] = a[20] + 1;
				}
				if (p2 == 'V')
				{
					a[21] = a[21] + 1;
				}
				if (p2 == 'W')
				{
					a[22] = a[22] + 1;
				}
				if (p2 == 'X')
				{
					a[23] = a[23] + 1;
				}
				if (p2 == 'Y')
				{
					a[24] = a[24] + 1;
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


