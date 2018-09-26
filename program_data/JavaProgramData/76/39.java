package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int flag;
		int aright;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int l;
	//		int r;
	//	}
	//	qj[50001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qj[i].l = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qj[i].r = tempVar3;
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (qj[j].l > qj[j + 1].l)
				{
					t = qj[j].l;
					qj[j].l = qj[j + 1].l;
					qj[j + 1].l = t;
					t = qj[j].r;
					qj[j].r = qj[j + 1].r;
					qj[j + 1].r = t;
				}
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (qj[j].l == qj[j + 1].l && qj[j].r > qj[j + 1].r)
				{
					t = qj[j].r;
					qj[j].r = qj[j + 1].r;
					qj[j + 1].r = t;
				}
			}
		}
		flag = 1;
		aright = qj[0].r;
		j = 1;
		do
		{
			if (j == n)
			{
				flag == 1;
				break;
			}
			if (aright < qj[j].l)
			{
				flag = 0;
				break;
			}
			else if (aright >= qj[j].l && aright < qj[j].r)
			{
				aright = qj[j].r;
				j++;
			}
			else
			{
				j++;
			}
		}while (1 != 0);
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",qj[0].l,aright);
		}
		return 0;
	}



}

