public class queue
{
	public String ID = new String(new char[11]);
	public int age;
	public number next;
}

package <missing>;

public class GlobalMembers
{
	public static int r = 1;
	public static queue AppendNewNode(int n)
	{

		queue head = null;
		queue newNode;
		queue thisNode;
		do
		{
			newNode = (number) new queue();
			if (r == 1)
			{
				head = newNode;
				thisNode = head;
			}
			else
			{
				thisNode.next = newNode;
			}
			if (r <= n)
			{
				thisNode = newNode;
				r++;
			}
		}while (r <= n);
		thisNode.next = null;
		return (head);
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int temp;
		final String temp_2 = "";
		queue head;
		queue p;
		queue pf;
		queue temp_1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		head = AppendNewNode(n);
		p = head;
	  while (p != null)
	  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			p = p.next;
	  }
	  p = head;
	 // p=p->next;
	   //  printf("%d\n",p->age);
	for (i = 0;i < n;i++)
	{
			a[i] = p.age;
			p = p.next;
	}
		 //printf("%d\n",a[1]);
	 p = head;
	 pf = head;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j + 1] >= 60 && a[j] < a[j + 1])
					{
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					pf = p.next;
					temp = p.age;
					p.age = pf.age;
					pf.age = temp;
					temp_2 = p.ID;
					p.ID = pf.ID;
					pf.ID = temp_2;
					p = p.next;
					}
					else
					{
						p = p.next;
					}
				}
			   p = head;
			}

		p = head;
	   //  printf("%d\n",p->age);

		while (p != null)
		{
			System.out.printf("%s\n",p.ID);
			p = p.next;

		}

	}
}

