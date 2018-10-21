package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] a = {""};
		final String b = "";
		final String c = "";
		int i;
		int num = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			num = num + 1;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		for (i = 0;i < num;i++)
		{
			if (strcmp(a[i],b) == 0)
			{
				a[i] = c;
			}
		}
		System.out.printf("%s",a[0]);
		for (i = 1;i < num;i++)
		{
			System.out.printf(" %s",a[i]);
		}
	}
}

