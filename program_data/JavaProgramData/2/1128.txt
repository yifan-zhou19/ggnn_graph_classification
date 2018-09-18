package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ts
	//	{
	//		int sl;
	//		char zz[30];
	////		int zzsl;
	//		struct ts *next;
	//	};
		ts p1;
		ts p2;
		ts head;
		int i;
		int j;
		int k;
		int m;
		int n;
		int max;
		int zzzdnum;
		int[] num = new int[100];
		char zzzd; //??�????�^^
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = p2 = head = new ts();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.sl = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.zz = tempVar3;
		}
	//	p1->zzsl=strlen(p1->zz);//?????
		for (i = 1;i < n;i++)
		{
			p1 = new ts();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.sl = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.zz = tempVar5;
			}
	//		p1->zzsl=strlen(p1->zz);
			p2.next = p1;
			p2 = p1;
		}
		p1.next = 0; //??NULL???????
		for (i = 'A';i <= 'Z';i++)
		{
			p1 = head;
			for (k = 0;k < n;k++)
			{
				for (j = 0;p1.zz[j] != '\0';j++)
				{
					if (p1.zz[j] == i)
					{
						num[i]++;
					}
				}
				p1 = p1.next;
			}
		}
		max = 0;
		for (i = 'A';i <= 'Z';i++)
		{
			max = max > num[i] != 0?max:num[i]; //?????????
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (num[i] == max)
			{
				zzzd = i; //????????
			}
		}
		System.out.printf("%c\n%d\n",zzzd,max);
		p1 = head;
	//zzdnum=0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;p1.zz[j] != '\0';j++)
			{
				if (p1.zz[j] == zzzd) //?????????
				{
					System.out.printf("%d\n",p1.sl);
				}
			}
			p1 = p1.next;
		}
	}


}

