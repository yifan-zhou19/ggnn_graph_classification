package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int num = 0;
		int[] a = new int[256];
		int[] b = new int[256];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 0;i < c.length();i++)
		{
								 a[c.charAt(i)]++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		for (i = 0;i < c.length();i++)
		{
								 b[c.charAt(i)]++;
		}
		for (i = 0;i < 256;i++)
		{
						   if (a[i] != b[i])
						   {
										  System.out.print("NO\n");
										  break;
						   }
		else
		{
			 num++;
		}
		}
		if (num == 256)
		{
					 System.out.print("YES\n");
		}


		return 0;
	}
}

