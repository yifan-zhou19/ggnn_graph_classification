public class stu
{
	public int n;
	public String name = new String(new char[27]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		stu head;
		stu p1;
		stu p2;
		stu p3;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.name = tempVar3.charAt(0);
		}
		int i = 0;
		for (;i < m - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (stu)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p2.n = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p2.name = tempVar5.charAt(0);
			}
			p1.next = p2;
			p1 = p2;
		}
		p2.next = null;
		int[] sum = new int[26];
		for (i = 0;i < 26;i++)
		{
			sum[i] = 0;
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = p1.name;
			while (*p != '\0')
			{
				int a = p;
				sum[a - 65] = sum[a - 65] + 1;
				p = p + 1;
			}
		}
		int max = sum[0];
		char j = 'A';
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				j = i + 65;
			}
		}
		System.out.printf("%c\n%d\n",j,max);
		for (p1 = head;p1 != null;p1 = p1.next)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = p1.name;
			for (; * p != '\0';p++)
			{
			if (*p == j)
			{
				System.out.printf("%d\n",p1.n);
				break;
			}
			}
		}
	}

}

