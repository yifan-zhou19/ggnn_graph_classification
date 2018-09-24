public class chushu
{
	public int num;
	public String s = new String(new char[30]);
	public chushu next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int n;
	public static int max;
	public static int hao;
	public static chushu create()
	{
		int j = 0;
		int q;
		int i = 0;
		int k = 0;

		chushu head;
		chushu p1;
		chushu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (chushu)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.s = tempVar2.charAt(0);
		}

		for (i = 0;p1.s.charAt(i) != '\0';i++)
		{
			j = p1.s.charAt(i) - 65;
			a[j] = a[j] + 1;
		}


		head = p1;
		p2 = p1;
		while (k < n - 1)
		{
			k++;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (chushu)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.s = tempVar4.charAt(0);
			}

			for (i = 0;p1.s.charAt(i) != '\0';i++)
			{
				j = p1.s.charAt(i) - 65;
				a[j] = a[j] + 1;
			}

			p2.next = p1;

		}
		p2 = p1;
		p2.next = null;
		return (head);
	}

	/*void print(struct chushu *head)
	{
	    struct chushu *p;
	    p=head;
		while(p!=NULL)
		{printf("%d\n",p->num);
		p=p->next;}
	}*/


	public static void search(chushu head)
	{
		int i;
		chushu p;
		p = head;
		while (p.next != null)
		{
			for (i = 0;p.s.charAt(i) != '\0';i++)
			{
				if (hao + 65 == p.s.charAt(i))
				{
				System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}
		for (i = 0;p.s.charAt(i) != '\0';i++)
		{
				if (hao + 65 == p.s.charAt(i))
				{
				System.out.printf("%d\n",p.num);
				}
		}
	}


	public static void Main()
	{
		int i;
		chushu p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = create();
		max = 0;
		//print(p);

	  for (i = 0;i < 26;i++)
	  {
			if (a[i] > max)
			{
				max = a[i];
				hao = i;
			}
	  }
		System.out.printf("%c\n",hao + 65);
		System.out.printf("%d\n",max);
		search(p);
	}

}

