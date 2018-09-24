package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int ka = a.length();
			int kb = b.length();

			int[] aa = new int[100];
			int[] bb = new int[100];
			int[] c = new int[100];
			int j;
			for (j = 0;j < ka;j++)
			{
				aa[j] = a.charAt(ka - 1 - j) - '0';
			}
			for (j = 0;j < kb;j++)
			{
				bb[j] = b.charAt(kb - 1 - j) - '0';
			}

			for (j = 0;j < ka;j++)
			{
				if (aa[j] >= bb[j])
				{
				c[j] = aa[j] - bb[j];
				}
				else
				{
					c[j] = aa[j] - bb[j] + 10;
					aa[j + 1] = aa[j + 1] - 1;
				}

			}
			if (c[ka - 1] != 0)
			{
				System.out.printf("%d",c[ka - 1]);
			}
			for (j = ka - 2;j >= 0;j--)
			{


				System.out.printf("%d",c[j]);
			}
			System.out.print("\n");
		}

	}
}

