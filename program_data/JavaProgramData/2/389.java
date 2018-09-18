public class index
{
	public int num;
	public String wr = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pr;
		int max;
		String s = new String(new char[26]);
		String sp;
		String pt;
		char temp;
		for (pr = a;pr < a + 26;pr++)
		{
			*pr = 0;
		}
		sp = s;
		sp = 65;
		for (sp = s.Substring(1);sp < s.Substring(26);sp++)
		{
			sp = *(sp - 1) + 1;
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		index * p = new index();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		index ind = (index)malloc(sizeof(index) * n);
		for (p = ind;p < ind + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.wr = tempVar3.charAt(0);
			}
		}
		for (p = ind;p < ind + n;p++)
		{
			for (pt = p.wr;pt < p.wr.Substring(26);pt++)
			{
				for (pr = a,sp = s;sp < s.Substring(26);sp++,pr++)
				{
					if (pt == sp)
					{
						(*pr)++;
					}
				}
			}
		}
		max = a[0];
		temp = 65;
		for (pr = a,sp = s;pr < a + 26;pr++,sp++)
		{
			if (*pr > max)
			{
				max = pr;
				temp = sp;
			}
		}
		for (pr = a,sp = s;sp < s.Substring(26);sp++,pr++)
		{
			if (*pr == max)
			{
				System.out.printf("%c\n%d\n", sp,*pr);
			}
		}
		for (p = ind;p < ind + n;p++)
		{
			for (pt = p.wr;pt < p.wr.Substring(26);pt++)
			{
				if (pt == temp)
				{
					System.out.printf("%d\n",p.num);
				}
			}
		}
		ind = null;
		return 0;
	}
}

