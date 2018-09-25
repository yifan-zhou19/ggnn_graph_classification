public class zuozhe
{
	public int num;
public String ren = new String(new char[26]);
public zuozhe next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;
	public static int m;
	public static zuozhe ap()
	{
		zuozhe head;
		zuozhe nw;
		zuozhe tn;
		do
		{
			nw = new zuozhe();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				nw.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nw.ren = tempVar2.charAt(0);
			}
			if (n == 1)
			{
				head = nw;
				tn = head;
			}
			else
			{
				tn.next = nw;
			}
			if (n <= m)
			{
				tn = nw;
				n++;
			}
		}while (n <= m);
		tn.next = null;
		return head;
	}
	public static int Main()
	{
		int i;
		int max = 0;
		int[] a = new int[26];
		int j;
		int w;
		int l;
		char z;
		zuozhe head;
		zuozhe p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = ap();
		p = head;
		for (;p != null;p = p.next)
		{
			l = p.ren.length();
			for (i = 0;i < l;i++)
			{
				j = p.ren.charAt (i) - 65;
				a[j]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				w = i;
			}
		}
		z = 65 + w;
		System.out.printf("%c\n%d\n",z,max);
		p = head;
		for (;p != null;p = p.next)
		{
			l = p.ren.length();
			for (i = 0;i < l;i++)
			{
				if (p.ren.charAt (i) == z)
				{
					System.out.printf("%d\n",p.num);
					break;
				}
			}
		}
	}
}

