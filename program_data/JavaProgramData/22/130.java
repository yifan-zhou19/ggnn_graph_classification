package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int c;
		c = p1.argValue;
		p1.argValue = p2.argValue;
		p2.argValue = c;
	}

	public static void paixu(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (*(p.argValue + j) < *(p.argValue + j + 1))
				{
					swap(p.argValue + j, p.argValue + j + 1);
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[1000];
		for (i = 0;;i++)
		{
		if (EOF == scanf("%d,", a[i]))
		{
			break;
		}
		}
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		paixu(tempRef_a, i);
		a = tempRef_a.argValue;
		for (j = 0;j < i - 1;j++)
		{
			if (a[j + 1] < a[j])
			{
		System.out.printf("%d",a[j + 1]);
		break;
			}
		}
		if (j == i - 1)
		{
			System.out.print("No");
		}



	}

}

