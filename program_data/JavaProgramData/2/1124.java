public class stu
{
	public int num;
	public String c = new String(new char[26]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu create()
	{
		stu p1;
		stu p2;
		stu head;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.c = tempVar3.charAt(0);
		}
		p2 = p1;
		head = p1;

		while (m - 1 != 0)
		{
			m--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.c = tempVar5.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return head;
	}

	public static void print(stu head, int z)
	{
		stu q;
		int i;
		int k;
		String s = new String(new char[20]);
		final String s0 = "";
		q = head;
		while (q != null)
		{
			s = q.c;
			k = s.length();
			for (i = 0;i < k;i++)
			{
				if (s.charAt(i) == z + 65)
				{
					System.out.printf("%d\n",q.num);
					break;
				}
			}
			s = s0;
			q = q.next;
		}
	}

	public static void Main()
	{
		int index;
		int[] a = new int[26];
		int k;
		int t;
		int i;
		int max = 0;
		String s = new String(new char[20]);
		final String s0 = "";
		stu p;
		stu head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));

		head = create();
		p = head;

		while (p != null)
		{
			s = p.c;
			k = s.length();
			for (i = 0;i < k;i++)
			{
				t = s.charAt(i) - 65;
				a[t]++;
			}
			s = s0;
			p = p.next;
		}

		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				index = i;
			}
		}
		System.out.printf("%c\n%d\n",index + 65,max);
		print(head, index);
	}


}

