package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[26];
		int flag;
		int len;
		String ch = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < t;k++)
		{
			 ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 flag = 0;
			 len = ch.length();
			 for (i = 0;i < 26;i++)
			 {
				 a[i] = 0;
			 }
			  for (i = 0;i < len;i++)
			  {
				 j = ch.charAt(i) - 'a';
				  a[j]++;
			  }
			  for (i = 0;i < 26;i++)
			  {
					 if (a[i] == 1)
					 {
						 flag = 1;
					 }
			  }
			   if (flag == 0)
			   {
				   System.out.print("no");
				   System.out.print("\n");
			   }
			   else
			   {
					 for (i = 0;i < len;i++)
					 {
						j = ch.charAt(i) - 'a';
						if (a[j] == 1)
						{
							System.out.print(ch.charAt(i));
							System.out.print("\n");
							break;
						}

					 }
			   }

		}
	return 0;
	}



}

