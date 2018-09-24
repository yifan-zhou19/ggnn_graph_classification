public class s
{
	public int h; //??????????
	public String z = new String(new char[1000]);
	public s next;
}

package <missing>;

public class GlobalMembers
{
	public static s create(int n)
	{
		s head;
		s p1;
		s p2;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (s)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.z = tempVar2.charAt(0);
		}
		head = null;
		while (i < n - 1) //???????
		{
			i++;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
			p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (s)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.h = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.z = tempVar4.charAt(0);
			}
		}
		p2.next = p1;
		p1.next = null;
		return head;
	}

	public static void Main()
	{
		int m;
		int i;
		int n;
		int[] num = new int[26];
		int j;
		s p1;
		s head;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		p1 = head;
		for (i = 0;i < n;i++)
		{
			for (p2 = p1.z; * p2 != '\0';p2++)
			{
				j = p2 - 65;
				num[j]++;
			}
			p1 = p1.next;
		}
		m = num[0];
		j = 0;
		for (i = 0;i < 26;i++)
		{
			if (num[i] > m)
			{
				m = num[i];
				j = i;
			}
		}
		c = j + 65;
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",num[j]);
		p1 = head;
		for (i = 0;i < n;i++)
		{
			for (p2 = p1.z; * p2 != '\0';p2++)
			{
				if (*p2 == c)
				{
					System.out.printf("%ld\n",p1.h);
					break;
				}
			}
			p1 = p1.next;
		}
	}

}

