public class shu
{
	public int hao;
	public String zuo = new String(new char[26]);
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[26];
		int i;
		int j;
		int[][] b = new int[26][1000];
		int k;
		int max;
		shu p1;
		shu p2;
		shu head = null;
		shu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (shu)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.hao = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.zuo = tempVar3.charAt(0);
		}
		head = p1;
		for (i = 2;i <= m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (shu)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.hao = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.zuo = tempVar5.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		for (i = 0,max = 0;i <= 25;i++)
		{
			for (p = head,k = 1;p != null;p = p.next)
			{
				for (j = 0;j <= 25;j++)
				{
					if (p.zuo.charAt(j) == 'A' + i)
					{
						a[i]++;
						b[i][k] = p.hao;
						k++;
					}
				}
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%c\n%d\n",'A' + i,max);
				for (k = 1;k <= max;k++)
				{
					System.out.printf("%d\n",b[i][k]);
				}
				break;
			}
		}
		return 0;
	}
}

