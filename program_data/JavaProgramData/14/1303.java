public class student
	{
		public int num;
		public int chi;
		public int math;
		public int sum;
		public student next;
	}

package <missing>;

public class GlobalMembers
{
		public static student creat(int n)
		{
			int i;
		student head;
		student p1;
		student p2;

		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chi = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.chi + p1.math;

		head = p1;
		p2 = p1;

		for (i = 1;i < n;i++)
		{
			p1 = new student();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chi = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.chi + p1.math;
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
			student max1;
			student max2;
			student max3;
			int n;
			int max;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}

			head = creat(n);

			p1 = head;
			max = 0;
			while (p1 != null)
			{
				if (p1.sum > max)
				{
					max = p1.sum;
					max1 = p1;
				}
				p1 = p1.next;
			}
			System.out.printf("%d %d\n",max1.num,max1.sum);

			p1 = head;
			max = 0;
			while (p1 != null)
			{
				if (p1.sum > max && p1 != max1)
				{
					max = p1.sum;
					max2 = p1;
				}
				p1 = p1.next;
			}
			System.out.printf("%d %d\n",max2.num,max2.sum);

			p1 = head;
			max = 0;
			while (p1 != null)
			{
				if (p1.sum > max && p1 != max1 && p1 != max2)
				{
					max = p1.sum;
					max3 = p1;
				}
				p1 = p1.next;
			}
			System.out.printf("%d %d\n",max3.num,max3.sum);
		}


			/*if(n<3)      
			{
				int max=0;                //???????????????????????????p=a?????????...
				if(*/

}

