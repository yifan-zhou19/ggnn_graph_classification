public class book
{
	public String writer = new String(new char[26]);
	public int num;
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat()
	{
		book head;
		book p1;
		book p2;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p1 = p2 = new book();
		head = null;
		for (i = 0;i < m;i++)
		{
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new book();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.writer = tempVar3.charAt(0);
			}
			p1.next = null;
		}
		p2.next = p1;
		return (head);
	}
	public static void Main()
	{
		int n;
		int[][] a = new int[26][1000];
		int[] b = new int[26];
		int i;
		int max;
		int k;
		book head;
		book p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		head = creat();
		for (p = head.next;p != null;p = p.next)
		{
			n = p.writer.length();
			for (i = 0,q = p.writer;i < n;i++,q++)
			{
				a[*q - 65][b[*q - 65]] = p.num;
				b[*q - 65]++;
			}
		}
		max = b[0];
		k = 0;
		for (i = 0;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",k + 65,max);
		for (i = 0;i < max;i++)
		{
			System.out.printf("%d\n",a[k][i]);
		}
	}
}

