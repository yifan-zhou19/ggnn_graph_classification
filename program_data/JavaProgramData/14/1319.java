public class stu
{
	public int num;
	public int ch;
	public int ma;
	public int tot;

	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int numt;
		int cht;
		int mat;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu head;
		stu now;
		stu neww;
		stu max;
		int i;
		for (i = 1;i <= n;i++)
		{
				neww =  new stu();
				neww.next = null;
				if (i == 1)
				{
					   head = neww;
					now = neww;
				}
				else
				{
					now.next = neww;
					now = neww;
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					now.num = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					now.ch = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					now.ma = Integer.parseInt(tempVar4);
				}
				now.tot = now.ch + now.ma;
		}
	  for (i = 1;i <= 3;i++)
	  {
		now = head;
		max = now;
		while (now.next != 0)
		{
				  if (max.tot < now.tot)
				  {
					  max = now;
				  }
				  now = now.next;
		}
		System.out.printf("%d %d\n",max.num,max.tot);
		max.tot = -1;
	  }
	  //  scanf("%ld %ld %ld",&now->num,&now->ch,&now->ma);

	return 0;
	}

}

