package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int changdu;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String gram = new String(new char[501]);
	 String bijiao = new String(new char[500]);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 gram = tempVar2.charAt(0);
	 }
	 changdu = gram.length();
	 int[] paohui = new int[500];
	 for (int i = 0;i < changdu - (n - 1);i++)
	 {
	  for (int r = 0;r < n;r++)
	  {
	   bijiao = tangible.StringFunctions.changeCharacter(bijiao, r, gram.charAt(i + r));
	  }
	  if (paohui[i] != 0)
	  {
	   continue;
	  }
	  else
	  {
	   for (int r = i;r < changdu - (n - 1);r++)
	   {
		   for (int q = 0;q < n + 1;q++)
		   {
			if (q == n)
			{
			 paohui[r]++;
		  paohui[i]++;
		  if (r == i)
		  {
		   paohui[i]--;
		  }
		  break;
			}
			else
			{
			 if (bijiao.charAt(q) != gram.charAt(r + q))
			 {
			  break;
			 }
			}
		   }
	   }
	  }
	 }
	 int[] zuiduo = new int[500];
	 int cishu = 0;
	 int jige = 0;
	 for (int m = 0;m < changdu - (n - 1);m++)
	 {
	  if (cishu == paohui[m])
	  {
	   zuiduo[jige] = m;
	   jige++;
	  }
	  if (cishu < paohui[m])
	  {
	   jige = 0;
	   zuiduo[jige] = m;
	   jige++;
	   cishu = paohui[m];
	  }
	 }
	 if (cishu == 1)
	 {
	  System.out.print("NO\n");
	 }
	 else
	 {
	  System.out.printf("%d\n",cishu);
	  for (int i = 0;i < jige;i++)
	  {
	   for (int r = 0;r < n;r++)
	   {
		System.out.printf("%c",gram.charAt(zuiduo[i] + r));
	   }
	   System.out.print("\n");
	  }
	 }
	 return 0;
	}
}

