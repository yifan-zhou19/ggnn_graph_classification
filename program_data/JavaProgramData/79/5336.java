public class monkey
{
public int a;
public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	monkey creat = new monkey(int n);
	monkey delet = new monkey(struct monkey * head,int m,int n);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (n != 0)
	{
	do
	{
		if (m != 1)
		{
			monkey head;
	head = creat(n);
	head = delet(head, m, n);
	System.out.printf("%d\n",head.a);
		}
		else
		{
			System.out.printf("%d\n",n);
		}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	} while (n != 0);
	}




	return 0;
	}



	public static monkey creat(int n)
	{
	monkey p1;
	monkey p2;
	monkey head;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	head = p1 = (monkey)malloc(LEN);
	for (i = 0;i < n;i++)
	{
	p1.a = i + 1;
	p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (monkey)malloc(LEN);
	p2.next = p1;

	}
	p2.next = head;

	return (head);
	}
	public static monkey delet(monkey head, int m, int n)
	{
	  monkey p2 = head;
	  int i;
		while (head.next != head)
		{

	  if ((m != 2) && (m <= n))
	  {
		  for (i = 0;i < m - 1;i++)
		  {
		  p2 = head;
		  head = head.next;

		  }
		  p2.next = head.next;
	  head = head.next;
	  }
	  else
	  {
		  if (m > n)
		  {
			   for (i = 0;i < m - 1;i++)
			   {
		  p2 = head;
		  head = head.next;

			   }

		  p2.next = head.next;
		  head = head.next;
		  }
		  else
		  {
		  p2 = head;
		  head = head.next;
		  p2.next = head.next;
		  head = head.next;
		  }
	  }
	  n = n - 1;
		}
	return (head);
	}
}

