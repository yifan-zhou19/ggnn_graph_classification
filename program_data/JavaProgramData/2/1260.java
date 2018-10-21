public class book
{
		public int num;
	 public String name = new String(new char[27]);
	 public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		book p1;
		book p2;
		book head = null;
		int i;
		int j;
		int n;
		int m;
		int k;
		int[] a = new int[26];
		int max;
		int first;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0;i < m;i++)
		{
		   p1 = new book();
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.num = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p1.name = tempVar3.charAt(0);
		   }
		   if (i == 0)
		   {
			   head = p1;
		   }
		   else
		   {
			   p2.next = p1;
		   }
				p2 = p1;
		}
		p2.next = null;
		p1 = head;
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			n = p1.name.length();
			for (j = 0;j < n;j++)
			{
				k = p1.name.charAt(j) - 'A';
				a[k]++;
			}
			p1 = p1.next;
		}

		max = a[0];
		first = 0;
		for (k = 1;k < 26;k++)
		{
			if (a[k] > max)
			{
				max = a[k];
					  first = k;
			}
		}
		System.out.printf("%c\n",'A' + first);
		System.out.printf("%d\n",max);


		p1 = head;
		for (i = 0;i < m;i++)
		{
			n = p1.name.length();
			for (j = 0;j < n;j++)
			{
				if (p1.name.charAt(j) == 'A' + first)
				{
					System.out.printf("%d\n",p1.num);
											break;
				}
			}
		p1 = p1.next;
		}
	}








}

