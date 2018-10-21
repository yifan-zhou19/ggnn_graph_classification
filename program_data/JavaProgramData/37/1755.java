package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000000]);
		 int[] b = new int[50000];
		 int t;
		 int i;
		 int j;
		 int k;
		 int n;
		 int l;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < t;i++)
		 {
		   for (j = 0;j < 50000;j++)
		   {
			   b[j] = 0;
		   a = a.substring(0, j);
		   }
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();

		   for (k = 0;k < l;k++)
		   {
			   for (n = 0;n < l;n++)
			   {
				if (a.charAt(k) == a.charAt(n))
				{
				b[k]++;
				}
			   }
			 if (b[k] == 1)
			 {
				 System.out.printf("%c\n",a.charAt(k));
			 break;
			 }
			if (k == l - 1)
			{
			System.out.print("no\n");
			}
		   }
		 }

		return 0;
	}
}

