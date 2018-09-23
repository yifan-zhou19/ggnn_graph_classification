package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int a;
	 int k;
	 int m;
	 int good = 0;
	 String sz = new String(new char[10000]);
	 char t;
	 int[] d = new int[300];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 sz = tempVar.charAt(0);
	 }
	 k = sz.length() - 1;
	 for (i = 0;sz.charAt(i) != '\0';i++)
	 {
		   int great = 0;
		   if ((64 < sz.charAt(i) && sz.charAt(i) < 91) || (96 < sz.charAt(i) && sz.charAt(i) < 123))
		   {
				good++;
				for (a = 0;a < i;a++)
				{
					if (sz.charAt(a) == sz.charAt(i))
					{
						 d[a]++;
						 great++;
						 break;
					}
				}
				if (great == 0)
				{
				d[i]++;
				}
		   }
	 }
	 if (good == 0)
	 {
	  System.out.print("No");
	 }
	 else
	 {
		 for (;k > 0;k--)
		 {
			 for (i = 0;i < k;i++)
			 {
				 if (sz.charAt(i) > sz.charAt(i + 1))
				 {
					 t = sz.charAt(i);
					 sz = tangible.StringFunctions.changeCharacter(sz, i, sz.charAt(i + 1));
					 sz = tangible.StringFunctions.changeCharacter(sz, i + 1, t);
					 m = d[i];
					 d[i] = d[i + 1];
					 d[i + 1] = m;
				 }
			 }
		 }
		 for (i = 0;sz.charAt(i + 1) != '\0';i++)
		 {
			   if (d[i] != 0)
			   {
				   System.out.printf("%c=%d\n",sz.charAt(i),d[i]);
			   }
		 }
		 k = sz.length() - 1;
		 if (d[k] != 0)
		 {
		 System.out.printf("%c=%d",sz.charAt(k),d[k]);
		 }
	 }
	 return 0;
	}


}

