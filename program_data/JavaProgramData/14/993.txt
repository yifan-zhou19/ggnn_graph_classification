public class student
{
	public int num;
	public int chinese;
	public int maths;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int max0;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		p1 = p2 = new student();
		head = p1;
		for (i = 1;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.chinese = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.maths = Integer.parseInt(tempVar3);
			}
			p1 = new student();
			p2.next = p1;
			p2 = p1;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.num = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.chinese = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.maths = Integer.parseInt(tempVar6);
		}
		p2.next = p1;
		p1.next = null;
		return head;
	}
	/*struct student *sort(struct student *head)
	{
		struct student *p1,*p2,*temp;
		temp=(struct student *)malloc(sizeof(struct student));
		for(p1=head;p1!=NULL;p1=p1->next)
	    for(p2=p1->next;p2!=NULL;p2=p2->next)
			if(p1->chinese+p1->maths<p2->chinese+p2->maths)
			{	temp->num=p1->num;
			    temp->chinese=p1->chinese;
				temp->maths=p1->maths;
				p1->num=p2->num;
			    p1->chinese=p2->chinese;
				p1->maths=p2->maths;
				p2->num=temp->num;
			    p2->chinese=temp->chinese;
				p2->maths=temp->maths;}
			return head;
	}*/
	public static void max(student head, int x, int y)
	{
		student p1;
		student temp;
		student p2;
		temp = new student();
		temp.chinese = temp.maths = 0;
		for (p2 = head;p2 != null;p2 = p2.next)
		{
			if (p2.chinese + p2.maths == x)
			{
				break;
			}
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			if ((p1.chinese + p1.maths > temp.chinese + temp.maths) && (p1.chinese + p1.maths != x || p1.chinese + p1.maths == x && p1.num != p2.num) && (p1.chinese + p1.maths != y))
			{
				temp.chinese = p1.chinese;
					temp.maths = p1.maths;
					temp.num = p1.num;
			}
		}
			max0 = temp.chinese + temp.maths;
		 System.out.printf("%d %d\n",temp.num,max0);
	}
	public static int Main()
	{
		student head;
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		max(head, 0, 0);
		max1 = max0;
		max(head, max1, 0);
		max2 = max0;
		max(head, max1, max2);
	}
}

