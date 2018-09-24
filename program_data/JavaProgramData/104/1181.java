package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int countx;
		int county;
		int c;
		int p;
		int q;
		int[] a = new int[11];
		int[] b = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		countx = 1;
		county = 1;
		c = 0;
		p = x;
		q = y;
		while (p != 1)
		{
			countx++;
			p = p / 2;
		}
			while (q != 1)
			{
			county++;
			q = q / 2;
			}
			for (i = countx;i >= 1;i--)
			{
				a[i] = x;
				x = x / 2;
			}
			for (i = county;i >= 1;i--)
			{
				b[i] = y;
				y = y / 2;
			}
			for (i = 1;i <= 10;i++)
			{
				if (a[i] == b[i] && a[i] != 0 && b[i] != 0)
				{
					c = a[i];
				}
				else
				{
					break;
				}
			}
		System.out.printf("%d",c);
	}
	/*int days(int month,int day)
	{
		int z=0;
		int k;
		if (month==1) z=day;
		else
		{
			for(k=1;k<month;k++)
			{
				if(k==1||k==3||k==5||k==7||k==8||k==10||k==12) z+=31;
				else if (k==2) z+=28;
				else z+=30;
			}
			z+=day;
		}
		return z;
	}*/
}

