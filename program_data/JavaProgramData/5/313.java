package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[2][500];
		int[] len = new int[2];
		int i;
		int j;
		int o;
		int W;
		int l;
		double n;
		double p;
		W = 0;
		l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		System.in.read();
		for (i = 0;i < 2;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = tempVar2.charAt(0);
						 }
						 len[i] = String.valueOf(a[i]).length();
						 for (j = 0;j < len[i];j++)
						 {
											   if (a[i][j] != 'A' && a[i][j] != 'T' && a[i][j] != 'C' && a[i][j] != 'G')
											   {
																								  W++;
											   }
						 }
		}
		if (len[0] != len[1] || W != 0)
		{
								 System.out.print("error");
								 return 0;
		}
		else
		{
			 for (j = 0;j < len[0];j++)
			 {
								   if (a[0][j] == a[1][j])
								   {
														l++;
								   }
			 }
		}
		p = 1.0 * l / len[0];
		if (p > n)
		{
				System.out.print("yes");
		}
				else
				{
					  System.out.print("no");
				}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		o = Integer.parseInt(tempVar3);
	}
	return 0;
	}

}

