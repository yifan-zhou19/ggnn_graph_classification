public class student
{
	public int num;
	public String name = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
			student p1;
			student p2;
			student head;
			int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = p2 = (student)malloc(len);
			head = null;
			i = 0;
			while (i < n)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p1.num = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					p1.name = tempVar2.charAt(0);
				}
				i = i + 1;
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
				p1 = (student)malloc(len);
			}
			p2.next = null;
			return head;
	}
	public static void Main()
	{
		int i;
		student head;
		student p;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		int[] a = new int[26];
		for (i = 0; i < 26; i++)
		{
			a[i] = 0;
		}
		while (p != null)
		{
			for (i = 0;i < 20;i++)
			{
				a[(int)p.name.charAt(i) - 'A']++;
			}
			p = p.next;
		}
		int number;
		int max = 0;
		for (i = 0; i < 26; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				number = i;
			}
		}
		System.out.printf("%c\n", 'A' + number);
		System.out.printf("%d\n", max);
		p = head;
		while (p != null)
		{
			for (i = 0;i < 20;i++)
			{
				if (p.name.charAt(i) == 'A' + number)
				{
					break;
				}
			}
			if (p.name.charAt(i) == 'A' + number)
			{
			System.out.printf("%d\n", p.num);
			}
			p = p.next;
		}
	}



}

