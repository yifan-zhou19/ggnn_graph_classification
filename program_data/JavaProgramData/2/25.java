public class shu
{
	public String xh = new String(new char[100]); //??
	public String zz = new String(new char[100]);
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[26];
	public static int m;
	public static shu creat(int n)
	{
		int i = 0;
		shu p1;
		shu p2;
		shu head;
		p1 = p2 = new shu();
		head = null;
		while (i < n)
		{
			i++;
			if (i == 1)
			{
				p1.next = null;
				head = p1;
			}
			else
			{
				p2 = p1;
				p1 = new shu();
				p1.next = p2.next;
				p2.next = p1;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.xh = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.zz = tempVar2.charAt(0);
			}
		}
		return head;
	}
	public static void max(shu head)
	{
		shu p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * f;
		int i;
		int zd = 0;
		for (p = head;p != 0;p = p.next) //??p++
		{
			for (f = p.zz; * f != '\0';f++)
			{
				num[*f - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] > zd)
			{
				zd = num[i];
				m = i;
			}
		}
		System.out.printf("%c\n",65 + m);
		System.out.printf("%d\n",zd); //???????
	}

	public static void print(head UnnamedParameter)
	{
		shu p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * f;
		for (p = head;p != 0;p = p.next) //????p++
		{
			for (f = p.zz; * f != '\0';f++)
			{
				if (*f == 65 + m)
				{
					System.out.printf("%s\n",p.xh);
					break;
				}
			}
		}
	}




	public static void Main()
	{
		int n;
		shu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		max(head);
		print(head);
	}

}

