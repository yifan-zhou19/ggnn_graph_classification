package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char num[11];
	//		int age;
	//	};
		p[] c = tangible.Arrays.initializeWithDefaultpInstances(101);
		int n;
		int i;
		int t = 0;
		int s;
		int h;
		int l = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] d = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[i].num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i].age = tempVar3;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i].age >= 60)
			{
				a[t] = c[i].age;
				c[i].age = 0;
				b[t] = i;
				t++;
			}
		}
		if (t > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			leap:
			s = a[0];
			h = 0;
			for (i = 0;i < t;i++)
			{
				if (a[i] > s)
				{
					s = a[i];
					h = i;
				}
			}
			System.out.printf("%s\n",c[b[h]].num);
			l++;
			a[h] = 0;
			if (l < t)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto leap;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i].age != 0)
			{
			System.out.printf("%s\n",c[i].num);
			}
		}
	}
}

