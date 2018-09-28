package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i = 0;
		int n;
		int tr;
		char b = ',';
		while (b == ',')
		{
			i = i + 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}
		for (i = n;i >= 2;i--)
		{
			if (a[i - 1] != a[i])
			{
				break;
			}
			if (a[i - 1] == a[i] && i == 2)
			{
				System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
			}
		}
		for (i = n;i >= 2;i--)
		{
			if (a[i - 1] < a[i])
			{
				tr = a[i - 1];
				a[i - 1] = a[i];
				a[i] = tr;
			}
		}
		for (i = n;i >= 3;i--)
		{
			if (a[i - 1] < a[i] && a[i] != a[1] || a[i - 1] == a[1])
			{
				tr = a[i - 1];
				a[i - 1] = a[i];
				a[i] = tr;
			}
		}
		System.out.printf("%d",a[2]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	return 0;
	}
}

