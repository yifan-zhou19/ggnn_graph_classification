package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] c = new int[26];
		int[] d = new int[26];
		int j;
		int s;
		int t;
		int k;
		String b = new String(new char[26000]);
		char r;
		char max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char author[26];
	//	}
	//	a[999];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].author = tempVar3;
			}
		}
		b = a[0].author;
		for (i = 1;i < n;i++)
		{
			b += a[i].author;
		}
		s = b.length();
		for (r = 'A',j = 0;r <= 'Z',j < 26;r++,j++)
		{
			for (i = 0;i < s;i++)
			{
				if (b.charAt(i) == r)
				{
					c[j]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			d[i] = c[i];
		}
		for (j = 0;j < 25;j++)
		{
			for (i = 0;i < 25 - j;i++)
			{
				if (d[i] < d[i + 1])
				{
				t = d[i];
				d[i] = d[i + 1];
				d[i + 1] = t;
				}
			}
		}
		k = d[0];
		for (i = 0;i < 26;i++)
		{
			if (c[i] == k)
			{
				max = i + 65;
			}
		}
		System.out.printf("%c\n%d\n",max,k);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
			   if (a[i].author[j] == max)
			   {
				   System.out.printf("%d\n",a[i].num);
			   }
			}
		}
	}

}

