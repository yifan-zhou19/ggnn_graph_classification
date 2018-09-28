package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int t;
		int q;
		int k;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[i]))
		{
		i++;
		}
		if (i == 1)
		{
		System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
		}
		else
		{
		for (q = 0;q < i - 1;q++)
		{
		for (j = 0;j < i - q - 1;j++)
		{
		if (a[j] < a[j + 1])
		{
			t = a[j];
			a[j] = a[j + 1];
			a[j + 1] = t;
		}
		}
		}
		}
		for (k = 0;k < i;k++)
		{
		if (a[k] == a[k + 1] && k != (i - 1))
		{
		x++;
		}
		else
		{
		if (k == (i - 1))
		{
		System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end;
		}
		else
		{
		break;
		}
		}
		}
		System.out.printf("%d",a[x]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}

}

