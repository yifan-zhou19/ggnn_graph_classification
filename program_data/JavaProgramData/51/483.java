package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	 String a = new String(new char[500]);
	 char[][] b = new char[250][5];
	 String c = new String(new char[5]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 int i;
	 int j;
	 int r;
	 int[] k = new int[250];
	 int t;
	 int p = 0;
	 r = a.length();
	 for (i = 0;i <= r - n;i++)
	 {
		 for (j = 0;j <= n - 1;j++)
		 {
		   c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j + i));
		 }
	   c = c.substring(0, n);
	  for (t = 0;;t++)
	  {
		  if (strcmp(c,b[t]) == 0)
		  {
			  k[t]++;
			  break;
		  }
	   else if (t == p)
	   {
		   b[t] = c;
		   k[t] = 1;
		   p++;
		   break;
	   }
	  }
	 }
	int o = 0;
	for (i = 0;i <= p - 1;i++)
	{
		if (k[i] > k[o])
		{
			o = i;
		}
	}
	if (k[o] == 1)
	{
		System.out.print("NO");
	}
	else
	{
	System.out.printf("%d\n",k[o]);
	for (i = 0;i <= p - 1;i++)
	{
	if (k[i] == k[o])
	{
		System.out.println(b[i]);
	}
	}
	}
	}


}

