package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int i;
	int m;
	int k;
	int r;
	int[] d = new int[30];
	int x;
	char z;
	String s = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s = tempVar2.charAt(0);
	  }
	  r = 0;
	  for (z = 'a';z <= 'z';z++)
	  {
		m = 0;
		for (i = 0;i < s.length();i++)
		{
		  if (s.charAt(i) == z)
		  {
			k = i;
			m++;
		  }
		}
		if (m == 1)
		{
		  d[r] = k;
		  r++;
		}
	  }
	  if (r == 0)
	  {
		  System.out.print("no\n");
	  }
	  else if (r > 0)
	  {
	  x = d[0];
	  for (i = 0;i < r;i++)
	  {
		if (d[i] < x)
		{
			x = d[i];
		}
	  }
	  System.out.printf("%c\n",s.charAt(x));
	  }
	}
	return 0;
	}
}

