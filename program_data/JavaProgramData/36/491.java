package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int z = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (d[j] == 0 && b.charAt(j) == a.charAt(i))
				{
					c[i] = 1;
					d[j] = 1;
					break;
				}
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if (c[i] == 0)
		{
		z = 0;
		break;
		}
		}
		for (j = 0;b.charAt(j) != '\0';j++)
		{
		if (d[j] == 0)
		{
		z = 0;
		break;
		}
		}
		if (z == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

