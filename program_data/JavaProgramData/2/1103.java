public class book
{
	public int num;
	public String a = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		book head;
		book p;
		book s;
		head = new book();
		head.next = null;
		int n;
		int i;
		int j;
		int[] c = new int[26];
		int max;
		int maxj;
		String b = new String(new char[26]);
		for (j = 0;j < 26;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, 65 + j);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = head;
		for (i = 0;i < n;i++)
		{
			s = new book();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s.a = tempVar3.charAt(0);
			}
			s.next = null;
			p.next = s;
			p = s;
		}
		for (p = head.next;p != null;p = p.next)
		{
			for (i = 0;p.a.charAt(i) != '\0';i++)
			{
				for (j = 0;j < 26;j++)
				{
					if (p.a.charAt(i) == b.charAt(j))
					{
						c[j]++;
					}
				}
			}
		}
	//	for(j=0;j<26;j++)
	  //      printf("%c %d\n",b[j],c[j]);
		max = c[0];
		maxj = 0;
		for (j = 1;j < 26;j++)
		{
			if (c[j] > max)
			{
				max = c[j];
				maxj = j;
			}
		}
		System.out.printf("%c\n",b.charAt(maxj));
		System.out.printf("%d\n",c[maxj]);
		for (p = head.next;p != null;p = p.next)
		{
			for (i = 0;p.a.charAt(i) != '\0';i++)
			{
				if (p.a.charAt(i) == b.charAt(maxj))
				{
					System.out.printf("%d\n",p.num);
				}
			}
		}
	}

}

