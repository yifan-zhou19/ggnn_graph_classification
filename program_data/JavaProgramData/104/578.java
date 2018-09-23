package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void change(int * p1,int * p2);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		while (a != b)
		{
			if (a > b)
			{
			tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
			tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
				change(tempRef_a, tempRef_b);
				b = tempRef_b.argValue;
				a = tempRef_a.argValue;
			}
			b = b / 2;
		}
		System.out.printf("%d\n",a);
	}

	public static void change(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int temp;
		temp = p1.argValue;
		p1.argValue = p2.argValue;
		p2.argValue = temp;
	}
}

