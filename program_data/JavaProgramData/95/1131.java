package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int len = 0;
		String str1 = new String(new char[30]);
		String str2 = new String(new char[30]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len = str1.length();
		k = 0;
		while (k >= 0)
		{
			n = str1.charAt(k) - str2.charAt(k);
			k++;

			if (n == -32)
			{
				continue;
			}
			if (n == 32)
			{
				continue;
			}
			if (n > 32)
			{
				System.out.print(">");
				break;
			}
			if (n < -32)
			{
				System.out.print("<");
				break;
			}
					  if (n < 0)
					  {
								System.out.print(">");
				break;
					  }
					   if (n > 0)
					   {
								System.out.print("<");
				break;
					   }


			if (k == len)
			{
				System.out.print("=");
				break;
			}
		}
	}


}
