package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cd = 0;
		int i;
		int a;
		String zm = new String(new char[300]);
		final String fh = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int[] fhd = new int[53];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zm = tempVar.charAt(0);
		}
		for (i = 0;i < 52;i++)
		{
			fhd[i] = 0;
			for (a = 0;a < 300 && zm.charAt(a) != '\0';a++)
			{
				if (zm.charAt(a) == fh.charAt(i))
				{
					fhd[i] = fhd[i] + 1;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (fhd[i] >= 1)
			{
				System.out.printf("%c=%d\n",fh.charAt(i),fhd[i]);
				cd = 1;
			}

		}
		if (cd == 0)
		{
				System.out.print("No");
		}
		return 0;
	}



}

