public class book
{
	public int num;
	public String writer = new String(new char[26]);
	public book next;
}
		i = 0,p = head;
	i = 0,p = head;

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n; //a[i]???????0
		int i;
		int j;
		int[] a = new int[26];
		int max;
		int temp;
		char c;
		book p;
		book head;
		book tail;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		tail = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (book)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.writer = tempVar3.charAt(0);
			}
			if (head == null) //???????????=??????????????????
			{
				head = tail = p;
			}
			else
			{
				tail.next = p;
				tail = p;
			}
		}
		for (c = 'A';c <= 'Z';c++)
		{
			for (i = 0,p = head;i < n;i++,p = p.next)
			{
				for (j = 0;p.writer.charAt(j) != '\0';j++)
				{
					if (p.writer.charAt(j) == c)
					{
						a[c - 'A']++; //????break,??????
					}
				}
			} //??a[26]????????????????????????????????????????????????????????????
		}
		max = a[0];
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] == max)
			{
				break;
			}
		}
		c = i + 'A';
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",a[i]);
		for (i = 0,p = head;i < n;i++,p = p.next)
		{
				for (j = 0;p.writer.charAt(j) != '\0';j++)
				{
					if (p.writer.charAt(j) == c)
					{
						System.out.printf("%d\n",p.num);
						break;
					}
				}
		}
	}
}

