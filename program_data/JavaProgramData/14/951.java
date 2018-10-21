public class Stu
{
	public int StuNo;
	public int Chinese;
	public int math;
	public int sum;
	public Stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		Stu p;
		Stu head;
		Stu tail;
		int n;
		int i;
		int max1;
		int max2;
		int max3;
		int n1;
		int n2;
		int n3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = tail = null;
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (Stu)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.StuNo = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.Chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.math = Integer.parseInt(tempVar4);
			}
			if (head == null)
			{
				head = tail = p;
			}
			else
			{
				tail.next = p;
				tail = p;
			}
			p.sum = p.Chinese + p.math;
		}

		max1 = head.sum;
		n1 = 1;
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				p = head;
			}
		 else
		 {
			 p = p.next;
		 }
			if ((p.sum) > max1)
			{
				max1 = p.sum;
				n1 = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				p = head;
			}
		 else
		 {
			 p = p.next;
		 }
		 if (i == n1)
		 {
			 p.sum = 0;
		 }
		}

		max2 = head.sum;
		n2 = 1;
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				p = head;
			}
		 else
		 {
			 p = p.next;
		 }
			if ((p.sum) > max2)
			{
				max2 = p.sum;
				n2 = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				p = head;
			}
		 else
		 {
			 p = p.next;
		 }
		 if (i == n2)
		 {
			 p.sum = 0;
		 }
		}


		max3 = head.sum;
		n3 = 1;
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				p = head;
			}
		 else
		 {
			 p = p.next;
		 }
			 if ((p.sum) > max3)
			 {
				 max3 = p.sum;
				 n3 = i;
			 }
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",n1,max1,n2,max2,n3,max3);
	}

}

