package <missing>;

public class GlobalMembers
{
	public static int judge(String a, String b)
	{
		int m;
		int n;
		int i = 0;
		int k = 0;
		m = a.length();
		n = b.length();
		while (i + m <= n)
		{
			while (a[k].equals(b[k + i]) && k < m)
			{
				k++;
			}
			if (k == m)
			{
				return i;
			}
			else
			{
				i++;
			}

		}
		return -1;
	}
	public static int Main()
	{
	   String s = new String(new char[50]);
	   String w = new String(new char[50]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   w = tempVar2.charAt(0);
	   }
	   System.out.printf("%d",judge(s, w));
	   return 0;
	}
}

