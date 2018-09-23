public class student
{
	public int id;
	public String name = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static student creat()
	{
		int i = 1;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.name = tempVar3.charAt(0);
		}
		head = null;
		for (;i < m;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.id = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.name = tempVar5.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}

	public static void Main()
	{
		student head;
		student p1;
		int[] num = new int[30];
		int max;
		int j;
		char i;
		char auth;
		head = creat();

		for (p1 = head;p1 != null;p1 = p1.next)
		{
			for (i = 'A';i <= 'Z';i++)
			{
				for (j = 0;j < p1.name.length();j++)
				{
					if (p1.name.charAt(j) == i)
					{
					num[i - 'A']++;
					}
				}
			}
		}
		for (i = 0,max = 0;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				auth = i + 'A';
			}
		}
		System.out.printf("%c\n",auth);
		System.out.printf("%d\n",max);
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			for (j = 0;j < p1.name.length();j++)
			{
				if (p1.name.charAt(j) == auth)
				{
				System.out.printf("%d\n",p1.id);
				}
			}
		}
	}



}

