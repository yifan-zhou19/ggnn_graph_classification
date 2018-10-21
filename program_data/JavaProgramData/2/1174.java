public class book
{
	public int num;
	public String author = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		int[] a = new int[26];
		int sum = 0;
		for (j = 0;j < 26;j++)
		{
			a[j] = 0;
		}
		char aut;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book head;
		book pb1;
		book pb2;
		head = null;
		for (i = 0;i < m;i++)
		{
			pb1 = new book();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pb1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pb1.author = tempVar3.charAt(0);
			}
			for (j = 0;pb1.author.charAt(j) != '\0';j++)
			{
				k = pb1.author.charAt(j) - 'A';
				a[k] += 1;
			}
			if (head == null)
			{
				head = pb1;
				pb2 = pb1;
				pb2.next = null;
			}
			else
			{
				pb2.next = pb1;
				pb2 = pb1;
				pb2.next = null;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (a[j] > sum)
			{
				sum = a[j],k = j;
			}
		}
		aut = (char)('A' + k);
		System.out.printf("%c\n",aut);
		System.out.printf("%d\n",sum);
		pb1 = head;
		while (pb1 != null)
		{
			for (j = 0;pb1.author.charAt(j) != '\0';j++)
			{
				if (pb1.author.charAt(j) == aut)
				{
					System.out.printf("%d\n",pb1.num);
				}
			}
			pb1 = pb1.next;
		}
	}


}

