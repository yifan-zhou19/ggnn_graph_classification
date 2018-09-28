package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		double n = 0;
		double biao;
		double l = 1;
		double len;
		char[][] shuzu = new char[3][501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			biao = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[i] = tempVar2.charAt(0);
			}
		}
		len = 1.0 * String.valueOf(shuzu[0]).length();
		 if (String.valueOf(shuzu[0]).length() - String.valueOf(shuzu[1]).length())
		 {
				System.out.print("error");
		 }
		 else
		 {
			 for (i = 0;i < len;i++)
			 {
				 if (!((shuzu[0][i] == 'A' || shuzu[0][i] == 'G' || shuzu[0][i] == 'C' || shuzu[0][i] == 'T') && (shuzu[1][i] == 'A' || shuzu[1][i] == 'G' || shuzu[1][i] == 'C' || shuzu[1][i] == 'T')))
				 {
					   l = 0;
				 }
				 if (shuzu[0][i] == shuzu[1][i])
				 {
					   n++;
				 }
			 }
			if (l.getValue() != 0)
			{
			   if ((n / len) > biao)
			   {
				   System.out.print("yes");
			   }
			   else
			   {
				   System.out.print("no");
			   }

			}
			else
			{
			   System.out.print("error");
			}
		 }
		return 0;
	}
}

