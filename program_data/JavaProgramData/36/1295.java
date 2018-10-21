package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(String)a - (String)b;
	}
	public static int Main()
	{
		int sum;
	final String a = "";
	final String b = "";


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		qsort(a,a.length(),(Character.SIZE / Byte.SIZE),compare);
		qsort(b,b.length(),(Character.SIZE / Byte.SIZE),compare);
		sum = 0;
		if (strcmp(a,b) != 0)
		{
				sum = sum + 1;
		}

		if (sum > 0)
		{
			System.out.print("NO");
		}
		if (sum == 0)
		{
			System.out.print("YES");
		}

		return 0;
	}
}

