package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[123];
		int[] d = new int[123];
		final String b = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		int i = 0;
		int s = 1;
		if (b.length() != c.length())
		{
			s = 0;
		}
		else
		{
		   while (*(b.Substring(i)) != '\0')
		   {
			   a[*(b.Substring(i))] += 1;
			   d[*(c.Substring(i))] += 1;
			   i = i + 1;
		   }
		   for (i = 65;i <= 90;i++)
		   {
			   s = s * (a[i] == d[i]);
		   }
		   for (i = 97;i <= 122;i++)
		   {
			   s = s * (a[i] == d[i]);
		   }
		}
		if (s == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		return 0;
	}
}

