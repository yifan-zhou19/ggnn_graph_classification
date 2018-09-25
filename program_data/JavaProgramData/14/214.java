public class stu
{
	public int id;
	public int Chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static void Main()
	{
		int n;
		int i;
		int first;
		int second;
		int third;
		int h1 = 0;
		int h2 = 0;
		int h3 = 0;
		int e;
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
				a[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].Chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
		}
		first = 0;
		second = 0;
		third = 0;
		for (i = 0;i < n;i++)
		{
			if (first < (a[i].Chinese + a[i].math))
			{
				third = second;
				h3 = h2;
				second = first;
				h2 = h1;
				first = a[i].Chinese + a[i].math;
				h1 = a[i].id;
			}
			else if (first == (a[i].Chinese + a[i].math) && first > second)
			{
				third = second;
				h3 = h2;
				h2 = a[i].id;
				second = a[i].Chinese + a[i].math;
			}
			else if (first == (a[i].Chinese + a[i].math) && first == second && second > third)
			{
				third = a[i].Chinese + a[i].math;
				h3 = a[i].id;
			}
			else if (first > (a[i].Chinese + a[i].math) && second < (a[i].Chinese + a[i].math))
			{
				third = second;
				h3 = h2;
				second = a[i].Chinese + a[i].math;
				h2 = a[i].id;
			}
			else if (second > (a[i].Chinese + a[i].math) && third < (a[i].Chinese + a[i].math))
			{
				third = a[i].Chinese + a[i].math;
				h3 = a[i].id;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",h1,first,h2,second,h3,third);
	}
}

