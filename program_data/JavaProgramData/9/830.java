package <missing>;

public class GlobalMembers
{
	public static char[][] id = new char[101][11];

	public static int Main()
	{
		int n;
		int[] age = new int[101];
		int[] a = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			int j = i;
			if (age[i] >= 60)
			{
			   for (;j > 1 && age[a[j - 1]] < age[i];j--)
			   {
			   a[j] = a[j - 1];
			   }
			}
			a[j] = i;
		}
		for (int i = 1;i <= n;i++)
		{
		System.out.printf("%s\n",id[a[i]]);
		}
		System.in.read();
		System.in.read();
		return 0;

	}

}

