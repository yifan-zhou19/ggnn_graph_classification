package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int le = str.length();
		int p;
		int q;

			for (int k = 1;k <= le-1;k++)
			{
				for (int i = 0;i <= le-2 && i + k <= le-1;i++)
				{
				int flag = 1;



				 for (p = i,q = i + k;p < q;p++,q--)
				 {
				   if (str.charAt(p) != str.charAt(q))
				   {
					 flag = 0;
					 break;
				   }
				 }
							   if (flag == 1)
							   {
								for (int m = i;m <= i + k;m++)
								{
								 System.out.print(str.charAt(m));
								}
							   System.out.print("\n");
							   }
				  if (flag == 0)
				  {
					  continue;
				  }
				}
			}
		return 0;
	}

}

