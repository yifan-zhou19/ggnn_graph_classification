package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int w;
		int[] c = new int[2];
		int i;
		int j;
		int max;
		int total;
		int no;
		char a1;
		char a2;
		String s = new String(new char[20]);
		String t = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		total = 0;
		max = 0;
		for (i = 0;i < n;i++)
		{
			w = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				no = Integer.parseInt(tempVar7);
			}
			if (c[0] > 80 && no > 0)
			{
				w = w + 8000;
			}
			if (c[0] > 85 && c[1] > 80)
			{
				w = w + 4000;
			}
			if (c[0] > 90)
			{
				w = w + 2000;
			}
			if (c[0] > 85 && a2 == 'Y')
			{
				w = w + 1000;
			}
			if (c[1] > 80 && a1 == 'Y')
			{
				w = w + 850;
			}
			total = total + w;
			if (w > max)
			{
				max = w;
				t = s;
			}
		}
		System.out.printf("%s\n%d\n%d\n",t,max,total);
	}
}

