public class book
{
	public int number;
	public String writer = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[26];
		int[] nu = new int[26];
		int a;
		int b;
		book head;
		book p1;
		book p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.writer = tempVar3.charAt(0);
			}
			for (j = 0;j < p1.writer.length();j++)
			{
				++num[p1.writer.charAt(j) - 65];
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
		}
		p2.next = null;
		for (i = 0;i < 26;i++)
		{
			nu[i] = i;
		}
		for (i = 0;i < 25;i++)
		{
			for (j = 0;j < 25 - i;j++)
			{
				if (num[j] < num[j + 1])
				{
					a = nu[j];
					nu[j] = nu[j + 1];
					nu[j + 1] = a;
					b = num[j];
					num[j] = num[j + 1];
					num[j + 1] = b;
				}
			}
		}
		System.out.printf("%c\n%d\n",nu[0] + 65,num[0]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < head.writer.length();j++)
			{
				if (head.writer.charAt(j) == (char)nu[0] + 65)
				{
					System.out.printf("%d\n",head.number);
					break;
				}
			}
			head = head.next;
		}
	}
}

