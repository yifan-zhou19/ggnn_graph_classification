package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int[] b = new int[100000];
		int n;
		int i;
		int j;
		int k;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }

			for (j = 0;a.charAt(j);j++)
			{

				c = 0;
				for (k = 0;a.charAt(k);k++)
				{
					if (a.charAt(k) == a.charAt(j))
					{
					c++;
					}
				}
				b[j] = c;
			}
			d = -1;
			for (k = 0;a.charAt(k);k++)
			{
				if (b[k] == 1)
				{
					System.out.printf("%c\n",a.charAt(k));
					d++;
					break;
				}
			}
			if (d != 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

