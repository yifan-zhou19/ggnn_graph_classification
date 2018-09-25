package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		if (a.charAt(1) == '\0' || (a.charAt(2) == '\0' && (10 * (a.charAt(0) - '0') + a.charAt(1) - '0' < 13)))
		{
			System.out.printf("%d\n",t);
		System.out.printf("%s",a);
		}
		else
		{
			b[1] = (10 * (a.charAt(0) - '0') + 1 * (a.charAt(1) - '0')) % 13;
		c[1] = (10 * (a.charAt(0) - '0') + 1 * (a.charAt(1) - '0')) / 13;
		for (i = 2,j = 2;i <= 100;)
		{
			if (a.charAt(i) != '\0')
			{
					 b[j] = (10 * b[j - 1] + a.charAt(i) - '0') % 13;
					 c[j] = (int)((10 * b[j - 1] + a.charAt(i) - '0') / 13);
					 i = i + 1;
					 j = j + 1;
			}
					 else
					 {
					 break;
					 }
		}

					if (c[1] != 0)
					{
					System.out.printf("%d",c[1]);
					}
					for (k = 2;k <= j - 1;k++)
					{
									   System.out.printf("%d",c[k]);
					}
					 System.out.print("\n");
					System.out.printf("%d",b[j - 1]);
		}
					System.in.read();
					System.in.read();
	}

}

