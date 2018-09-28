package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]);
		int n;
		int N;
		int i;
		int k = 1;
		int l = 1;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (n = 0;n < N;n++)
		{

			str = new Scanner(System.in).nextLine();
		  len = str.length();
		   if (len == 1)
		   {
		   {
			   if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' || str.charAt(0) == '_')
			   {
				   System.out.print("1\n");
			   }
			   else
			   {
				   System.out.print("0\n");
			   }
	   }
		   }
		   else
		   {
			if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' || str.charAt(0) == '_')
			{
				k = 1;
			}
			else
			{
				k = 0;
			}

			if (k == 1)
			{
				for (i = 1;(str.charAt(i) != '\0');i++)
				{
					if ((str.charAt(i) < 'a' || str.charAt(i)>'z') && (str.charAt(i) < 'A' || str.charAt(i)>'Z') && (str.charAt(i) < '0' || str.charAt(i)>'9') && (str.charAt(i) != '_'))
					{
						l = 0;
						break;
					}
					else
					{
						l = 1;
					}
				}
			}
			if (k == 1 && l == 1)
			{
				System.out.print("1\n");
			}
			if (k == 0 || l == 0)
			{
				System.out.print("0\n");
			}
			System.out.print("\n");
		   }
		}
	}

}

