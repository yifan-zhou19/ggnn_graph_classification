public class monkey
{
		public int number;
		public int selected;
		public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static void maintoo(int n, int m)
	{
		monkey p1;
		monkey p_this;
		monkey p_next;
		int i;
		p1 = new monkey();
		p_this = p1;
		for (i = 1;i < n;i++)
		{
			p_this.number = i;
			p_this.selected = 1;
			p_next = new monkey();
			p_this.next = p_next;
			p_this = p_next;
		}
		p_this.number = n;
		p_this.selected = 1;
		p_this.next = p1;
		do
		{
			i = 0;
			do
			{
				p_this = p_this.next;
				if (p_this.selected != 0)
				{
					i++;
				}
			} while (i < m);
			p_this.selected = 0;
			n--;
		} while (n > 0);
		System.out.printf("%d\n",p_this.number);
	}
	public static void Main()
	{

		int[] n = new int[20];
		int[] m = new int[20];
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0)
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			maintoo(n[j], m[j]);
		}
	}

}

