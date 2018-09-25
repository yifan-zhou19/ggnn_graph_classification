package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int b;
		int c;
		int d;
		int f;
		int g;
		int[] e = new int[1000];
		for (g = 0;g < 1000;g++)
		{
		e[g] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		c = a.length();
		for (b = 0;b < c;b = b + e[b])
		{
		for (d = b;d <= c;d++)
		{
						   if (a.charAt(d) == a.charAt(b) || a.charAt(d) == (a.charAt(b) + 32) || a.charAt(b) == (a.charAt(d) + 32))
						   {
						   e[b]++;
						   }
						   else
						   {
						   break;
						   }
		}
		}
						   for (f = 0;f <= c;f++)
						   {
						   if (e[f] != 0)
						   {
									  if (a.charAt(f) > 'Z')
									  {
									  System.out.printf("(%c,%d)",a.charAt(f) - 32,e[f]);
									  }
									  else
									  {
									  System.out.printf("(%c,%d)",a.charAt(f),e[f]);
									  }
						   }
						   }
	}
}

