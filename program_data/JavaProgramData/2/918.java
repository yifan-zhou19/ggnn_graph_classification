public class book
{
	public int num;
public String a = new String(new char[27]);
public int y;
public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		int num;
		int max;
	book p1;
	book p2;
	book p;
	book head;
	int[] c = new int[26];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	head = p1 = p2 = Z;
	for (i = 0;i < n;i++)
	{
		p2.next = p1;
	p2 = p1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p2.num = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p2.a = tempVar3.charAt(0);
	}
	num = p2.a.length();
	for (j = 0;j < num;j++)
	{
	c[*(p2.a.Substring(j)) - 65]++;
	}
	p1 = Z;
	}
	p2.next = null;

	max = 0;
	for (i = 0;i < 26;i++)
	{
	if (c[i] > c[max])
	{
	max = i;
	}
	}
	max = max + 65;
	p = head;
	for (i = 0;i < n;i++)
	{
		num = p.a.length();
	for (j = 0;j < num;j++)
	{
	if (*(p.a.Substring(j)) == max)
	{
	break;
	}
	}
	if (j == num)
	{
	p.y = 0;
	}
	else
	{
		p.y = 1;
		m++;
	}
	p = p.next;
	}
	p = head;
	System.out.printf("%c\n%d\n",max,m);
	for (i = 0;i < n;i++)
	{
		if (p.y == 1)
		{
	System.out.printf("%d\n",p.num);
		}
	p = p.next;
	}
	}


}

