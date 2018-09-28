package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int[] c = new int[100];
		int k1;
		int k2;
		int[] t1 = new int[100];
		int[] t2 = new int[100];
		int e = 0;
		int i;
		int j;
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
		k1 = a.length();
		k2 = b.length();
		if (k1 != k2)
		{
		System.out.print("NO");
		}
		else if (k1 == k2)
		{
			for (i = 0;i < k1;i++)
			{
				if (t1[i] == 0)
				{
					for (j = 0;j < k1;j++)
					{
						if (t2[j] == 0)
						{
							if (a.charAt(i) == b.charAt(j))
							{
								t1[i] = 1;
								t2[j] = 1;
								break;
							}
						}
					}
				}
			}
			for (i = 0;i < k1;i++)
			{
			e = e + t1[i];
			}
			if (e == k1)
			{
			System.out.print("YES");
			}
			else
			{
			System.out.print("NO");
			}
		}
	}
}

