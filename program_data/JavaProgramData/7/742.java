package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String zf1 = new String(new char[257]);
	   String zf2 = new String(new char[257]);
	   String zf3 = new String(new char[257]);
	   int len1;
	   int len2;
	   int len3;
	   int i;
	   int k;
	   int t;
	   int m;
	   int fa = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   zf1 = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   zf2 = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   zf3 = tempVar3.charAt(0);
	   }
	   len1 = zf1.length();
	   len2 = zf2.length();
	   len3 = zf3.length();
	   for (i = 0;i < len1;i++)
	   {
		   for (k = 0;k < len2;k++)
		   {
			   if (zf2.charAt(k) != zf1.charAt(i + k))
			   {
					t = 0;
					break;
			   }
				else
				{
					t++;
				}
		   }
		   if (t == len2)
		   {
			   m = i;
			   fa = 1;
		   }
			if (fa == 1)
			{
			 break;
			}
	   }
	   if (fa == 1)
	   {
		for (i = 0;i < m;i++)
		{
		 System.out.printf("%c",zf1.charAt(i));
		}
		System.out.printf("%s",zf3);
		for (i = m + len2;i < len1;i++)
		{
		 System.out.printf("%c",zf1.charAt(i));
		}
	   }
	   if (fa == 0)
	   {
		   System.out.printf("%s",zf1);
	   }
	   return 0;
	}



}

