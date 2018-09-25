package <missing>;

public class GlobalMembers
{
	public static char[][] word = new char[200][41];
	public static void pb(tangible.RefObject<String> a, int p, int t)
	{
		t += a.argValue.length();
		if (t > 80)
		{
		  System.out.print("\n");
		  t = 0;
		  t += a.argValue.length();
		}
		else if (t - a.argValue.length())
		{
		 System.out.print(" ");
		}
		System.out.printf("%s",a.argValue);
		t++;
		if (p != 0)
		{
		pb(word[p - 1], p - 1, t);
		}
	}
	public static int Main()
	{
	  int n;
	  int i;
	  char m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = n - 1;i >= 0; i--)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   word[i] = tempVar2.charAt(0);
	   }
	   System.in.read();
	  }
	  pb(word[n - 1], n - 1, 0);
	 return 0;
	}

}

