package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   int k;
	   int m;
	   int j;
	   int tag = 1;
	   int jieshu = 1;
	   String zfc = new String(new char[257]);
	   String dth = new String(new char[257]);
	   String bth = new String(new char[257]);
	   String danci = new String(new char[257]);
	   int zhyw = 0;
		zfc = new Scanner(System.in).nextLine();
		dth = new Scanner(System.in).nextLine();
		bth = new Scanner(System.in).nextLine();
		n = zfc.length();
		m = dth.length();
	  for (i = 0;i < n;i++)
	  {
			if (zfc.charAt(i) == dth.charAt(0))
			{
				 for (k = 1;k < m;k++)
				 {
				   if (zfc.charAt(i + k) != dth.charAt(k))
				   {
					   tag = 0;
				   }
				 }
				 if (tag != 0)
				 {
					System.out.printf("%s",bth);
					for (j = i + m;j < n;j++)
					{
					  System.out.printf("%c",zfc.charAt(j));
					}
					jieshu = 0;

				 }
				  tag = 1;
			}
			if (jieshu != 0)
			{
				  System.out.printf("%c",zfc.charAt(i));

			}
			if (jieshu == 0)
			{
			 break;
			}
	  }

		 return 0;
	}


}
