package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		char q;
		int n;
		int i;
		int l;
		int k;
		int r;
		int t;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ch = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{

			ch = new Scanner(System.in).nextLine();
			r = ch.length();
			l = ch.charAt(0);
			if ((l >= 65 && l <= 90) || (l == 95) || (l <= 122 && l >= 97))
			{
				a[i - 1] = 1;
			}
			else
			{
				a[i - 1] = 0;
			}
		 for (t = 1;t <= r - 1;t++)
		 {
			if ((ch.charAt(t) <= 64 && ch.charAt(t) >= 58) || (ch.charAt(t) >= 91 && ch.charAt(t) <= 94) || (ch.charAt(t) == 96) || (ch.charAt(t) >= 123) || (ch.charAt(t) <= 47))
			{
				a[i - 1] = 0;
			}

		 }


		}
	   for (k = 1;k <= n;k++)
	   {
		   System.out.printf("%d\n",a[k - 1]);
	   }
	   return 0;
	}

}

