//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class library
{
	public int num;
	public String aut = new String(new char[30]);
	public library next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] a = new int[30];
		int t;
		int[] b = new int[30];
		int x = 0;
		char name;
		library head;
		library p1;
		library p2;
		library p;
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (library) malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.aut = tempVar3.charAt(0);
		}
		head = p1;
		p2 = p1;
		for (i = 0;i < m - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (library) malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.aut = tempVar5.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p1.next = null;
		p = head;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (p.aut.charAt(j) == 'A')
				{
					a[0] = a[0] + 1;
				}
				if (p.aut.charAt(j) == 'B')
				{
					a[1] = a[1] + 1;
				}
				if (p.aut.charAt(j) == 'C')
				{
					a[2] = a[2] + 1;
				}
				if (p.aut.charAt(j) == 'D')
				{
					a[3] = a[3] + 1;
				}
				if (p.aut.charAt(j) == 'E')
				{
					a[4] = a[4] + 1;
				}
				if (p.aut.charAt(j) == 'F')
				{
					a[5] = a[5] + 1;
				}
				if (p.aut.charAt(j) == 'G')
				{
					a[6] = a[6] + 1;
				}
				if (p.aut.charAt(j) == 'H')
				{
					a[7] = a[7] + 1;
				}
				if (p.aut.charAt(j) == 'I')
				{
					a[8] = a[8] + 1;
				}
				if (p.aut.charAt(j) == 'J')
				{
					a[9] = a[9] + 1;
				}
				if (p.aut.charAt(j) == 'K')
				{
					a[10] = a[10] + 1;
				}
				if (p.aut.charAt(j) == 'L')
				{
					a[11] = a[11] + 1;
				}
				if (p.aut.charAt(j) == 'M')
				{
					a[12] = a[12] + 1;
				}
				if (p.aut.charAt(j) == 'N')
				{
					a[13] = a[13] + 1;
				}
				if (p.aut.charAt(j) == 'O')
				{
					a[14] = a[14] + 1;
				}
				if (p.aut.charAt(j) == 'P')
				{
					a[15] = a[15] + 1;
				}
				if (p.aut.charAt(j) == 'Q')
				{
					a[16] = a[16] + 1;
				}
				if (p.aut.charAt(j) == 'R')
				{
					a[17] = a[17] + 1;
				}
				if (p.aut.charAt(j) == 'S')
				{
					a[18] = a[18] + 1;
				}
				if (p.aut.charAt(j) == 'T')
				{
					a[19] = a[19] + 1;
				}
				if (p.aut.charAt(j) == 'U')
				{
					a[20] = a[20] + 1;
				}
				if (p.aut.charAt(j) == 'V')
				{
					a[21] = a[21] + 1;
				}
				if (p.aut.charAt(j) == 'W')
				{
					a[22] = a[22] + 1;
				}
				if (p.aut.charAt(j) == 'X')
				{
					a[23] = a[23] + 1;
				}
				if (p.aut.charAt(j) == 'Y')
				{
					a[24] = a[24] + 1;
				}
				if (p.aut.charAt(j) == 'Z')
				{
					a[25] = a[25] + 1;
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


