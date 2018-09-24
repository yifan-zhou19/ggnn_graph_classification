public class inf
{
	public int num;
	public String wri = new String(new char[27]);
	public inf next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] time = new int[26];
		//for(i=0;i<26;i++)
	//	printf("%d",time[i]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pn;
		inf head;
		inf p1;
		inf p0;
		inf p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = head = new inf();
		for (i = 0;i < n;i++)
		{
			p0 = new inf();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p0.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p0.wri = tempVar3.charAt(0);
			}
			p0.next = null;
			p1.next = p0;
			p1 = p0;
			pn = p0.wri;
			while (*pn != '\0')
			{
				time[*pn - 65]++;
				pn = pn + 1;
			}
		}

		int max = 0;
		int k;
		for (i = 0;i < 26;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",k + 65,max);
		p = head;
		while (p != null)
		{

			pn = p.wri;
			while (*pn != '\0')
			{
				if (*pn == k + 65)
				{
					System.out.printf("%d\n",p.num);
					break;
				}
				pn = pn + 1;
			}
			p = p.next;
		}


	//	printf("%d",p->num);


	}
}

