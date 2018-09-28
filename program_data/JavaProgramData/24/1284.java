package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int j;
	   int i;
	   int[] a = new int[100];
	   int e;
	   String zf1 = new String(new char[100]);
	   final String zf2 = "\0";
	   char[][] zf = new char[100][100];
	   for (i = 0;i < 50;i++)
	   {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				zf[i] = tempVar.charAt(0);
			}
			a[i] = String.valueOf(zf[i]).length();
	   }
	   n = i - 1;
	   for (j = 0;j < 49;j++)
	   {
			for (i = 0;i < 49 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					zf1 = zf[i + 1];
					zf[i + 1] = zf[i];
					zf[i] = zf1;
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
				}
			}
	   }
	   System.out.printf("%s\n%s",zf[49],zf[0]);
	   for (i = 0;i < 49;i++)
	   {
		   if (strcmp(zf[i],zf2) != 0)
		   {
			   System.out.printf("%s",zf[i]);
			   break;
		   }
	   }
	   return 0;
	}

}

