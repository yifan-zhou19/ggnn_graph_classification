package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		int i;
		int j;
		int t;
		int k;
		int l;
		int t1;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			t = a.charAt(i);
			if (t == 32)
			{
				System.out.printf("%d",i);
				k = i;
				break;
			}
		}
	   if (i == l)
	   {
				System.out.printf("%d",i);
	   }
	   else
	   {
		for (j = i + 1;j < l;j++)
		{
			t = a.charAt(j);
			t1 = a.charAt(j - 1);
			if (t == 32 && t1 != 32)
			{
				System.out.printf(",%d",j - k - 1);
				k = j;
			}
			if (t == 32 && t1 == 32)
			{
				k = j;
			}
		if (j == l - 1)
		{
				System.out.printf(",%d",j - k);
		}

		}
	   }

		return 0;
	}
}
