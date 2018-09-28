package <missing>;

public class GlobalMembers
{
	public static int judge(String x)
	{
		int i;
		int len;
		int k;
		len = x.length();
		k = 0;
		if ((x[0].compareTo('a') >= 0 && x[0].compareTo('z') <= 0) || (x[0].compareTo('A') >= 0 && x[0].compareTo('Z') <= 0) || (x[0].equals('_')))
		{
		   for (i = 0;i < len;i++)
		   {
			   if ((x[i].compareTo('a') >= 0 && x[i].compareTo('z') <= 0) || (x[i].compareTo('A') >= 0 && x[i].compareTo('Z') <= 0) || (x[i].compareTo('0') >= 0 && x[i].compareTo('9') <= 0) || (x[i].equals('_')))
			   {
				   k = k + 0;
			   }
			   else
			   {
				   k++;
			   }
		   }
			if (k == 0)
			{
				return 1;
			}
			if (k != 0)
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int p;
		int i;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		   p = judge(a);
		   if (p == 0)
		   {
			   System.out.print("no\n");
		   }
		   if (p == 1)
		   {
			   System.out.print("yes\n");
		   }
		}
	}
}

