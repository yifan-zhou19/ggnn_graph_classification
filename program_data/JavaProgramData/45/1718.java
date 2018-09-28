package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int k;
		int j;
		int len;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
	   len = a.length();
	   for (k = 0;k < 50;k++)
	   {
		   if (b.charAt(k) == a.charAt(0))
		   {
			   for (j = k + 1;j <= k + 1 + len;j++)
			   {
				   for (i = 0;i < len;i++)
				   {

					   if (b.charAt(j) == a.charAt(i))
					   {
				   System.out.printf("%d\n",k);
				   break;
					   }
				   }
				   break;
			   }
			   break;
		   }

	   }

		return 0;
	}

}

