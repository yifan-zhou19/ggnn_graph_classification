package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String[] ipa = new String[100];
		int i;
		int j;
		int n;
		int k = 1;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p = a;
		ipa[0] = a.charAt(0);
		for (i = 0;i < n;i++,p++)
		{
			if (*p == ' ')
			{
				ipa[k] = p;
				k++;
			}
		}
		ipa[k] = a.charAt(n);
		for (;k > 1;k--)
		{
		   for (i = 0,p = a;i < n;i++,p++)
		   {
			if (ipa[k] > p && p > ipa[k - 1])
			{
				System.out.printf("%c",*p);
			}
		   }
			System.out.print(" ");
		}
		for (i = 0,p = a;i < n;i++,p++)
		{
			if (ipa[0] <= p && p < ipa[1])
			{
				System.out.printf("%c",*p);
			}
		}
	}

}
